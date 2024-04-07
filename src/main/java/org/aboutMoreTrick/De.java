package org.aboutMoreTrick;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;
/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/4/1
 * @description 描述该类功能
 */
public class De {
    public static void main(String[] args) {
        //extracted();
        ee();
    }

    private static void extracted() {
        String payTitlesJson = "{\"1\":\"姓名\",\"2\":\"加班工资\",\"3\":\"高温津贴\",\"4\":\"行车安全奖\",\"5\":\"其他津补贴\",\"6\":\"月度绩效工资\",\"7\":\"基本工资\",\"8\":\"代扣企业年金\",\"9\":\"代扣住房公积金\",\"10\":\"代扣失业保险\",\"11\":\"代扣医疗保险\",\"12\":\"代扣养老保险\",\"13\":\"应发工资\",\"14\":\"累计个人养老金\",\"15\":\"累计婴幼儿照护费用\",\"16\":\"按年扣除标识\",\"17\":\"累计继续教育\",\"18\":\"累计住房租金\",\"19\":\"累计住房贷款利息\",\"20\":\"累计子女教育\",\"21\":\"累计赡养老人\",\"22\":\"本次扣税\",\"23\":\"扣款合计\",\"24\":\"代扣餐费\",\"25\":\"实发工资\"}";
        String payDatasJson = "{\"22\":\"283.00\",\"23\":\"3073.00\",\"24\":\"105.00\",\"25\":\"26687.00\",\"10\":\"172.00\",\"11\":\"242.00\",\"12\":\"942.00\",\"13\":\"29760.00\",\"14\":\"0.00\",\"15\":\"0.00\",\"16\":\"否\",\"17\":\"0.00\",\"18\":\"0.00\",\"19\":\"0.00\",\"1\":\"绩效测试0010\",\"2\":\"0.00\",\"3\":\"300.00\",\"4\":\"0.00\",\"5\":\"100.00\",\"6\":\"2760.00\",\"7\":\"26600.00\",\"8\":\"387.00\",\"9\":\"942.00\",\"20\":\"0.00\",\"21\":\"0.00\"}";
        // 解析 JSON 数据
        JSONObject payTitlesObj = JSON.parseObject(payTitlesJson);
        JSONObject payDatasObj = JSON.parseObject(payDatasJson);
        // 获取所有键的集合并排序
        Set<String> keysSet = payDatasObj.keySet();
        List<String> keysList = new ArrayList<>(keysSet);
        Collections.sort(keysList);
        // 构造匹配结果列表
        List<JSONObject> result = new ArrayList<>();
        for (String key : keysList) {
            String title = payTitlesObj.getString(key);
            String value = payDatasObj.getString(key);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put(title, value);
            result.add(jsonObject);
        }
        // 合并成单个 JSON 对象
        JSONObject mergedObject = new JSONObject();
        for (JSONObject obj : result) {
            mergedObject.putAll(obj);
        }
        System.out.println(mergedObject);
    }

    private static void ee(){
        // 假设jsonString是你的JSON数据字符串
        String jsonString = "{\"加班工资\":\"0.00\",\"扣款合计\":\"3073.00\",\"累计继续教育\":\"0.00\",\"本次扣税\":\"283.00\",\"累计住房贷款利息\":\"0.00\",\"高温津贴\":\"300.00\",\"累计婴幼儿照护费用\":\"0.00\",\"月度绩效工资\":\"2760.00\",\"姓名\":\"绩效测试0010\",\"累计住房租金\":\"0.00\",\"累计子女教育\":\"0.00\",\"累计个人养老金\":\"0.00\",\"其他津补贴\":\"100.00\",\"代扣失业保险\":\"172.00\",\"实发工资\":\"26687.00\",\"代扣企业年金\":\"387.00\",\"代扣医疗保险\":\"242.00\",\"行车安全奖\":\"0.00\",\"代扣餐费\":\"105.00\",\"按年扣除标识\":\"否\",\"代扣住房公积金\":\"942.00\",\"代扣养老保险\":\"942.00\",\"应发工资\":\"29760.00\",\"累计赡养老人\":\"0.00\",\"基本工资\":\"26600.00\"}";

        // 使用fastjson解析JSON字符串
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取所需字段，如果字段不存在则赋值为0
        String[] fields = {"企业缴纳养老保险", "补缴企业缴纳养老差额", "代扣养老保险", "补缴养老代扣差额", "企业缴纳失业保险",
                "补缴企业缴纳失业差额", "代扣失业保险", "补缴失业代扣差额", "企业缴纳医疗保险", "补缴企业缴纳医疗差额",
                "企业缴纳生育保险", "补缴企业缴纳生育差额", "企业缴纳补充医疗", "代扣医疗保险", "代扣补充医疗",
                "代扣大病保险", "补缴医疗代扣差额", "代扣长期护理险", "补缴长期护理险代扣差额", "代扣补充医疗",
                "企业缴纳工伤保险", "补缴企业缴纳工伤差额", "企业缴纳企业年金", "补缴企业缴纳年金差额",
                "代扣企业年金", "补缴年金代扣差额", "企业缴纳住房公积金", "补缴企业缴纳住房公积金差额",
                "代扣住房公积金", "补缴住房公积金代扣差额", "本次扣税", "代扣工会费"};

        JSONObject resultObject = new JSONObject();
        for (String field : fields) {
            resultObject.put(field, jsonObject.getOrDefault(field, "0.00"));
        }
        // 计算单位和个人各项保险金额
        double unitBasicPension = Double.parseDouble(resultObject.getString("企业缴纳养老保险")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳养老差额"));
        double personalPension = Double.parseDouble(resultObject.getString("代扣养老保险")) +
                Double.parseDouble(resultObject.getString("补缴养老代扣差额"));
        double unitUnemployment = Double.parseDouble(resultObject.getString("企业缴纳失业保险")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳失业差额"));
        double personalUnemployment = Double.parseDouble(resultObject.getString("代扣失业保险")) +
                Double.parseDouble(resultObject.getString("补缴失业代扣差额"));
        double unitBasicMedical = Double.parseDouble(resultObject.getString("企业缴纳医疗保险")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳医疗差额")) +
                Double.parseDouble(resultObject.getString("企业缴纳生育保险")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳生育差额"));
        double unitSupplementMedical = Double.parseDouble(resultObject.getString("企业缴纳补充医疗"));
        double personalMedical = Double.parseDouble(resultObject.getString("代扣医疗保险")) +
                Double.parseDouble(resultObject.getString("代扣补充医疗")) +
                Double.parseDouble(resultObject.getString("代扣大病保险")) +
                Double.parseDouble(resultObject.getString("补缴医疗代扣差额")) +
                Double.parseDouble(resultObject.getString("代扣长期护理险")) +
                Double.parseDouble(resultObject.getString("补缴长期护理险代扣差额")) +
                Double.parseDouble(resultObject.getString("代扣补充医疗"));
        double unitWorkInjury = Double.parseDouble(resultObject.getString("企业缴纳工伤保险")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳工伤差额"));
        double unitEnterprisePension = Double.parseDouble(resultObject.getString("企业缴纳企业年金")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳年金差额"));
        double personalEnterprisePension = Double.parseDouble(resultObject.getString("代扣企业年金")) +
                Double.parseDouble(resultObject.getString("补缴年金代扣差额"));
        double unitHousingFund = Double.parseDouble(resultObject.getString("企业缴纳住房公积金")) +
                Double.parseDouble(resultObject.getString("补缴企业缴纳住房公积金差额"));
        double personalHousingFund = Double.parseDouble(resultObject.getString("代扣住房公积金")) +
                Double.parseDouble(resultObject.getString("补缴住房公积金代扣差额"));

        // 输出结果
        System.out.println(resultObject.toJSONString());
    }
}

package org.demo;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/8/16
 * @description 编写测试的代码
 */
public class test {
    private  static  final  test INSTANCE=new test();
    private test(){
    }
    public static test getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        String jsonStr = "{\\n\" +\n" +
                "                \"    \\\"billnum\\\": \\\"stwb_settlebench\\\",\\n\" +\n" +
                "                \"    \\\"data\\\": \\\"[{\\\\\\\"id\\\\\\\":\\\\\\\"\"+requestBody.get(\"id\")+\"\\\\\\\",\\\\\\\"pubts\\\\\\\":\\\\\\\"\"+requestBody.get(\"pubts\")+\"\\\\\\\",\\\\\\\"code\\\\\\\":\\\\\\\"\"+requestBody.get(\"code\")+\"\\\\\\\",\\\\\\\"statementstatus\\\\\\\":\"+requestBody.get(\"statementstatus\")+\"}]\\\"\\n\" +\n" +
                "                \"}";

        // 去除字符串中的反斜杠 `\`
        jsonStr = jsonStr.replace("\\", "");
        System.out.println(jsonStr);
    }

}

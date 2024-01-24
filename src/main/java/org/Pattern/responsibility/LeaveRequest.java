package org.Pattern.responsibility;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/1/24
 * @description 请假条类
 */
public class LeaveRequest {
    //姓名
    private String name;
    //请假天数
    private int day;
    //请假内容
    private String content;

    public LeaveRequest(String name, int day, String content) {
        this.name = name;
        this.day = day;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

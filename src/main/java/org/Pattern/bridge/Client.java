package org.Pattern.bridge;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 请写明这个类是干嘛的
 */
public class Client {
    public static void main(String[] args) {
        //创建mac系统对象
        OpratingSystem system=new Mac(new RmvbFile());
        OpratingSystem system1=new Windows(new AviFile());
        //使用操作系统播放视频
        system.play("大闹天宫");
        system1.play("封神榜");
    }
}

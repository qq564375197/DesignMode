package org.Pattern.bridge;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 抽象操作系统类（抽象化角色）
 */
public abstract class OpratingSystem {
    //声明video变量
    protected  VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract  void  play(String fileName);
}

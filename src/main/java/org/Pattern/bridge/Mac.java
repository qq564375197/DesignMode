package org.Pattern.bridge;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description 请写明这个类是干嘛的
 */
public class Mac extends  OpratingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}

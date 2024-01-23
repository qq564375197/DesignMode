package org.Pattern.bridge;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description avi视频文件（具体的实现化角色）
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("视频文件AVI："+fileName);
    }
}

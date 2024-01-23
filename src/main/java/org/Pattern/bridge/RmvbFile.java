package org.Pattern.bridge;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/9/20
 * @description rmvb视频（具体实现化角色）
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件"+fileName);
    }
}

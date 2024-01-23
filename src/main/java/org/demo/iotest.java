package org.demo;

import java.io.*;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2023/12/13
 * @description io流常见过程-文件的创建，输入和输出
 */
public class iotest {
    public static void main(String[] args) {

    }
    //从指定的文件中读取数据
    void inputfile(){
        // 指定本地文件的路径
        String filePath = "C:\\path\\to\\your\\file.txt"; // 替换为实际文件路径

        File file = new File(filePath);

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // 打开流
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            // 读取数据
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // 处理异常，例如记录日志或向用户报告错误
            e.printStackTrace();
        } finally {
            // 在 finally 块中关闭流，确保资源被释放
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //创建文件并且写入数据
    void outputfile(){
        File file = new File("测试文件.txt");
        String data = "Hello, World!";
        byte[] byteData = data.getBytes();
        FileOutputStream stream = null;
        BufferedOutputStream fos = null;
        try {
            // 打开流
            stream = new FileOutputStream(file);
            fos = new BufferedOutputStream(stream);
            // 写入数据
            fos.write(byteData);
        } catch (IOException e) {
            // 处理异常，例如记录日志或向用户报告错误
            e.printStackTrace();
        } finally {
            // 在 finally 块中关闭流，确保资源被释放
            try {
                if (fos != null) {
                    fos.close();
                }
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package org.file;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.core.io.UrlResource;
import sun.net.www.http.HttpClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/6/4
 * @description 处理文件内容下载
 */
public class handlerFile {
    public static void main(String[] args) {
        String fileUrl = "http://dfiles.italent.cn/download/resume/606495/1711092573/badaf1f498a54d18aec1c7fc4a06d53f.jpeg?sig_t=1712468187&sig_exp=2592000&sig_a=recruitment&sig_pm=8&sig_npm=2&sig_v=1&sig=e7e4c269494e778a096de47c5d3a199d5127d68c";
        try {
            downloadFile(fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File downloadFile(String fileUrl) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(fileUrl);
        httpGet.setHeader("User-Agent", "Mozilla/5.0");
        httpGet.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        httpGet.setHeader("Accept-Language", "en-US,en;q=0.5");
        httpGet.setHeader("Accept-Encoding", "gzip, deflate, br");
        httpGet.setHeader("Connection", "keep-alive");
        httpGet.setHeader("Upgrade-Insecure-Requests", "1");

        CloseableHttpResponse response = httpClient.execute(httpGet);
        int responseCode = response.getStatusLine().getStatusCode();
        File tempFile = null;
        if (responseCode == 200) {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                tempFile = Files.createTempFile("download-", ".jpeg").toFile();
                try (InputStream inputStream = entity.getContent();
                     FileOutputStream outputStream = new FileOutputStream(tempFile)) {

                    byte[] buffer = new byte[4096];
                    int bytesRead;

                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }

                    System.out.println("File downloaded successfully to " + tempFile.getAbsolutePath());
                } finally {
                    EntityUtils.consume(entity);
                }
            }
        } else {
            System.out.println("File download failed, error code: " + responseCode);
        }
        response.close();
        httpClient.close();
        return tempFile;
    }


}

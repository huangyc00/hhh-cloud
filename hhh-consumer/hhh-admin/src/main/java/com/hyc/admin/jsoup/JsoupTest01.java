package com.hyc.admin.jsoup;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class JsoupTest01 {

    public static void main(String[] args) throws IOException {
        test02();

    }


    public static void test01() throws IOException {
        String url = "https://www.bilibili.com/bangumi/play/ep285945?spm_id_from=333.851.b_62696c695f7265706f72745f616e696d65.54";
        Connection connection = Jsoup.connect(url);
        Document document = connection.get();
        System.out.println(document.html());
    }


    public static void test02() throws IOException {
        String url = "https://www.bilibili.com/bangumi/play/ep285945?spm_id_from=333.851.b_62696c695f7265706f72745f616e696d65.54";
        Connection connection = Jsoup.connect(url);
        Connection.Response response = connection.method(Connection.Method.GET).execute();
        URL url02 = response.url();
        System.out.println("请求的url:" + url02);
        //
        int statusCode = response.statusCode();
        System.out.println("status:" + statusCode);

        System.out.println("响应类型" + response.contentType());
        System.out.println("statusmessage" + response.statusMessage());
        System.out.println("html" + new String(response.bodyAsBytes()));

    }
}

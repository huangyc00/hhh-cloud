package com.hyc.admin.jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Bilibili_Daojian {

    public static void main(String[] args) throws IOException {
        Connection connection = Jsoup.connect("https://www.bilibili.com/bangumi/play/ss28615");
        Document document = connection.execute().parse();
//        #comment_module > div.comm > div.bb-comment > div.comment-list
        Elements elements = document.getElementsByClass("comment-wrapper common report-wrap-module report-scroll-module");
        for(Element e : elements){
            System.out.println(e.text());
        }
    }

}

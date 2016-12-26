package com.konrad.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.concurrent.ExecutorService;

/**
 * Created by konrad on 12/26/16.
 */
public class Launcher {
    public static void main(String[] args) {

        try{
            Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
            Elements newsHeadlines = doc.select("#mp-itn b a");
        }catch (Exception e){

        }
    }
}

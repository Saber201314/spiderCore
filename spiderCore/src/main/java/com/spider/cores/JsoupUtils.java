package com.spider.cores;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JsoupUtils {
	
	/**
	 * 加载URL 
	 * @param strUrl
	 * @return Document
	 * @throws IOException
	 */
	public static Document Get(String strUrl) throws IOException{
		
		URL url=new URL(strUrl);
		Document doc = Jsoup.parse(url, 0);
		return doc;
	}
	
	
	/**
	 * Jsoup the load html
	 * @param html
	 * @return
	 */
	public static Document LoadHtml(String html){
		Document doc = Jsoup.parse(html);
		return doc;
	}

}

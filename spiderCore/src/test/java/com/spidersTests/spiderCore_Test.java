package com.spidersTests;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import com.spider.cmds.webUtils;
import com.spider.cores.JsoupUtils;
import com.spider.cores.PhantomjsUtils;
import com.spider.cores.httpUtils;

public class spiderCore_Test {

	private String testUrl = "https://s.taobao.com/search?q=***&imgfile=&js=1&stats_click=search_radio_all%3A1&initiative_id=staobaoz_20170518&ie=utf8";

	/**
	 * 显示信息
	 * 
	 * @param page
	 */
	private void ShowMessage(String page) {
		Document parse = Jsoup.parse(page);
		Elements ems = parse.select(".m-related > .inner > .item > .link");

		for (Element element : ems) {
			System.out.println(element.text());
		}
	}

	@Test
	public void TestJsoup() {
		try {
			String url1 = "https://lunasophia.taobao.com/i/asynSearch.htm?_ksTS=1495085474596_222&mid=w-16077022764-0&wid=16077022764&path=/category.htm&spm=a1z10.1-c-s.w5001-16077022729.6.crWag7&search=y&scene=taobao_shop&qq-pf-to=pcqq.c2c";
			Document html = JsoupUtils.Get(url1);
			String htmls = html.html().replace("\\&quot;", "");
			Document doc = JsoupUtils.LoadHtml(htmls);
			System.out.println(doc.select(".item3line1").text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void PhantomjsTest() {

		try {
			String keyName = "笔记本";
			
			keyName = webUtils.UrlDecoders(keyName, "utf-8");
			testUrl = testUrl.replace("***", keyName);
			System.out.println(testUrl);
			String page = PhantomjsUtils.Get(testUrl);
			ShowMessage(page);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void TestHttp() {
		try {
			String page = httpUtils.Get(testUrl);
			ShowMessage(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void TestMethon() throws UnsupportedEncodingException {
		//%E8%A1%A3%E6%9C%8D
	}
}

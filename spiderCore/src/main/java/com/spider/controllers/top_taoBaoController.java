package com.spider.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.spider.cmds.webUtils;
import com.spider.cores.PhantomjsUtils;


@Controller
public class top_taoBaoController {

	/**
	 * 淘宝宝贝所搜页，你是不是想找，
	 * 连接地址 *** 替代关键词
	 */
	private String isSeek = "https://s.taobao.com/search?q=***&imgfile=&js=1&stats_click=search_radio_all%3A1&initiative_id=staobaoz_20170518&ie=utf8";
	
	/**
	 * 你是不是想找
	 * @param url
	 * @return JSON 
	 */
	@ResponseBody
	@RequestMapping("/taobaokey")
	public String ReqTaoBao(HttpServletRequest request){
		List<String> strs = new ArrayList<String>();
		String keyName = request.getParameter("keyName");
		try {
			keyName = webUtils.UrlDecoders(keyName, "utf-8");
			
			isSeek = isSeek.replace("***", keyName);
			System.out.println(isSeek);
			String page = PhantomjsUtils.Get(isSeek);
			Document parse = Jsoup.parse(page);
			Elements ems = parse.select(".m-related > .inner > .item > .link");
			for (Element element : ems) {
				strs.add(element.text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(strs);
	}
}

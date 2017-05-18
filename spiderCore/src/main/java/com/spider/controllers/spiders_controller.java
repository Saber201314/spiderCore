package com.spider.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spider.cores.PhantomjsUtils;
import com.spider.services.IspiderService;

@Controller
public class spiders_controller {

	@Autowired
	private IspiderService spiderService;
	
	/**
	 * Read HTML using the get request
	 * @param url
	 * @return String  html
	 * @throws IOException 
	 */
	@ResponseBody
	@RequestMapping("/get")
	public String Get(HttpServletRequest request) throws IOException{
		String html = "";
		String url = request.getParameter("url");
		System.out.println(url);
		return PhantomjsUtils.Get(url);
	}
	
	/**
	 * Read HTML using the Post request
	 * @param url
	 * @param params  Type is  Json{ param1, param2, param3}
	 * @return String html
	 */
	@ResponseBody
	@RequestMapping("/post")
	public String Post(HttpServletRequest request){
		String html = "";
		String url = request.getParameter("url");
		String params = request.getParameter("params");
		//parameters Handelr
		
		return html;
	}
}

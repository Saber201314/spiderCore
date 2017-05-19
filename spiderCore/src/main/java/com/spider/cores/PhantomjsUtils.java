package com.spider.cores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/***
 * Exe Phantomjs 
 * @author Administrator
 *
 */
public class PhantomjsUtils {
	
	
	
	/**
	 * 请求cookie
	 */
	private String cookie;
	
	
	/**
	 * PhantomjsUtils Get the using Request
	 * @param url 请求地址
	 * @return
	 * @throws IOException 
	 */
	public static String Get(String url ) throws IOException{
		
		Runtime rt = Runtime.getRuntime();
//				Process p = rt.exec("/data/phantomjs2.1/bin/phantomjs /data/codes.js " + url);
				Process p = rt.exec("E:/phantomjs.exe E:/codes.js "+url);
				
		        InputStream is = p.getInputStream();
		        BufferedReader br = new BufferedReader(new InputStreamReader(is));
		        StringBuffer sbf = new StringBuffer();
		        String tmp = "";
		        while((tmp = br.readLine())!=null){
		            sbf.append(tmp);
		        }
		return sbf.toString();
	}
	
	
	/**
	 * PhantomjsUtils Get the using Request
	 * @param url 请求地址
	 * @param params 请求参数
	 * @return
	 */
	public static String Popst(String url, String [] params){
		
		String html = "";
		
		return html;
	}
	
}

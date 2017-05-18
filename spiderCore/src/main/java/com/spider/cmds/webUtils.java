package com.spider.cmds;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 浏览器工具类
 * @author Administrator
 *
 */
public class webUtils {

	/**
	 * 
	 * 浏览器编码转换工具
	 * @param str 需要转换的字符串
	 * @param encodingType 浏览器编码类型
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String UrlDecoders(String str,String encodingType) throws UnsupportedEncodingException{
		String coder = URLEncoder.encode(str, encodingType);
		return coder;
	}
}

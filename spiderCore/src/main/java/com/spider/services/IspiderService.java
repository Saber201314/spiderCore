package com.spider.services;


/**
 * HTML spiders Interface
 * @author Administrator
 *
 */
public interface IspiderService {

	/**
	 * Read HTML the Using get Request
	 * @param url
	 * @return
	 */
	public String Get(String url);
	
	
	/**
	 * Read HTML the Using Post Request
	 * @param The address of the connection requested
	 * @param Post request parameters
	 * @return
	 */
	public String Post(String url,String[] parms);
}

package com.spider.servicesImpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spider.mappers.IspiderMapper;
import com.spider.services.IspiderService;

/**
 * Crawler service interface
 * @author zhangBin
 *
 */
@Service
public class spiderImpls implements IspiderService{

	/**
	 * the is spiders data Interface
	 */
	@Autowired
	private IspiderMapper spiderMapper;
	
	@Override
	public String Get(String url) {
		
		System.out.println("Get_Inserface:" + spiderMapper);
		return url;
	}

	@Override
	public String Post(String url, String[] parms) {
		// TODO Auto-generated method stub
		
		System.out.println("Post_Inserface:" + spiderMapper);
		return url;
	}

	
	
}

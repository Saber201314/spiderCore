package com.spidersTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spider.services.IspiderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-base.xml" })
public class spiderService_test{

	@Autowired
	private IspiderService spiderService;
	
	/**
	 * test spider Services Get Methond
	 */
	@Test
	public void testServiceGetMethond() 
	{
		String content = spiderService.Get("www.baidu.com");
		
		System.out.println(content);
	}
	
	/**
	 * test spider Services Post Methond
	 */
	@Test
	public void testServicePostMethond(){
		
		String url = "https://www.baidu.com";
		
		String [] parms = new String []{"userName = admin","pwd = 123"};
		
		String content = spiderService.Post(url, parms);
		
		System.out.println(content);
	}
}

package com.spider.mappers;

import java.util.List;

import com.spider.entitys.spiderEntity;


/**
 * Here is the data layer access interface
 * @author Administrator
 *
 */
public interface IspiderMapper {

	/**
	 * find all Spiders tables message
	 * @return
	 */
	public List<spiderEntity> fundSpiderAll();
}

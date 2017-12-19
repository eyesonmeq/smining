/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.smining.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import com.angel.smining.model.ShareDO;

/**
 * 
 *
 * @date: 2017年12月19日 下午11:27:53
 * @author li_ming 
 */
@Component("shareRepository")
public interface ShareRepository extends ElasticsearchRepository<ShareDO, String> {

}

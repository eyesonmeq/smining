/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.smining.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angel.smining.dao.ShareRepository;
import com.angel.smining.model.ShareDO;
import com.angel.smining.service.ShareService;

/**
 * 
 *
 * @date: 2017年12月19日 下午11:31:00
 * @author li_ming 
 */
@Service
public class ShareServiceImpl implements ShareService {
	@Autowired
	private ShareRepository shareRepository;

	/* 
	 * @see com.angel.smining.service.ShareService#insert(com.angel.smining.model.ShareDO)
	 */
	@Override
	public void insert(ShareDO share) {
		shareRepository.save(share);
	}

	/* 
	 * @see com.angel.smining.service.ShareService#listAll()
	 */
	@Override
	public List<ShareDO> listAll() {
		QueryStringQueryBuilder builder = new QueryStringQueryBuilder("001");
		Iterable<ShareDO> searchResult = shareRepository.search(builder);
		Iterator<ShareDO> iterator = searchResult.iterator();
		List<ShareDO> list = new ArrayList<ShareDO>();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}
		return list;
	}

}

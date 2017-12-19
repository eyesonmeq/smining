/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.smining.service;

import java.util.List;

import com.angel.smining.model.ShareDO;

/**
 * 
 *
 * @date: 2017年12月19日 下午11:28:57
 * @author li_ming 
 */
public interface ShareService {
	void insert(ShareDO share);

	List<ShareDO> listAll();
}

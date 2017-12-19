/**
 * Copyright (c) 2017, All Rights Reserved. 
 */
package com.angel.smining.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 
 *
 * @date: 2017年12月19日 下午11:20:37
 * @author li_ming 
 */
@Document(indexName = "smining", type = "share", indexStoreType = "fs", shards = 5, replicas = 1, refreshInterval = "-1")
public class ShareDO implements Serializable {

	private static final long serialVersionUID = -8756630878382953994L;
	@Id
	private String code;
	private String name;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}

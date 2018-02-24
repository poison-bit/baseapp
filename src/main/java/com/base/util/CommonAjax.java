package com.base.util;

import java.util.List;
import java.util.Map;

public class CommonAjax<T> {
	//返回状态
	private String state;
	
	//返回内容
	private String content;
	
	//返回实体
	private T object;
	
	//返回实体List
	private List<T> objList;
	
	//返回Map
	private Map<String, Object> map;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public List<T> getObjList() {
		return objList;
	}

	public void setObjList(List<T> objList) {
		this.objList = objList;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
}

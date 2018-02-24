package com.base.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

/**
 * 类说明：将request对象转为map对象
 * 
 * @author CHENWEI 2016年8月27日
 */
public class RequestToMap {
	@SuppressWarnings("rawtypes")
	public Map<String, Object> getRequestToMap(HttpServletRequest request) {
		Map<String, String[]> map = request.getParameterMap();
		Map<String, Object> returnMap = new HashMap<String, Object>();;
		for (Iterator<Entry<String, String[]>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry entry = (Map.Entry) iterator.next();
			// 获取KEY值
			String key = (String) entry.getKey();
			// 获取VALUE数组
			String[] values = (String[]) entry.getValue();
			String value = "";
			for (String s : values) {
				value += s;
			}
			returnMap.put(key, value);
		}
		return returnMap;
	}
}

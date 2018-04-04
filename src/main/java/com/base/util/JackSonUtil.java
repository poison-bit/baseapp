package com.base.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * 类说明：jackson工具类
 * @author CHENWEI
 * 2016年8月27日
 */
public class JackSonUtil {
	private static ObjectMapper objectMapper;
	static{
		objectMapper = new ObjectMapper();
		//时间戳不序列化
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
		//空map不序列化
		objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
		//空属性不序列化
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		//统一时间格式
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		//增加json格式可读性，正式使用改为false
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
	}
	
	/**
	 * 方法说明：对象转json字符窜
	 * @author CHENWEI
	 * @return
	 * 2016年8月27日
	 */
	public static String ObjectToJson(Object object){
		String json = "";
		try {
			json = objectMapper.writeValueAsString(object).toString();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
	
	/**
	 * 方法说明：json字符窜转对象
	 * @author CHENWEI
	 * @return
	 * 2016年8月27日
	 */
	public static Object JsonToObject(String json,Class<?> clazz){
		Object o = null;
		try {
			o = objectMapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}
	
	public static Map<String, String> jsonToMap(String json){
		Map<String, String> map = null;
		try {
			map = objectMapper.readValue(json, new TypeReference<Map<String, String>>() {});
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;
	}
}

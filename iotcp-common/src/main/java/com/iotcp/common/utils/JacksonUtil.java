package com.iotcp.common.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * @author  TSY
 *
 * @Date:  2018-10-29
 *
 * 	JackSon工具类
 */
public class JacksonUtil {
	private static ObjectMapper objectMapper = new ObjectMapper();
	/*
	 * 	对象转json
	 *
	 */
	public static <T> String beanToJson(T bean) {
		try {
			return objectMapper.writeValueAsString(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	/*
	 * map集合转json
	 */
	public static String mapToJson(Map map) {
		try {
			return objectMapper.writeValueAsString(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	/*
	 * list集合转json
	 */
	public static <T> String listToJson(List<T> list) {
		try {
			return objectMapper.writeValueAsString(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	/*
	 * json转对象
	 */
	public static <T> T jsonToBean(String json, Class<T> beanClass) {
		try {
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			return objectMapper.readValue(json, beanClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * json字符串转List集合
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> jsonToList(String json, Class<T> beanClass) {
		try {
			//下面的两行代码可以解决对象里面含有时间属性的问题
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			return (List<T>)objectMapper.readValue(json, getCollectionType(List.class, beanClass));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * json转Map
	 */
	public static Map jsonToMap(String json) {
		try {
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
			return (Map)objectMapper.readValue(json, Map.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
		return objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);   
	} 
	
}

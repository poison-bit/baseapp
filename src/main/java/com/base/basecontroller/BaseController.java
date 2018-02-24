package com.base.basecontroller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.github.pagehelper.PageInfo;


public class BaseController{
	public Logger logger = Logger.getLogger(getClass());
	
	@SuppressWarnings("rawtypes")
	public Map<String, Object> pageToJson(PageInfo page) {
		Map<String, Object> reMap = new HashMap<String, Object>();
		reMap.put("rows", page.getList());
		reMap.put("pageNum", page.getPageNum());
		reMap.put("pageSize", page.getPageSize());
		reMap.put("size", page.getSize());
		reMap.put("orderBy", page.getOrderBy());
		reMap.put("startRow", page.getStartRow());
		reMap.put("endRow", page.getEndRow());
		reMap.put("total", page.getTotal());
		reMap.put("pages", page.getPages());
		reMap.put("firstPage", page.getFirstPage());
		reMap.put("prePage", page.getPrePage());
		reMap.put("nextPage", page.getNextPage());
		reMap.put("lastPage", page.getLastPage());
		reMap.put("isFirstPage", page.isIsFirstPage());
		reMap.put("isLastPage", page.isIsLastPage());
		reMap.put("hasPreviousPage", page.isHasPreviousPage());
		reMap.put("hasNextPage", page.isHasNextPage());
		reMap.put("navigatePages", page.getNavigatePages());
		reMap.put("navigatepageNums", page.getNavigatepageNums());
		return reMap;
	}
	
	/**
	 * 写入trace日志
	 * 
	 * @param message
	 */
	public void trace(Object message) {
		logger.trace(message);
	}

	/**
	 * 写入trace日志(包含异常)
	 * 
	 * @param message
	 * @param t
	 */
	public void trace(Object message, Throwable t) {
		logger.trace(message, t);
	}

	/**
	 * 写入debug日志
	 * 
	 * @param message
	 */
	public void debug(Object message) {
		logger.debug(message);
	}

	/**
	 * 写入debug日志(包含异常)
	 * 
	 * @param message
	 * @param t
	 */
	public void debug(Object message, Throwable t) {
		logger.debug(message, t);
	}

	/**
	 * 写入info日志
	 * 
	 * @param message
	 */
	public void info(Object message) {
		logger.info(message);
	}

	/**
	 * 写入info日志(包含异常)
	 * 
	 * @param message
	 * @param t
	 */
	public void info(Object message, Throwable t) {
		logger.info(message, t);
	}

	/**
	 * 写入warn日志
	 * 
	 * @param message
	 */
	public void warn(Object message) {
		logger.warn(message);
	}

	/**
	 * 写入warn日志(包含异常)
	 * 
	 * @param message
	 * @param t
	 */
	public void warn(Object message, Throwable t) {
		logger.warn(message, t);
	}

	/**
	 * 写入error日志
	 * 
	 * @param message
	 */
	public void error(Object message) {
		logger.error(message);
	}

	/**
	 * 写入error日志(包含异常)
	 * 
	 * @param message
	 * @param t
	 */
	public void error(Object message, Throwable t) {
		logger.error(message, t);
	}

	/**
	 * 写入fatal日志
	 * 
	 * @param message
	 */
	public void fatal(Object message) {
		logger.fatal(message);
	}

	/**
	 * 写入fatal日志(包含异常)
	 * 
	 * @param message
	 * @param t
	 */
	public void fatal(Object message, Throwable t) {
		logger.fatal(message, t);
	}
	
	/**
	 * 将request中的参数转化为MAP<String,Object>
	 * 
	 * @param request
	 * @return
	 */
	public Map<String, Object> getRequestParameterAsMap(HttpServletRequest request) {
		Map<String, String[]> paraMap = request.getParameterMap();
		Map<String, Object> reMap = new HashMap<String, Object>();
		for (String key : paraMap.keySet()) {
			reMap.put(key.toString(), paraMap.get(key)[0]);
		}
		return reMap;
	}
	
	/**
	 * 将request中的参数转化为MAP<String,String>
	 * 
	 * @param request
	 * @return
	 */
	public Map<String, String> getRequestParameterAsMapString(HttpServletRequest request) {
		Map<String, String[]> paraMap = request.getParameterMap();
		Map<String, String> reMap = new HashMap<String, String>();
		for (String key : paraMap.keySet()) {
			reMap.put(key.toString(), paraMap.get(key)[0]);
		}
		return reMap;
	}
}

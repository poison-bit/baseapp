package com.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.base.entity.TaskInfo;

/**
 * 类说明：公共工具类
 * 
 * @author CHENWEI 2016年8月25日
 */
public class CommonUtil {
	private static final SimpleDateFormat YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");
	private static final SimpleDateFormat YYYYMMDDHH_MM_SS = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	private static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
	private static final SimpleDateFormat YYYY_MM = new SimpleDateFormat("yyyy-MM");
	private static final SimpleDateFormat YYYYMM = new SimpleDateFormat("yyyyMM");
	private static final SimpleDateFormat YYYY = new SimpleDateFormat("yyyy");
	
	
	public static final String SUCCESS="1";//成功
	public static final String NOTPASSERROR="0";//失败
	
	public static Map<String, TaskInfo> TASK_INFO_MAP = new HashMap<String, TaskInfo>();

	/**
	 * 方法说明：返回yyyy-MM-dd HH:mm:ss
	 * 
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$_FullDate() {
		return YYYY_MM_DD_HH_MM_SS.format(new Date());
	}

	/**
	 * 方法说明：返回yyyy-MM-dd
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$YYYY_MM_DD() {
		return YYYY_MM_DD.format(new Date());
	}

	/**
	 * 方法说明：返回yyyyMMdd HH:mm:ss
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$FullDate() {
		return YYYYMMDDHH_MM_SS.format(new Date());
	}

	/**
	 * 方法说明：返回yyyyMMdd
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$YYYYMMDD() {
		return YYYYMMDD.format(new Date());
	}

	/**
	 * 方法说明：返回yyyy_MM
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$YYYY_MM() {
		return YYYY_MM.format(new Date());
	}

	/**
	 * 方法说明：返回yyyyMM
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$YYYYMM() {
		return YYYYMM.format(new Date());
	}

	/**
	 * 方法说明：返回yyyy
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static String format$YYYY() {
		return YYYY.format(new Date());
	}
	
	/**
	 * 方法说明：返回当前时间
	 * @author CHENWEI
	 * @return 2016年8月25日
	 */
	public static Date getNowDate() {
		return new Date();
	}
	
	/**
	 * 将字符串首字母大写
	 * 
	 * @param name
	 * @return
	 */
	public static String upperCaseFirstLetter(String name) {
		char[] cs = name.toCharArray();
		cs[0] -= 32;
		return String.valueOf(cs);
	}

	/**
	 * 将字符串首字母小写
	 * 
	 * @param name
	 * @return
	 */
	public static String lowerCaseFirstLetter(String name) {
		char[] cs = name.toCharArray();
		cs[0] += 32;
		return String.valueOf(cs);
	}
}

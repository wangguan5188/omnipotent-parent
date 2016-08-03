package com.omnipotent.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期和时间相关操作工具类（待完善）
 * 
 * @author zhangtb
 * @date 2016-7-11 20:06:30
 * @since 1.0.0
 */
public class DateUtil {
	
	private static String YYMd = "yyyy-MM-dd";
	private static String YYMdHms = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * <p>date类型转换为字符串类型，默认格式为：yyyy-MM-dd HH:mm:ss</p>
	 * 
	 * <pre>
	 * DateUtil.dateToString(new Date()) = "2016-08-03 17:02:46";
	 * </pre>
	 * @author zhangtb
	 * @date 2016-8-3 17:03:37
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		
		return dateToString(date, YYMdHms);
	}
	
	/**
	 * <p>date类型转换为字符串类型</p>
	 * 
	 * <pre>
	 * dateToString(new Date(), "yyyy-MM-dd HH:mm:ss") = "2016-08-03 17:02:46";
	 * </pre>
	 * @author zhangtb
	 * @date 2016-8-3 17:03:37
	 * @param date
	 * @param format 转换的格式
	 * @return
	 */
	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		return dateToString(date, sdf);
	}
	
	/**
	 * <p>date类型转换为字符串类型</p>
	 * 
	 * <pre>
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 * dateToString(new Date(), sdf) = "2016-08-03 17:02:46";
	 * </pre>
	 * @author zhangtb
	 * @date 2016-8-3 17:03:37
	 * @param date
	 * @param sdf 转换的格式
	 * @return
	 */
	public static String dateToString(Date date, SimpleDateFormat sdf) {
		
		return sdf.format(date);
	}
	
	public static void main(String[] args) {
		System.out.println(dateToString(new Date()));// 2016-08-03 17:02:46
		
		System.out.println(dateToString(new Date(), YYMdHms));// 2016-08-03 17:02:46
		
		SimpleDateFormat sdf = new SimpleDateFormat(YYMd);
		System.out.println(dateToString(new Date(), sdf));// 2016-08-03
	}
	
}

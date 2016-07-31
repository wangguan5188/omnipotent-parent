package com.omnipotent.utils;

/**
 * 字符串处理工具类
 * 
 * @author zhangtb
 * @date 2016-7-17 17:00:38
 * @since 1.0.0
 */
public class StringUtil {
	
	/**
	 * @param obj
	 * @return
	 */
	public static String toString(Object obj) {
		return toString(obj, "");
	}

	/**
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String toString(Object obj, String defaultValue) {
		if (obj != null && !"".equals(obj.toString().trim())) {
			return obj.toString();
		}
		return defaultValue;
	}
	
	/**
	 * @param obj
	 * @return
	 */
	public static int toInt(Object obj) {
		if (obj == null) {
			return 0;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("\\d+")) {
				return Integer.parseInt(s);
			}
		}
		return 0;
	}

	/**
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static int toInt(Object obj, int defaultValue) {
		if (obj == null) {
			return defaultValue;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("-?\\d+")) {
				return Integer.parseInt(s);
			}
		}
		return defaultValue;
	}
	
	/**
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static long toLong(Object obj, long defaultValue) {
		if (obj == null) {
			return defaultValue;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("\\d+")) {
				return Long.parseLong(s);
			}
		}
		return defaultValue;
	}

	/**
	 * @param obj
	 * @return
	 */
	public static float toFloat(Object obj) {
		if (obj == null) {
			return 0.0f;
		}
		String s = obj.toString();
		if (s != null && !s.trim().equals("")) {
			if (s.matches("\\d+(\\.\\d+)?")) {
				return Float.parseFloat(s);
			}
		}
		return 0.0f;
	}
	
	public static void main(String[] args) {
		System.out.println("I love WangGuan forever.");
		System.out.println("I love WangGuan forever.");
		System.out.println("I love WangGuan forever.");
	}

}

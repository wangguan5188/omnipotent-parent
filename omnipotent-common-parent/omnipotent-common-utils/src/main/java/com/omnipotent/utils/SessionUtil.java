package com.omnipotent.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Session相关操作工具类
 * 
 * @author zhangtb
 * @date 2016-7-2 15:23:24
 * @since 1.0.0
 */
public class SessionUtil {

	/**
	 * <pre>获取session</pre>
	 * 
	 * @param request
	 * @return
	 */
	public static HttpSession getSession(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			session = request.getSession();
		}
		return session;
	}

	/**
	 * <pre>将相关的数据绑定到session</pre>
	 * 
	 * @param request
	 * @param key 绑定名
	 * @param value 绑定值
	 * @param seconds 秒
	 */
	public static void set(HttpServletRequest request, String key, Object value, int seconds) {
		HttpSession session = getSession(request);
		session.setAttribute(key, value);
		session.setMaxInactiveInterval(seconds);
	}

	/**
	 * <pre>从session中获取绑定的数据</pre>
	 * 
	 * @param <T>
	 * @param request
	 * @param key 绑定名
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T get(HttpServletRequest request, String key) {
		HttpSession session = getSession(request);
		return (T) session.getAttribute(key);
	}
	
	/**
	 * <pre>从session中清除指定的数据</pre>
	 * 
	 * @param request
	 * @param key 绑定名
	 */
	public static void remove(HttpServletRequest request, String key) {
		// session.invalidate();// 该session绑定的所有数据都失效
		
		HttpSession session = getSession(request);
		session.removeAttribute(key);
	}

}

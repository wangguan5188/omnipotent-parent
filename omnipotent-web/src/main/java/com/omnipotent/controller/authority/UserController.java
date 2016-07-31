package com.omnipotent.controller.authority;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.omnipotent.constant.GlobalConstant;
import com.omnipotent.model.User;
import com.omnipotent.service.UserService;
import com.omnipotent.utils.MD5Util;
import com.omnipotent.utils.PropertiesUtil;
import com.omnipotent.utils.SessionUtil;
import com.omnipotent.utils.StringUtil;

/**
 * @author zhangtb
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService UserService;
	
	/**
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/toLogin")
	public ModelAndView toLogin(HttpServletRequest request, ModelMap modelMap) {
		//TODO 初始化超级管理员账号
		
		return new ModelAndView("user/login", modelMap);
	}
	
	/**
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/login")
	public ModelAndView login(HttpServletRequest request, ModelMap modelMap) {
		//TODO 验证码
		String username = StringUtil.toString(request.getParameter("username"), null);
		String password = StringUtil.toString(request.getParameter("password"), null);
		if(StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
			User user = UserService.queryUser(username, password);
			if(user != null) {
				// 绑定到session
				SessionUtil.set(request, GlobalConstant.WEB_USER, user, 5*60);
				return new ModelAndView("redirect:/index", modelMap);
			}
		}
		modelMap.put("username", request.getParameter("username"));
		modelMap.put("password", request.getParameter("password"));
		return new ModelAndView("user/login", modelMap);
	}
	
	public static void main(String[] args) {
		String encode = MD5Util.encode("123456");
		System.out.println(encode);
		
		String username = PropertiesUtil.getProperties("username");
		System.out.println(username);
	}

}

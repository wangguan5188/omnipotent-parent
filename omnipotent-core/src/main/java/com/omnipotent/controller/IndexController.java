package com.omnipotent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhangtb
 *
 * @since 1.0.0
 */
@Controller
public class IndexController {
	
	/**
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request, ModelMap modelMap) {
		
		return new ModelAndView("index", modelMap);
	}

}

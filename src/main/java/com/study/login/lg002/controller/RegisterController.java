package com.study.login.lg002.controller;

import com.study.login.lg002.service.RegisterService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class RegisterController {
	@Autowired
	RegisterService registerService;
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/register")
	public String register() {
		return "/login/lg002/register";
	}

	@RequestMapping("/registerAccount")
	public ModelAndView register(String id, String username, String personId, String password, String repassword, Integer idType, Locale locale){
		ModelAndView mav;
		if (registerService.register(id,username,personId,password,repassword,idType) == 0){
			mav = new ModelAndView("/login/lg002/registererror");
			mav.addObject("error_message", messageSource.getMessage("lg002_001", null, locale));
		} else {
			mav = new ModelAndView("/login/lg002/registersuccess");
		}
		return mav;
	}
}

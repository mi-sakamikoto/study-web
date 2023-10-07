package com.study.bank.withdraw.controller;

import com.study.bank.withdraw.service.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class WithdrawController {

	@Autowired
	WithdrawService withdrawService;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/withdrawPage")
	public String init() {
		return "/login/lg003/withdraw";
	}

	@RequestMapping("/withdraw")
	public ModelAndView withdraw(String id, Double withdrawNum, Locale locale, HttpSession httpSession){
		ModelAndView mav;
		if (withdrawService.withdraw((String) httpSession.getAttribute("id"), withdrawNum) != 0){
			mav = new ModelAndView("/login/lg003/withdrawsuccess");
		} else {
			mav = new ModelAndView("/login/lg003/deposit");
			mav.addObject("error_message", messageSource.getMessage("withdraw_001", null, locale));
		}
		return mav;
	}
}

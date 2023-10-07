package com.study.bank.withdraw.controller;

import com.study.bank.deposit.service.DepositService;
import com.study.bank.withdraw.service.WithdrawService;
import com.study.history.withdraw.service.CurrentWithdrawService;
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
	private WithdrawService withdrawService;

	@Autowired
	private CurrentWithdrawService currentWithdrawService;

	@Autowired
	private DepositService depositService;

	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/withdrawPage")
	public String init() {
		return "/login/lg003/withdraw";
	}

	@RequestMapping("/withdraw")
	public ModelAndView withdraw(String id, Double withdrawNum, Locale locale, HttpSession httpSession){
		ModelAndView mav;
		id = (String) httpSession.getAttribute("id");
		if (withdrawService.withdraw(id, withdrawNum) != 0){
			mav = new ModelAndView("/login/lg003/withdrawsuccess");
			currentWithdrawService.currentWithdraw(null, id, depositService.getBalance(id), withdrawNum);
		} else {
			mav = new ModelAndView("/login/lg003/depositerror");
			mav.addObject("error_message", messageSource.getMessage("withdraw_001", null, locale));
		}
		return mav;
	}
}

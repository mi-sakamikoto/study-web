package com.study.bank.deposit.controller;

import com.study.bank.deposit.service.DepositService;
import com.study.history.deposit.service.CurrentDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class DepositController {
	@Autowired
	private DepositService depositService;

	@Autowired
	private CurrentDepositService currentDepositService;

	@RequestMapping(value = "/depositPage")
	public String init() {
		return "/login/lg003/deposit";
	}

	@RequestMapping("/deposit")
	public ModelAndView deposit(String id, Double depositNum, HttpSession httpSession){
		ModelAndView mav = null;
		id = (String) httpSession.getAttribute("id");
		if (depositService.deposit(id, depositNum) != 0){
			mav = new ModelAndView("/login/lg003/depositsuccess");
			currentDepositService.currentDeposit(null, id, depositService.getBalance(id), depositNum);
		}
		return mav;
	}
}

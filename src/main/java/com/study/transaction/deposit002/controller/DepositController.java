package com.study.transaction.deposit002.controller;

import com.study.transaction.common.balance.service.BalanceService;
import com.study.transaction.deposit002.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * 預金コントローラクラス
 */
@Controller
public class DepositController {

	/** 残高サービス */
	@Autowired
	private BalanceService balanceService;

	/** 預金サービス */
	@Autowired
	private DepositService depositService;

	/**
	 * 預金初期画面
	 *
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/depositPage")
	public String init() {
		return "/login/lg003/deposit";
	}

	/**
	 * 預金
	 * @param id          ユーザID
	 * @param depositNum  預金金額
	 * @return ModelAndView
	 */
	@RequestMapping("/deposit")
	public ModelAndView deposit(String id, Double depositNum, HttpSession httpSession) {
		ModelAndView mav = null;
		id = (String) httpSession.getAttribute("id");
		if (depositService.depositById(id, depositNum) != 0) {
			mav = new ModelAndView("/login/lg003/depositsuccess");
			depositService.currentDeposit(null, id, balanceService.getBalance(id), depositNum);
		}
		return mav;
	}
}

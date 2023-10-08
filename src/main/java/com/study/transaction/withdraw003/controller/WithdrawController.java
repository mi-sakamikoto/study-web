package com.study.transaction.withdraw003.controller;

import com.study.transaction.common.balance.service.BalanceService;
import com.study.transaction.withdraw003.service.WithdrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * 金を下ろすコントローラクラス
 */
@Controller
public class WithdrawController {

	/** 残高サービス */
	@Autowired
	private BalanceService balanceService;

	/** 金を下ろすサービス */
	@Autowired
	private WithdrawService withdrawService;

	/** メッセージ */
	@Autowired
	private MessageSource messageSource;

	/**
	 * 金を下ろす初期画面
	 *
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/withdrawPage")
	public String init() {
		return "/login/lg003/withdraw";
	}

	/**
	 * 金を下ろす
	 * @param id ユーザID
	 * @param withdrawNum 引き出し金額
	 * @return ModelAndView
	 */
	@RequestMapping("/withdraw")
	public ModelAndView withdraw(String id, Double withdrawNum, Locale locale, HttpSession httpSession){
		ModelAndView mav;
		id = (String) httpSession.getAttribute("id");
		if (withdrawService.withdrawById(id, withdrawNum) != 0){
			mav = new ModelAndView("/login/lg003/withdrawsuccess");
			withdrawService.currentWithdraw(null, id, balanceService.getBalance(id), withdrawNum);
		} else {
			mav = new ModelAndView("/login/lg003/depositerror");
			mav.addObject("error_message", messageSource.getMessage("withdraw_001", null, locale));
		}
		return mav;
	}
}

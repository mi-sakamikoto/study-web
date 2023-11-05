package com.study.web.login.lg001.controller;

import com.study.web.database.dao.BalanceDao;
import com.study.web.login.lg001.dto.AccountDto;
import com.study.web.login.lg001.service.LoginService;
import com.study.web.transaction.ts001.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * topコントローラクラス
 */
@Controller
public class TopController {

	/** ログインサービス */
	@Autowired
	private LoginService loginService;

	/** 残高サービス */
	@Autowired
	private BalanceDao balanceDao;

	@Autowired
	private RecordService recordService;

	/**
	 * top
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/top")
	public ModelAndView top(Locale locale, HttpSession session) {
		ModelAndView mav;
		// アカウント情報取得
		AccountDto accountDto = loginService.login((String) session.getAttribute("id"), (String) session.getAttribute("password"));
		// ログイン成功
		mav = new ModelAndView("/login/lg001/top");
		mav.addObject("accountDto", accountDto);
		session.setAttribute("id", accountDto.getId());
		// メニュー取得
		mav.addObject("menuMap", loginService.getMenu(accountDto.getIdType()));
		// 残高取得
		mav.addObject("balance", loginService.getBalance(accountDto.getId()));
		//最近のレコード取得
		mav.addObject("RecordList",recordService.getRecord(accountDto.getId()));
		return mav;
	}
}

package com.study.login.lg001.controller;

import com.study.login.lg001.dto.AccountDto;
import com.study.login.lg001.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * ログインコントローラクラス
 */
@Controller
public class LoginController {

	/** ログインサービス */
	@Autowired
	private LoginService loginService;

	/**
	 * 初期画面
	 *
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public ModelAndView init() {
		ModelAndView mav = new ModelAndView("/login/lg001/login");
		mav.addObject("message", "Hello world!");
		return mav;
	}

	/**
	 * ログイン
	 *
	 * @param userId ユーザID
	 * @param password パスワード
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ModelAndView login(@RequestParam(value = "userId") String userId, @RequestParam(value = "password") String password) {
		ModelAndView mav;
		// アカウント情報取得
		AccountDto accountDto = loginService.login(userId, password);
		if (accountDto != null) {
			mav = new ModelAndView("/login/lg001/top");
			mav.addObject("accountDto", accountDto);
		} else {
			mav = new ModelAndView("/login/lg001/login");
			mav.addObject("error_message", "password error");
		}

		return mav;
	}
}
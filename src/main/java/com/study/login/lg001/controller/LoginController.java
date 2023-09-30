package com.study.login.lg001.controller;

import com.study.login.lg001.dto.AccountDto;
import com.study.login.lg001.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

/**
 * ログインコントローラクラス
 */
@Controller
public class LoginController {

	/** ログインサービス */
	@Autowired
	private LoginService loginService;

	@Autowired
	private MessageSource messageSource;

	/**
	 * 初期画面
	 *
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public String init() {
		return "/login/lg001/login";
	}

	/**
	 * ログイン
	 *
	 * @param userId ユーザID
	 * @param password パスワード
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ModelAndView login(String userId, String password, Locale locale) {
		ModelAndView mav;
		// アカウント情報取得
		AccountDto accountDto = loginService.login(userId, password);
		if (accountDto != null) {
			mav = new ModelAndView("/login/lg001/top");
			mav.addObject("accountDto", accountDto);
		} else {
			mav = new ModelAndView("/login/lg001/login");
			mav.addObject("error_message", messageSource.getMessage("lg001_001", null, locale));
		}

		return mav;
	}

	/**
	 * 登録画面
	 *
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/register", method = { RequestMethod.GET })
	public String register() {
		return "/login/lg001/login";
	}
}
package com.study.login.lg002.controller;

import com.study.login.lg001.controller.LoginController;
import com.study.login.lg002.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 * 登録コントローラクラス
 */
@Controller
public class RegisterController {

	/** ログ */
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/** 登録サービス */
	@Autowired
	private RegisterService registerService;

	/** メッセージ */
	@Autowired
	private MessageSource messageSource;

	/**
	 * 登録初期画面
	 *
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/register")
	public String register() {
		return "/login/lg002/register";
	}

	/**
	 * 登録
	 *
	 * @param id         ユーザID
	 * @param username   名前
	 * @param personId   身分証番号
	 * @param password   パスワード
	 * @param repassword 確認パスワード
	 * @param idType     アカウントタイプ
	 * @return ModelAndView
	 */
	@RequestMapping("/registerAccount")
	public ModelAndView register(String id, String username, String personId, String password, String repassword, Integer idType, Locale locale) {
		ModelAndView mav;
		if (registerService.register(id, username, personId, password, repassword, idType) == 0) {
			mav = new ModelAndView("/login/lg002/registererror");
			mav.addObject("error_message", messageSource.getMessage("lg002_001", null, locale));
		} else {
			registerService.registerAsset(id);
			mav = new ModelAndView("/login/lg002/registersuccess");
		}
		return mav;
	}
}

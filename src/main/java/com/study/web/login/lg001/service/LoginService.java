package com.study.web.login.lg001.service;

import com.study.web.login.lg001.dto.AccountDto;

import java.util.Map;

/**
 * ログインサービスインタフェース
 */
public interface LoginService {
	/**
	 * アカウント情報取得
	 *
	 * @param id ユーザID
	 * @param password ユーザパスワード
	 * @return アカウント情報
	 */
	AccountDto login(String id, String password);

	/**
	 * 残高取得
	 * @param id ユーザID
	 */
	Double getBalance(String id);

	/**
	 *  TODO
	 * @param idType アカウントタイプ
	 * @return アカウント情報
	 */
	Map<String, String> getMenu(Integer idType);


}

package com.study.login.lg001.service;

import com.study.login.lg001.dto.AccountDto;

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
	 *  TODO
	 * @param idType
	 * @return
	 */
	Map<String, String> getMenu(Integer idType);
}

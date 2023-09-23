package com.study.login.lg001.dao;

import com.study.login.lg001.dto.AccountDto;

import java.util.List;

/**
 * ログインDAOインタフェース
 */
public interface LoginDao {
	/**
	 * アカウント取得
	 * @param id ユーザID
	 * @return アカウントリスト
	 */
	List<AccountDto> getAccount(String id);
}
package com.study.transaction.common.balance.service;

/**
 * 残高サービスインタフェース
 */
public interface BalanceService {

	/**
	 * 残高の取得
	 * @param id ユーザID
	 * @return 残高
	 */
	double getBalance(String id);
}

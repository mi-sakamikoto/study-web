package com.study.transaction.common.balance.dao;

/**
 * 残高DAOインタフェース
 */
public interface BalanceDao {

	/**
	 * 残高の取得
	 * @param id ユーザID
	 * @return 残高
	 */
	Double getBalance(String id);
}

package com.study.web.transaction.ts002.dao;

/**
 * 預金DAOインタフェース
 */
public interface DepositDao {

	/**
	 * 預金
	 *
	 * @param id         ユーザID
	 * @param depositNum 預金金額
	 * @return 更新バー数
	 */
	int depositById(String id, Double depositNum);

	/**
	 * 預金記録
	 *
	 * @param history_seq     預金ID
	 * @param id              ユーザID
	 * @param current_balance 現在の残高
	 * @param current_deposit 現在の預金金額
	 * @return 挿入バー数
	 */
	int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit);
}

package com.study.transaction.withdraw003.service;

/**
 * 金を下ろすサービスインタフェース
 */
public interface WithdrawService {

	/**
	 * 金を下ろす
	 *
	 * @param id          ユーザID
	 * @param withdrawNum 引き出し金額
	 * @return 更新バー数
	 */
	int withdrawById(String id, Double withdrawNum);

	/**
	 * 引き出し記録
	 *
	 * @param history_seq      金を下ろすID
	 * @param id               ユーザID
	 * @param current_balance  現在の残高
	 * @param current_withdraw 現在の引き出し金額
	 * @return 挿入バー数
	 */
	int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw);
}

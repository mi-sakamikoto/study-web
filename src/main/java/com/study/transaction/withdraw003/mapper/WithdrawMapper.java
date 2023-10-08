package com.study.transaction.withdraw003.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 金を下ろすMapper
 */
public interface WithdrawMapper {

	/**
	 * 金を下ろす
	 *
	 * @param id          ユーザID
	 * @param withdrawNum 引き出し金額
	 * @return 更新バー数
	 */
	int withdrawById(@Param("id") String id, @Param("withdrawNum") Double withdrawNum);

	/**
	 * 引き出し記録
	 *
	 * @param history_seq      金を下ろすID
	 * @param id               ユーザID
	 * @param current_balance  現在の残高
	 * @param current_withdraw 現在の引き出し金額
	 * @return 挿入バー数
	 */
	int currentWithdraw(@Param("history_seq") String history_seq, @Param("id") String id, @Param("current_balance") Double current_balance, @Param("current_withdraw") Double current_withdraw);
}

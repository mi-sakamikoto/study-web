package com.study.transaction.deposit002.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 預金Mapper
 */
public interface DepositMapper {

	/**
	 * 預金
	 *
	 * @param id         ユーザID
	 * @param depositNum 預金金額
	 * @return 更新バー数
	 */
	int depositById(@Param("id") String id, @Param("depositNum") Double depositNum);

	/**
	 * 預金記録
	 *
	 * @param history_seq     預金ID
	 * @param id              ユーザID
	 * @param current_balance 現在の残高
	 * @param current_deposit 現在の預金金額
	 * @return 挿入バー数
	 */
	int currentDeposit(@Param("history_seq") String history_seq, @Param("id") String id, @Param("current_balance") Double current_balance, @Param("current_deposit") Double current_deposit);
}

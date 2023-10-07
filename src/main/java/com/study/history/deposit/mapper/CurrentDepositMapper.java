package com.study.history.deposit.mapper;

import org.apache.ibatis.annotations.Param;

public interface CurrentDepositMapper {
	int currentDeposit(@Param("history_seq") String history_seq, @Param("id") String id, @Param("current_balance") Double current_balance, @Param("current_deposit") Double current_deposit);
}

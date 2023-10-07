package com.study.history.deposit.mapper;

import org.apache.ibatis.annotations.Param;

public interface HistoryDepositMapper {
	int historyDeposit(@Param("history_seq") String history_seq, @Param("id") String id, @Param("balance") Double balance, @Param("history_deposit") Double history_deposit);
}

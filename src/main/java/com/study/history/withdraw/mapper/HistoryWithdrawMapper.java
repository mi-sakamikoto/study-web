package com.study.history.withdraw.mapper;

import org.apache.ibatis.annotations.Param;

public interface HistoryWithdrawMapper {
	int historyWithdraw(@Param("history_seq") String history_seq, @Param("id") String id, @Param("balance") Double balance, @Param("history_withdraw") Double history_withdraw);
}

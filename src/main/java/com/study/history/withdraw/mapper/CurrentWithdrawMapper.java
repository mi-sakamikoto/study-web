package com.study.history.withdraw.mapper;

import org.apache.ibatis.annotations.Param;

public interface CurrentWithdrawMapper {
	int currentWithdraw(@Param("history_seq") String history_seq, @Param("id") String id, @Param("current_balance") Double current_balance, @Param("current_withdraw") Double current_withdraw);
}

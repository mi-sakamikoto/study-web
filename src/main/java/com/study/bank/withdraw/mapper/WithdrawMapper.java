package com.study.bank.withdraw.mapper;

import org.apache.ibatis.annotations.Param;

public interface WithdrawMapper {
	int withdrawById(@Param("id") String id, @Param("withdrawNum") Double withdrawNum);
}

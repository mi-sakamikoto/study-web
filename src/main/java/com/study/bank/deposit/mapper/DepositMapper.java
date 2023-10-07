package com.study.bank.deposit.mapper;

import org.apache.ibatis.annotations.Param;


public interface DepositMapper {
	Double getBalance(@Param("id") String id);
	int depositById(@Param("id") String id, @Param("depositNum") Double depositNum);
}

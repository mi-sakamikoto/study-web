package com.study.bank.deposit.dao;

import com.study.bank.deposit.dto.AssetDto;

import java.util.List;

public interface DepositDao {
	Double getBalance(String id);
	int depositById(String id,Double depositNum);
}

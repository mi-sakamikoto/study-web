package com.study.bank.deposit.dao;

import com.study.bank.deposit.mapper.DepositMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepositDaoImp implements DepositDao {
	@Autowired
	private DepositMapper depositMapper;

	@Override
	public Double getBalance(String id) {
		return depositMapper.getBalance(id);
	}

	@Override
	public int depositById(String id, Double depositNum) {
		return depositMapper.depositById(id, depositNum);
	}
}

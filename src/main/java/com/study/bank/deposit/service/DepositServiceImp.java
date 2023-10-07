package com.study.bank.deposit.service;

import com.study.bank.deposit.dao.DepositDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepositServiceImp implements DepositService{
	@Autowired
	private DepositDao depositDao;
	@Override
	public double getBalance(String id) {
		return depositDao.getBalance(id);
	}

	@Override
	public int deposit(String id, double depositNum) {
		depositNum += getBalance(id);
		return depositDao.depositById(id,depositNum);
	}
}

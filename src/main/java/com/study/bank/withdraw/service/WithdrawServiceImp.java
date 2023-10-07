package com.study.bank.withdraw.service;

import com.study.bank.deposit.dao.DepositDao;
import com.study.bank.withdraw.dao.WithdrawDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WithdrawServiceImp implements WithdrawService{

	@Autowired
	private WithdrawDao withdrawDao;

	@Autowired
	private DepositDao depositDao;

	@Override
	public int withdraw(String id, Double withdrawNum) {
		double money;
		if (depositDao.getBalance(id) < withdrawNum){
			return 0;
		} else {
			money = depositDao.getBalance(id);
			money -= withdrawNum;
			return withdrawDao.withdrawById(id, money);
		}
	}
}

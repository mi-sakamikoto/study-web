package com.study.history.deposit.service;

import com.study.history.deposit.dao.CurrentDepositDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentDepositServiceImp implements CurrentDepositService {

	@Autowired
	private CurrentDepositDao currentDepositDao;

	@Override
	public int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit) {
		return currentDepositDao.currentDeposit(history_seq, id, current_balance, current_deposit);
	}
}

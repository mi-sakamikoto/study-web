package com.study.history.deposit.service;

import com.study.history.deposit.dao.HistoryDepositDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryDepositServiceImp implements HistoryDepositService{

	@Autowired
	HistoryDepositDao historyDepositDao;
	@Override
	public int historyDeposit(String history_seq, String id, Double balance, Double history_deposit) {
		return historyDepositDao.historyDeposit(history_seq, id, balance, history_deposit);
	}
}

package com.study.history.withdraw.service;

import com.study.history.withdraw.dao.HistoryWithdrawDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryWithdrawServiceImp implements HistoryWithdrawService{

	@Autowired
	HistoryWithdrawDao historyWithdrawDao;
	@Override
	public int historyWithdraw(String history_seq, String id, Double balance, Double history_withdraw) {
		return historyWithdrawDao.historyWithdraw(history_seq, id, balance, history_withdraw);
	}
}

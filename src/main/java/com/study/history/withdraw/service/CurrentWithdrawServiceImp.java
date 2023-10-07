package com.study.history.withdraw.service;

import com.study.history.withdraw.dao.CurrentWithdrawDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentWithdrawServiceImp implements CurrentWithdrawService {

	@Autowired
	private CurrentWithdrawDao currentWithdrawDao;

	@Override
	public int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw) {
		return currentWithdrawDao.currentWithdraw(history_seq, id, current_balance, current_withdraw);
	}
}

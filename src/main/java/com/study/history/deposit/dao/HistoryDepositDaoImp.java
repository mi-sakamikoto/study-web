package com.study.history.deposit.dao;

import com.study.history.deposit.mapper.HistoryDepositMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryDepositDaoImp implements HistoryDepositDao{

	@Autowired
	HistoryDepositMapper historyDepositMapper;
	@Override
	public int historyDeposit(String history_seq, String id, Double balance, Double history_deposit) {
		return historyDepositMapper.historyDeposit(history_seq, id, balance, history_deposit);
	}
}

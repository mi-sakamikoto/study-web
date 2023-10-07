package com.study.history.withdraw.dao;

import com.study.history.withdraw.mapper.HistoryWithdrawMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryWithdrawDaoimp implements HistoryWithdrawDao{

	@Autowired
	HistoryWithdrawMapper historyWithdrawMapper;
	@Override
	public int historyWithdraw(String history_seq, String id, Double balance, Double history_withdraw) {
		return historyWithdrawMapper.historyWithdraw(history_seq, id, balance, history_withdraw);
	}
}

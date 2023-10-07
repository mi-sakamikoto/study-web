package com.study.history.withdraw.dao;

import com.study.history.withdraw.mapper.CurrentWithdrawMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentWithdrawDaoImp implements CurrentWithdrawDao {

	@Autowired
	private CurrentWithdrawMapper currentWithdrawMapper;

	@Override
	public int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw) {
		return currentWithdrawMapper.currentWithdraw(history_seq, id, current_balance, current_withdraw);
	}
}

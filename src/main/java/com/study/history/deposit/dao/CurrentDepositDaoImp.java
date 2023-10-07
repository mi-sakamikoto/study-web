package com.study.history.deposit.dao;

import com.study.history.deposit.mapper.CurrentDepositMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentDepositDaoImp implements CurrentDepositDao {

	@Autowired
	private CurrentDepositMapper currentDepositMapper;

	@Override
	public int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit) {
		return currentDepositMapper.currentDeposit(history_seq, id, current_balance, current_deposit);
	}
}

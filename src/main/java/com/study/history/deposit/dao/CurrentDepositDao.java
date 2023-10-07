package com.study.history.deposit.dao;

public interface CurrentDepositDao {
	int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit);
}

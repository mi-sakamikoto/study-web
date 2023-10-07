package com.study.history.withdraw.dao;

public interface CurrentWithdrawDao {
	int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw);
}

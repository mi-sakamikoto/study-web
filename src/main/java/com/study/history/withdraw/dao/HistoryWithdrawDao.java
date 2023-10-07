package com.study.history.withdraw.dao;

public interface HistoryWithdrawDao {
	int historyWithdraw(String history_seq, String id, Double balance, Double history_withdraw);
}

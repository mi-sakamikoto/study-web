package com.study.history.deposit.dao;

public interface HistoryDepositDao {
	int historyDeposit(String history_seq, String id, Double balance, Double history_deposit);
}

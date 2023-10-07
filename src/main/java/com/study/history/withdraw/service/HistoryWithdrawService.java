package com.study.history.withdraw.service;

public interface HistoryWithdrawService {
	int historyWithdraw(String history_seq, String id, Double balance, Double history_withdraw);
}

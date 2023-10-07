package com.study.history.withdraw.service;

public interface CurrentWithdrawService {
	int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw);
}

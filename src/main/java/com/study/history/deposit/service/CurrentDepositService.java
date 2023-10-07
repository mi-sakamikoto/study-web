package com.study.history.deposit.service;

public interface CurrentDepositService {
	int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit);
}

package com.study.bank.deposit.service;

public interface DepositService {
	double getBalance(String id);
	int deposit(String id, double depositNum);
}

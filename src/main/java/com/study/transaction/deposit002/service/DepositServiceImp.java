package com.study.transaction.deposit002.service;

import com.study.transaction.common.balance.dao.BalanceDao;
import com.study.transaction.deposit002.dao.DepositDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 預金サービスクラス
 */
@Service
public class DepositServiceImp implements DepositService{

	/** 預金DAO */
	@Autowired
	private DepositDao depositDao;

	/** 残高DAO */
	@Autowired
	private BalanceDao balanceDao;

	/** @inheritDoc */
	@Override
	public int depositById(String id, double depositNum) {
		depositNum += balanceDao.getBalance(id);
		return depositDao.depositById(id, depositNum);
	}

	/** @inheritDoc */
	@Override
	public int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit) {
		return depositDao.currentDeposit(history_seq, id, current_balance, current_deposit);
	}
}

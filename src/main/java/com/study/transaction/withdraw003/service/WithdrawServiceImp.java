package com.study.transaction.withdraw003.service;

import com.study.transaction.common.balance.dao.BalanceDao;
import com.study.transaction.withdraw003.dao.WithdrawDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 金を下ろすサービスクラス
 */
@Service
public class WithdrawServiceImp implements WithdrawService{

	/** 金を下ろすDAO */
	@Autowired
	private WithdrawDao withdrawDao;

	/** 残高DAO */
	@Autowired
	private BalanceDao balanceDao;

	/** @inheritDoc */
	@Override
	public int withdrawById(String id, Double withdrawNum) {
		double money;
		if (balanceDao.getBalance(id) < withdrawNum){
			return 0;
		} else {
			money = balanceDao.getBalance(id);
			money -= withdrawNum;
			return withdrawDao.withdrawById(id, money);
		}
	}

	/** @inheritDoc */
	@Override
	public int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw) {
		return withdrawDao.currentWithdraw(history_seq, id, current_balance, current_withdraw);
	}
}

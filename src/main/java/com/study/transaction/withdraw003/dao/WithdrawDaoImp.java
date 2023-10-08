package com.study.transaction.withdraw003.dao;

import com.study.transaction.withdraw003.mapper.WithdrawMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 金を下ろすDAOクラス
 */
@Repository
public class WithdrawDaoImp implements WithdrawDao {

	/** 金を下ろすMAPPER */
	@Autowired
	private WithdrawMapper withdrawMapper;

	/** @inheritDoc */
	@Override
	public int withdrawById(String id, Double withdrawNum) {
		return withdrawMapper.withdrawById(id, withdrawNum);
	}

	/** @inheritDoc */
	@Override
	public int currentWithdraw(String history_seq, String id, Double current_balance, Double current_withdraw) {
		return withdrawMapper.currentWithdraw(history_seq, id, current_balance, current_withdraw);
	}
}

package com.study.transaction.common.balance.service;

import com.study.transaction.common.balance.dao.BalanceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 残高サービスクラス
 */
@Service
public class BalanceServiceImp implements BalanceService{

	/** 残高DAO */
	@Autowired
	private BalanceDao balanceDao;

	/** @inheritDoc */
	@Override
	public double getBalance(String id) {
		return balanceDao.getBalance(id);
	}
}

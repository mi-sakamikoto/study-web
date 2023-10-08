package com.study.transaction.deposit002.dao;

import com.study.transaction.deposit002.mapper.DepositMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 預金DAOクラス
 */
@Repository
public class DepositDaoImp implements DepositDao {

	/** 預金MAPPER */
	@Autowired
	private DepositMapper depositMapper;

	/** @inheritDoc */
	@Override
	public int depositById(String id, Double depositNum) {
		return depositMapper.depositById(id, depositNum);
	}

	/** @inheritDoc */
	@Override
	public int currentDeposit(String history_seq, String id, Double current_balance, Double current_deposit) {
		return depositMapper.currentDeposit(history_seq, id, current_balance, current_deposit);
	}
}

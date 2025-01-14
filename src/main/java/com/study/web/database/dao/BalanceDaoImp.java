package com.study.web.database.dao;

import com.study.web.database.mapper.BalanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 残高DAOクラス
 */
@Repository
public class BalanceDaoImp implements BalanceDao{

	/** 残高MAPPER */
	@Autowired
	private BalanceMapper balanceMapper;

	/** @inheritDoc */
	@Override
	public Double getBalance(String id) {
		return balanceMapper.getBalance(id);
	}
}

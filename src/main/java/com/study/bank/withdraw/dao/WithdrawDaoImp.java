package com.study.bank.withdraw.dao;

import com.study.bank.withdraw.mapper.WithdrawMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WithdrawDaoImp implements WithdrawDao{

	@Autowired
	private WithdrawMapper withdrawMapper;
	@Override
	public int withdrawById(String id, Double withdrawNum) {
		return withdrawMapper.withdrawById(id, withdrawNum);
	}
}

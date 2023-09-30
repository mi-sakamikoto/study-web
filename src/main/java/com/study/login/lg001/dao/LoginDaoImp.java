package com.study.login.lg001.dao;

import com.study.login.lg001.dto.AccountDto;
import com.study.login.lg001.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ログインDAOクラス
 */
@Repository
public class LoginDaoImp implements LoginDao {

	/** ログインMapper */
	@Autowired
	private LoginMapper loginMapper;

	/** @inheritDoc */
	@Override
	public List<AccountDto> getAccount(String id) {
		return loginMapper.getAccount(id);
	}
}
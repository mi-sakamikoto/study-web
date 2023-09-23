package com.study.login.lg001.dao;

import com.study.login.lg001.dto.AccountDto;
import com.study.login.lg001.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
		// TODO DB構築待ち
//		return loginMapper.getAccount(id);

		List<AccountDto> accountDtoList = new ArrayList<>();
		if (Objects.equals(id, "10001")) {
			AccountDto accountDto = new AccountDto();
			accountDto.setId(id);
			accountDto.setPassword("123456");
			accountDto.setName("田中");
			accountDtoList.add(accountDto);
		}

		return accountDtoList;
	}
}
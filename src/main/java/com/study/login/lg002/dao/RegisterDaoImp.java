package com.study.login.lg002.dao;

import com.study.login.lg001.dto.AccountDto;
import com.study.login.lg002.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RegisterDaoImp implements RegisterDao{
	@Autowired
	RegisterMapper registerMapper;
	@Override
	public int insertAccount(String id, String username, String personId, String password, Integer idType) {
		return registerMapper.insertAccount(id,username,personId,password,idType);
	}

	/*@Override
	public List<AccountDto> getAccount(String id) {
		return registerMapper.getAccount(id);
	}*/
}

package com.study.login.lg002.dao;

import com.study.login.lg002.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 登録DAOクラス
 */
@Repository
public class RegisterDaoImp implements RegisterDao {

	/** 登録Mapper */
	@Autowired
	RegisterMapper registerMapper;

	/** @inheritDoc */
	@Override
	public int insertAccount(String id, String username, String personId, String password, Integer idType) {
		return registerMapper.insertAccount(id, username, personId, password, idType);
	}

	/** @inheritDoc */
	@Override
	public int insertAsset(String id) {
		return registerMapper.insertAsset(id);
	}

}

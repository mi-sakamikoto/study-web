package com.study.login.lg002.service;

import com.study.login.lg002.dao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RegisterServiceImp implements RegisterService {
	/** 登録DAO */
	@Autowired
	private RegisterDao registerDao;

	/** @inheritDoc */
	@Override
	public int register(String id, String username, String personId, String password, String repassword, Integer idType) {
		if (Objects.equals(repassword, password)) {
			return registerDao.insertAccount(id, username, personId, password, idType);
		} else {
			return 0;
		}
	}

	/** @inheritDoc */
	@Override
	public int registerAsset(String id) {
		return registerDao.insertAsset(id);
	}
}

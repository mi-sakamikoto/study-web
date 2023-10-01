package com.study.login.lg002.dao;

import com.study.login.lg001.dto.AccountDto;

import java.util.List;

public interface RegisterDao {
	int insertAccount(String id, String username, String personId, String password, Integer idType);
}

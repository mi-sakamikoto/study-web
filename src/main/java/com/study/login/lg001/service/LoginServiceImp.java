package com.study.login.lg001.service;

import com.study.login.lg001.dao.LoginDao;
import com.study.login.lg001.dto.AccountDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * ログインサービスクラス
 */
@Service("loginService")
public class LoginServiceImp implements LoginService {
	/** ログインDAO */
	@Autowired
	private LoginDao loginDao;

	/** @inheritDoc */
	@Override
	public AccountDto login(String id, String password) {

		if (StringUtils.isEmpty(id) || StringUtils.isEmpty(password)) {
			return null;
		}

		AccountDto acc = null;

		List<AccountDto> accList = loginDao.getAccount(id);

		if (!CollectionUtils.isEmpty(accList)) {
			if (Objects.equals(accList.get(0).getPassword(), password)) {
				acc = accList.get(0);
			}
		}

		return acc;
	}
}

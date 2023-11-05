package com.study.web.login.lg001.service;

import com.study.web.common.Menu;
import com.study.web.database.dao.BalanceDao;
import com.study.web.login.lg001.dao.LoginDao;
import com.study.web.login.lg001.dto.AccountDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * ログインサービスクラス
 */
@Service("loginService")
public class LoginServiceImp implements LoginService {
	/** ログインDAO */
	@Autowired
	private LoginDao loginDao;

	/** 残高DAO */
	@Autowired
	private BalanceDao balanceDao;

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

	//残高取得
	public Double getBalance(String id){
		return balanceDao.getBalance(id);
	}

	public Map<String, String> getMenu(Integer idType) {
		Map<String, String> map = new LinkedHashMap<>();
		switch (idType) {
			case 0:
				// TODO 各種メニュー
				map.put("預金", Menu.DEPOSIT_URL);
				map.put("金を下ろす",Menu.WITHDRAW_URL);
				map.put("残高の照会",Menu.GET_BALANCE_URL);
				break;
			case 1:
				break;

		}


		return map;
	}
}

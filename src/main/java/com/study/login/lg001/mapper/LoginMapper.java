package com.study.login.lg001.mapper;

import com.study.login.lg001.dto.AccountDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ログインMapper
 */
public interface LoginMapper {
	/**
	 * アカウント取得
	 *
	 * @param id ユーザID
	 * @return アカウント情報
	 */
	List<AccountDto> getAccount(@Param("id") String id);
}

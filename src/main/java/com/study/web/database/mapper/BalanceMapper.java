package com.study.web.database.mapper;

import org.apache.ibatis.annotations.Param;

public interface BalanceMapper {

	/**
	 * 残高の取得
	 *
	 * @param id ユーザID
	 * @return 残高
	 */
	Double getBalance(@Param("id") String id);
}

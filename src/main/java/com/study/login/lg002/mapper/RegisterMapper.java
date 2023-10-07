package com.study.login.lg002.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * 登録Mapper
 */
public interface RegisterMapper {

	/**
	 * アカウント登録
	 *
	 * @param id       ユーザID
	 * @param name     名前
	 * @param personId 身分証番号
	 * @param password パスワード
	 * @param idType   アカウントタイプ
	 * @return 挿入バー数
	 */
	int insertAccount(@Param("id") String id, @Param("name") String name, @Param("personId") String personId, @Param("password") String password, @Param("idType") Integer idType);

	/**
	 * 銀行カード登録
	 *
	 * @param id ユーザID
	 * @return 挿入バー数
	 */
	int insertAsset(@Param("id") String id);

}

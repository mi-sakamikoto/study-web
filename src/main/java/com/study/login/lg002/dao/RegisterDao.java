package com.study.login.lg002.dao;

/**
 * 登録DAOインタフェース
 */
public interface RegisterDao {

	/**
	 * アカウント登録
	 *
	 * @param id       ユーザID
	 * @param username 名前
	 * @param personId 身分証番号
	 * @param password パスワード
	 * @param idType   アカウントタイプ
	 * @return 挿入バー数
	 */
	int insertAccount(String id, String username, String personId, String password, Integer idType);

	/**
	 * 銀行カード登録
	 * @param id ユーザID
	 * @return 挿入バー数
	 */
	int insertAsset(String id);
}

package com.study.login.lg002.service;

/**
 * 登録サービスインタフェース
 */
public interface RegisterService {

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
	int register(String id, String username, String personId, String password, String repassword, Integer idType);

	/**
	 * 銀行カード登録
	 * @param id ユーザID
	 * @return 挿入バー数
	 */
	int registerAsset(String id);
}

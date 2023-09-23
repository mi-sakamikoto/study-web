package com.study.login.lg001.dto;

/**
 * アカウントDTOクラス
 */
public class AccountDto {
	/** ユーザID */
	private String id;
	/** パスワード */
	private String password;
	/** 名前 */
	private String name;

	/** @return id */
	public String getId() {
		return id;
	}

	/** @param id to set. */
	public void setId(String id) {
		this.id = id;
	}

	/** @return password */
	public String getPassword() {
		return password;
	}

	/** @param password to set. */
	public void setPassword(String password) {
		this.password = password;
	}

	/** @return name */
	public String getName() {
		return name;
	}

	/** @param name to set. */
	public void setName(String name) {
		this.name = name;
	}
}
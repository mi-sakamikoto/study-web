package com.study.login.lg001.dto;

import java.util.Date;

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

	private String personId;
	private Integer idType;
	private String ins_user;
	private Date ins_dt;
	private String udp_user;
	private Date upd_dt;

	/** @return id */
	public String getId() {
		return id;
	}

	/** @param id to set */
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

	/** @return personId */
	public String getPersonId() {
		return personId;
	}

	/** @param personId to set. */
	public void setPersonId(String personId) {
		this.personId = personId;
	}

	/** @return idType */
	public Integer getIdType() {
		return idType;
	}

	/** @param idType to set */
	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	/** @return ins_user */
	public String getIns_user() {
		return ins_user;
	}

	/** @param ins_user to set */
	public void setIns_user(String ins_user) {
		this.ins_user = ins_user;
	}

	/** @return ins_dt */
	public Date getIns_dt() {
		return ins_dt;
	}

	/** @param ins_dt to set */
	public void setIns_dt(Date ins_dt) {
		this.ins_dt = ins_dt;
	}

	/** @return udp_user */
	public String getUdp_user() {
		return udp_user;
	}

	/** @param udp_user to set */
	public void setUdp_user(String udp_user) {
		this.udp_user = udp_user;
	}

	/** @return upd_dt */
	public Date getUpd_dt() {
		return upd_dt;
	}

	/** @param upd_dt to set */
	public void setUpd_dt(Date upd_dt) {
		this.upd_dt = upd_dt;
	}
}
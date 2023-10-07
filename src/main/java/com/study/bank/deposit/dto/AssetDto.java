package com.study.bank.deposit.dto;

import java.util.Date;

public class AssetDto {
	private String id;
	private Double balance;
	private Double ceiling;
	private Double ceiled;
	private Double loanamount;
	private String ins_user;
	private Date ins_dt;
	private String udp_user;
	private Date upd_dt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getCeiling() {
		return ceiling;
	}

	public void setCeiling(Double ceiling) {
		this.ceiling = ceiling;
	}

	public Double getCeiled() {
		return ceiled;
	}

	public void setCeiled(Double ceiled) {
		this.ceiled = ceiled;
	}

	public Double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(Double loanamount) {
		this.loanamount = loanamount;
	}

	public String getIns_user() {
		return ins_user;
	}

	public void setIns_user(String ins_user) {
		this.ins_user = ins_user;
	}

	public Date getIns_dt() {
		return ins_dt;
	}

	public void setIns_dt(Date ins_dt) {
		this.ins_dt = ins_dt;
	}

	public String getUdp_user() {
		return udp_user;
	}

	public void setUdp_user(String udp_user) {
		this.udp_user = udp_user;
	}

	public Date getUpd_dt() {
		return upd_dt;
	}

	public void setUpd_dt(Date upd_dt) {
		this.upd_dt = upd_dt;
	}
}

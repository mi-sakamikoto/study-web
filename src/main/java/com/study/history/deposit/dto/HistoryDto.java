package com.study.history.deposit.dto;

import java.util.Date;

public class HistoryDto {
	private String history_seq;
	private String history_insdt;
	private String id;
	private String balance;
	private String ceiling;
	private String ceiled;
	private String loanamount;
	private String ins_user;
	private Date ins_dt;
	private String upd_user;
	private Date udp_dt;
	private String history_deposit;
	private String history_withdraw;

	public String getHistory_seq() {
		return history_seq;
	}

	public void setHistory_seq(String history_seq) {
		this.history_seq = history_seq;
	}

	public String getHistory_insdt() {
		return history_insdt;
	}

	public void setHistory_insdt(String history_insdt) {
		this.history_insdt = history_insdt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getCeiling() {
		return ceiling;
	}

	public void setCeiling(String ceiling) {
		this.ceiling = ceiling;
	}

	public String getCeiled() {
		return ceiled;
	}

	public void setCeiled(String ceiled) {
		this.ceiled = ceiled;
	}

	public String getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(String loanamount) {
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

	public String getUpd_user() {
		return upd_user;
	}

	public void setUpd_user(String upd_user) {
		this.upd_user = upd_user;
	}

	public Date getUdp_dt() {
		return udp_dt;
	}

	public void setUdp_dt(Date udp_dt) {
		this.udp_dt = udp_dt;
	}

	public String getHistory_deposit() {
		return history_deposit;
	}

	public void setHistory_deposit(String history_deposit) {
		this.history_deposit = history_deposit;
	}

	public String getHistory_withdraw() {
		return history_withdraw;
	}

	public void setHistory_withdraw(String history_withdraw) {
		this.history_withdraw = history_withdraw;
	}
}

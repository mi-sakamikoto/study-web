package com.study.web.login.ajax.entity;

public class areaEntity {
	private String id;
	private String code;
	private String name;
	private String pcode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public areaEntity() {
	}

	public areaEntity(String id, String code, String name, String pcode) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.pcode = pcode;
	}
}

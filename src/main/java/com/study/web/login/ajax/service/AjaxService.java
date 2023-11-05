package com.study.web.login.ajax.service;

import com.study.web.login.ajax.entity.areaEntity;

import java.util.List;

public interface AjaxService {
	List<areaEntity> getProvince();

	List<areaEntity> getCity(String code);
}

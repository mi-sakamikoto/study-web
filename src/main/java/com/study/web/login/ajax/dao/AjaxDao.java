package com.study.web.login.ajax.dao;

import com.study.web.login.ajax.entity.areaEntity;

import java.util.List;

public interface AjaxDao {

	List<areaEntity> getProvince();

	List<areaEntity> getCity(String code);
}

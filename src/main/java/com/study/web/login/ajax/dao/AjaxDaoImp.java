package com.study.web.login.ajax.dao;

import com.study.web.login.ajax.entity.areaEntity;
import com.study.web.login.ajax.mapper.AjaxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AjaxDaoImp implements AjaxDao{

	@Autowired
	private AjaxMapper ajaxMapper;

	@Override
	public List<areaEntity> getProvince() {
		return ajaxMapper.getProvince();
	}

	@Override
	public List<areaEntity> getCity(String code) {
		return ajaxMapper.getCity(code);
	}
}

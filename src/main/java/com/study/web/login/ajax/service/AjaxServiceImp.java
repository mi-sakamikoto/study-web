package com.study.web.login.ajax.service;

import com.study.web.login.ajax.dao.AjaxDao;
import com.study.web.login.ajax.entity.areaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AjaxServiceImp implements AjaxService{

	@Autowired
	private AjaxDao ajaxDao;

	@Override
	public List<areaEntity> getProvince() {
		return ajaxDao.getProvince();
	}

	@Override
	public List<areaEntity> getCity(String code) {
		return ajaxDao.getCity(code);
	}
}

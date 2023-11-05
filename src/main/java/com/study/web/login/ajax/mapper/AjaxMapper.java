package com.study.web.login.ajax.mapper;

import com.study.web.login.ajax.entity.areaEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AjaxMapper {

	List<areaEntity> getProvince();

	List<areaEntity> getCity(@Param("code") String code);
}

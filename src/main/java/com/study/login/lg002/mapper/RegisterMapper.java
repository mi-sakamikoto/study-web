package com.study.login.lg002.mapper;

import com.study.login.lg001.dto.AccountDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterMapper {
	int insertAccount(@Param("id") String id, @Param("name") String name, @Param("personId") String personId, @Param("password") String password, @Param("idType") int idType);

}

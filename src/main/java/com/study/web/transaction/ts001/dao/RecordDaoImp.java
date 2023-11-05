package com.study.web.transaction.ts001.dao;

import com.study.web.database.entity.assetHistoryEntity;
import com.study.web.transaction.ts001.mapper.RecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecordDaoImp implements RecordDao {

	@Autowired
	private RecordMapper recordMapper;

	@Override
	public List<assetHistoryEntity> getRecord(String id) {
		return recordMapper.getRecord(id);
	}
}

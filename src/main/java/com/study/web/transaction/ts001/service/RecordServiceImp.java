package com.study.web.transaction.ts001.service;

import com.study.web.database.entity.assetHistoryEntity;
import com.study.web.transaction.ts001.dao.RecordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImp implements RecordService{

	@Autowired
	private RecordDao recordDao;

	@Override
	public List<assetHistoryEntity> getRecord(String id) {
		return recordDao.getRecord(id);
	}
}

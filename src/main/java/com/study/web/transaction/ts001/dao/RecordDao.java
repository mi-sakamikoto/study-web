package com.study.web.transaction.ts001.dao;

import com.study.web.database.entity.assetHistoryEntity;

import java.util.List;

public interface RecordDao {

	List<assetHistoryEntity> getRecord(String id);
}

package com.study.web.transaction.ts001.service;

import com.study.web.database.entity.assetHistoryEntity;

import java.util.List;

public interface RecordService {

	List<assetHistoryEntity> getRecord(String id);
}

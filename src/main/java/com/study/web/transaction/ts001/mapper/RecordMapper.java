package com.study.web.transaction.ts001.mapper;

import com.study.web.database.entity.assetHistoryEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordMapper {
	/**
	 * 最近のレコード
	 * @param id ユーザID
	 * @return 履歴情報
	 */
	List<assetHistoryEntity> getRecord(@Param("id") String id);
}

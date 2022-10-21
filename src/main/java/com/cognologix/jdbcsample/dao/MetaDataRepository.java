package com.cognologix.jdbcsample.dao;

import com.cognologix.jdbcsample.entity.MetaData;

import java.util.List;

public interface MetaDataRepository {
    List<MetaData> getMetaDataList();
}

package com.cognologix.jdbcsample.controller;

import com.cognologix.jdbcsample.dao.MetaDataRepository;
import com.cognologix.jdbcsample.entity.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MetaDataController {
    @Autowired
    @Qualifier("metadatabean")
    MetaDataRepository metaDataRepository;

    @GetMapping("/metadata")
    public List<MetaData> getMetaData(){
        return metaDataRepository.getMetaDataList();
    }
}

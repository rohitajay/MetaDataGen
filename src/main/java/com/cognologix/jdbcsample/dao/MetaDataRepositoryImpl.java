package com.cognologix.jdbcsample.dao;

import com.cognologix.jdbcsample.entity.MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("metadatabean")
public class MetaDataRepositoryImpl implements MetaDataRepository {
//    private static final String GET_EMPLOYEE_QUERY = "SELECT * FROM employees";
    private static final String GET_INFORMATION_SCHEMA = "select TABLE_NAME, COLUMN_NAME, DATA_TYPE from information_schema.columns";
    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Override
//    public List<Employee> getAllEmployeeList() {
//        return jdbcTemplate.query(GET_EMPLOYEE_QUERY,(row,rowNum)->{
//            return new Employee(row.getInt("id"), row.getString("first_name"), row.getString("last_name"));
//        });
//    }
@Override
public List<MetaData> getMetaDataList() {
    return jdbcTemplate.query(GET_INFORMATION_SCHEMA,(row,rowNum)->{
        return new MetaData(row.getString("TABLE_NAME"), row.getString("COLUMN_NAME"), row.getString("DATA_TYPE"));
    });
}
}

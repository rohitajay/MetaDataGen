package com.cognologix.jdbcsample.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MetaDataMapper implements RowMapper<MetaData> {
    @Override
    public MetaData mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        MetaData employee = new MetaData();
//        employee.setId(resultSet.getInt("id"));
//        employee.setFirst_name(resultSet.getString("first_name"));
//        employee.setLast_name(resultSet.getString("last_name"));
        employee.setTABLE_NAME(resultSet.getString("TABLE_NAME"));
        employee.setCOLUMN_NAME(resultSet.getString("COLUMN_NAME"));
        employee.setDATA_TYPE(resultSet.getString("DATA_TYPE"));
        return employee;
    }
}

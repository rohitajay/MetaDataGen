package com.cognologix.jdbcsample.entity;

public class MetaData {
//    private Integer id;
//    private String first_name;
//    private String last_name;

    private String TABLE_NAME;
    private String COLUMN_NAME;
    private String DATA_TYPE;

    public MetaData() {
    }

    public MetaData(String TABLE_NAME, String COLUMN_NAME, String DATA_TYPE) {
        this.TABLE_NAME = TABLE_NAME;
        this.COLUMN_NAME = COLUMN_NAME;
        this.DATA_TYPE = DATA_TYPE;
    }

    public String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public String getCOLUMN_NAME() {
        return COLUMN_NAME;
    }

    public String getDATA_TYPE() {
        return DATA_TYPE;
    }

    public void setTABLE_NAME(String TABLE_NAME) {
        this.TABLE_NAME = TABLE_NAME;
    }

    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME;
    }

    public void setDATA_TYPE(String DATA_TYPE) {
        this.DATA_TYPE = DATA_TYPE;
    }

    //    public Employee(Integer id, String first_name, String last_name) {
//        this.id = id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getFirst_name() {
//        return first_name;
//    }
//
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setFirst_name(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
}

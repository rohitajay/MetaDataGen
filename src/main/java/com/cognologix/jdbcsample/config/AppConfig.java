package com.cognologix.jdbcsample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@AutoConfiguration
@Configuration
@ComponentScan("com.congologix.jdbcsample")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Autowired
    Environment environment;

//    private final String URL = "jdbc:mysql://localhost:3306/db_cognologix";
    private final String URL = "jdbc:mysql://localhost:5432/db_cognologix";
    private final String USER = "postgres";
    private final String DRIVER =  "org.postgresql.Driver";   //   "com.mysql.cj.jdbc.Driver"
    private final String PASSWORD = "9419131674";

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUrl(environment.getProperty(URL));
        driverManagerDataSource.setUsername(environment.getProperty(USER));
        driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
        System.out.println("-----" + DRIVER);
        driverManagerDataSource.setDriverClassName("org.hibernate.dialect.PostgreSQL9Dialect");
        System.out.println("-----" + driverManagerDataSource);
        return driverManagerDataSource;
    }
}

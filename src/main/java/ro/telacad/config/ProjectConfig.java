/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import javax.activation.DataSource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Vlad
 */
@Configuration
@ComponentScan(basePackages="ro.telacad.*")
public class ProjectConfig {
    
    @Bean
    public DataSource dataSource(){
    
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/java4curs4");
        dataSource.setUsername("user1");
        dataSource.setPassword("12345");
        return dataSource;
    }//clasele STEA SUNT IN DEPENDENTA DE SPRING JDBC IN POM.XML
    @Bean
    @Autowired
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
    
        return new JdbcTemplate(dataSource);
    
    }
    
    
}

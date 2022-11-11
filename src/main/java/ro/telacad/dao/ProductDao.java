/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ro.telacad.db.Product;

/**
 *
 * @author Vlad
 */
@Repository
public class ProductDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public void addProduct(Product product){
    
        
        jdbcTemplate.update("INSERT INTO produse VALUES(NULL,?)", product.getNume());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.service;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ro.telacad.dao.ProductDao;
import ro.telacad.db.Product;

/**
 *
 * @author Vlad
 */
@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    
    
    
    public void adaugaZeceProduse(){
    Product product;
    for(int i=1;i<=10;i++){
    product=new Product("PRODUCT "+i);
    productDao.addProduct(product);
    
    
    }
    
    
    }
    
    
}

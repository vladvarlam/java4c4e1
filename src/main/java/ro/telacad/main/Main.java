/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ro.telacad.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.config.ProjectConfig;
import ro.telacad.service.ProductService;

/**
 *
 * @author Vlad
 */
public class Main {

    public static void main(String[] args) {
        
        
        
        try(AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)){
        
        ProductService service=context.getBean(ProductService.class);
        service.adaugaZeceProduse();
        
        }
        System.out.println("Hello World!");
    }
}

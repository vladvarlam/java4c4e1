/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.telacad.db;
;
import java.io.Serializable;

/**
 *
 * NU TREBUIA NEAPARAT SERIALIZABILA E FACUT SA FIE JAVA BEANS ACEASTA CLASA
 */

public class Product implements Serializable {
    
    private int id;
    private String nume;

    
    
    public Product(){}

    public Product(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Product(String nume) {
        this.nume = nume;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.odsmalsgranar.rest;

/**
 *
 * @author pontus
 */
public class Customer {
    
    public String name;
    public String adress;
    public String email;
    public String phone;
    
    public Customer(){}
    
    public Customer(String name, String adress, String email, String phone){
        this.name=name;
        this.adress=adress;
        this.email=email;
        this.phone=phone;
    }
}

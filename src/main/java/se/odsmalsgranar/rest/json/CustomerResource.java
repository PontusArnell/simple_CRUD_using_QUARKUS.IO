/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.odsmalsgranar.rest.json;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import se.odsmalsgranar.rest.Customer;


/**
 *
 * @author pontus
 */
@Path("/digg/user")
public class CustomerResource {
    
    private Set<Customer> customers =  Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
    
    public CustomerResource(){
        
    }
    
    @GET
    public Set<Customer> list(){
        return customers;
    }
    
    @POST
    public Set<Customer> add(Customer customer){
        customers.add(customer);
        return customers;
    }
    
    @DELETE
    public Set<Customer> delete(Customer customer){
        customers.removeIf(existingCustomer -> existingCustomer.name.contentEquals(customer.name) );
        return customers;
    }
    
    @PUT
    public Set<Customer> update(Customer customer){
        // should update if exist, remove and add pattern
        customers.removeIf(existingCustomer -> existingCustomer.name.contentEquals(customer.name) );
        customers.add(customer);
        return customers;
    }
    
}

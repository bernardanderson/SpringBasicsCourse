package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;
    
    /* (non-Javadoc)
     * @see com.pluralsight.repository.CustomerRepository#findAll()
     */
    @Override
    public List<Customer> findAll() {
        
        System.out.println(dbUsername);
        
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        
        customer.setFirstname("Bernie");
        customer.setLastname("Anderson");
        customers.add(customer);
        
        return customers;
    }
}

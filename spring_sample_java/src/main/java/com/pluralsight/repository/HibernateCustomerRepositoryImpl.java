package com.pluralsight.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;
    
    // In eclipe pass using 'Run configuration > Arguements > VM Arguements'
    //  in the box type -DsysUser='yourUser'
    @Value("#{systemProperties['sysUser']}")
    private String sysUser;
    
    @Override
    public List<Customer> findAll() {
        
        System.out.println(dbUsername);
        System.out.println(sysUser);
        
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        
        customer.setFirstname("Bernie");
        customer.setLastname("Anderson");
        customers.add(customer);
        
        return customers;
    }
}

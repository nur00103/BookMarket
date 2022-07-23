package com.example.bookshop.bookshop.dao;

import java.util.List;

import com.example.bookshop.bookshop.modul.Customer;


public interface CustomerDao {
    
    public List<Customer> getAllCustomer();
    
    public Customer getCustomerById(int id);
    
    public boolean updateCustomer(Customer c);
    
    public boolean addCustomer(Customer c);
    
    public boolean removeCustomer (int id);
    
    public List<Customer> searchCustomerData (String text);
    
    public Customer login(String username,String password);
   
    
}

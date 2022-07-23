/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.dao;

import java.util.List;

import com.example.bookshop.bookshop.modul.Product;

/**
 *
 * @author nur13
 */
public interface ProductDao {
    
    public List<Product> getAllProduct();
    
    public boolean updateProduct(Product p);
    
    public boolean addProduct(Product p);
    
    public boolean removeProduct (int id);
    
    public List<Product> searchProductData (String text);
}

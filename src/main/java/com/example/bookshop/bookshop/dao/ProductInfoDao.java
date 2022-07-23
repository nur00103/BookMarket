/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.dao;

import java.util.List;

import com.example.bookshop.bookshop.modul.ProductInfo;

/**
 *
 * @author nur13
 */
public interface ProductInfoDao {
    
    List <ProductInfo> getAllProductInfo();

    public void addProductInfo(ProductInfo productInfo)throws Exception;

    public void addProductInfo2(ProductInfo productInfo)throws Exception;

}

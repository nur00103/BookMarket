/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.ProductDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class ProductDaoImpl extends dbHelper implements ProductDao {

    @Override
    public List<Product> getAllProduct() {
        List<Product> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM PRODUCT");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int price = rs.getInt("PRICE");
                int discount = rs.getInt("DISCOUNT");
                int stock = rs.getInt("STOCK");

                Product product = new Product(id, name, price, discount, stock);
                result.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean updateProduct(Product c) {
        try (Connection cn = connect()) {
            PreparedStatement p = cn.prepareStatement("UPDATE PRODUCT SET ID=?,NAME=?,PRICE=?,DISCOUNT=?,STOCK=? WHERE ID=?");
            p.setInt(1, c.getProductId());
            p.setString(2, c.getProductName());
            p.setInt(3, c.getPrice());
            p.setInt(4, c.getDiscount());
            p.setInt(5, c.getStock());
            p.setInt(6, c.getProductId());

            return p.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addProduct(Product c) {
        try (Connection cn = connect()) {
            PreparedStatement p = cn.prepareStatement("INSERT INTO PRODUCT(ID,NAME,PRICE,DISCOUNT,STOCK) "
                    + "VALUES(S_PRODUCT.NEXTVAL,?,?,?,?)");
            p.setString(1, c.getProductName());
            p.setInt(2, c.getPrice());
            p.setInt(3, c.getDiscount());
            p.setInt(4, c.getStock());
            return p.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeProduct(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("DELETE FROM PRODUCT WHERE ID="+ id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Product> searchProductData(String text) {
        List<Product> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM PRODUCT WHERE ACTIVE=1 AND LOWER(NAME) LIKE LOWER(?)");
            p.setString(1, '%'+ text+'%');
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int price=rs.getInt("PRICE");
                int discount=rs.getInt("DISCOUNT");
                int stock=rs.getInt("STOCK");

                Product product = new Product(id, name,price,discount,stock);
                result.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    

}

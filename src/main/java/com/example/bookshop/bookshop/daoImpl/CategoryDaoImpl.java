/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.CategoryDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nur13
 */
public class CategoryDaoImpl extends dbHelper implements CategoryDao {

    @Override
    public List<Category> getAllCategory() {
        List<Category> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM CATEGORY");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int categoryId = rs.getInt("CATEGORY_ID");
                String type = rs.getString("TYPE");
                
                Category category = new Category(categoryId, type);
                result.add(category);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
    
}

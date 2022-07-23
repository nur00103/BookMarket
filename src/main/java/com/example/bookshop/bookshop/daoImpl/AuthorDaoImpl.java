/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.AuthorDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class AuthorDaoImpl extends dbHelper implements AuthorDao {

    @Override
    public List<Author> getAllAuthor() {
        List<Author> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM AUTHOR");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int authorId = rs.getInt("AUTHOR_ID");
                String authorName = rs.getString("AUTHOR_NAME");
                
                Author author = new Author(authorId, authorName);
                result.add(author);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
    
}

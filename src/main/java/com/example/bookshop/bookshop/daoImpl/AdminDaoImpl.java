/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.AdminDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class AdminDaoImpl extends dbHelper implements AdminDao {

    @Override
    public List<Admin> getAllAdmin() {
        List<Admin> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM ADMIN");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int adminId = rs.getInt("ID");
                String username = rs.getString("USERNAME");
                String password=rs.getString("PASSWORD");
                
                Admin admin = new Admin(adminId, username, password);
                result.add(admin);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
}

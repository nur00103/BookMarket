/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.TypeDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Tip;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class TypeDaoImpl extends dbHelper implements TypeDao {

    @Override
    public List<Tip> getAllType() {
        List<Tip> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM TYPE");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int typeId = rs.getInt("TYPE_ID");
                String type = rs.getString("TYPE");
                
                Tip ty = new Tip(typeId, type);
                result.add(ty);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
}

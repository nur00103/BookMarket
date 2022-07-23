/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.PubHouseDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.PubHouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class PubHouseDaoImpl extends dbHelper implements PubHouseDao {

    @Override
    public List<PubHouse> getAllPubHouse() {
        List<PubHouse> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM PUBLISHING_HOUSE");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int pubId = rs.getInt("PUB_ID");
                String pubName = rs.getString("PUB_NAME");
                
                PubHouse pubHouse = new PubHouse(pubId, pubName);
                result.add(pubHouse);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
}

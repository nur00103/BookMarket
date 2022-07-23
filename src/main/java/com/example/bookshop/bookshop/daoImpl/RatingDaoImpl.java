/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.RatingDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Rating;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class RatingDaoImpl extends dbHelper implements RatingDao {

    @Override
    public List<Rating> getAllRating() {
        List<Rating> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM RATING");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int ratingId = rs.getInt("RATING_ID");
                String rating = rs.getString("RATING");
                
                Rating rat = new Rating(ratingId, rating);
                result.add(rat);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
}

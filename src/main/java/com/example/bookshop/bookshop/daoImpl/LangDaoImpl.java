/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.LangDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Lang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class LangDaoImpl extends dbHelper implements LangDao {

    @Override
    public List<Lang> getAllLang() {
        List<Lang> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM LANG");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int langId = rs.getInt("LANG_ID");
                String language = rs.getString("LANGUAGE");
                
                Lang lang = new Lang(langId, language);
                result.add(lang);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
}

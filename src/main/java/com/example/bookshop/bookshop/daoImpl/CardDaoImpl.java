/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.CardDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Card;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nur13
 */
public class CardDaoImpl extends dbHelper implements CardDao {

    @Override
    public List<Card> getAllCard() {
        List<Card> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM CARD");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int cardId = rs.getInt("CARD_ID");
                int customerId = rs.getInt("CUSTOMER_ID");
                String cardName=rs.getString("CARD_NAME");
                String cardSurname=rs.getString("CARD_SURNAME");
                String cardDate=rs.getString("CARD_DATE");
                int cardCVV = rs.getInt("CARD_CVV");
                String cardTye=rs.getString("CARD_TYPE");
                String bankName=rs.getString("BANK_NAME");
                String cardNo=rs.getString("CARD_NO");
                
                Card card = new Card(cardId, customerId, cardName, cardSurname, cardDate, cardCVV, cardTye, bankName, cardNo);
                result.add(card);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.modul;

/**
 *
 * @author nur13
 */
public class Card {
    
    private int cardId;
    private int customerId;
    private String cardName;
    private String cardSurname;
    private String cardDate;
    private int cardCVV;
    private String cardType;
    private String bankName;
    private String cardNo;

    public Card() {
    }

    
    
    public Card(int cardId, int customerId, String cardName, String cardSurname, String cardDate, int cardCVV, String cardType, String bankName, String cardNo) {
        this.cardId = cardId;
        this.customerId = customerId;
        this.cardName = cardName;
        this.cardSurname = cardSurname;
        this.cardDate = cardDate;
        this.cardCVV = cardCVV;
        this.cardType = cardType;
        this.bankName = bankName;
        this.cardNo = cardNo;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardSurname() {
        return cardSurname;
    }

    public void setCardSurname(String cardSurname) {
        this.cardSurname = cardSurname;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    public int getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(int cardCVV) {
        this.cardCVV = cardCVV;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Card{" + "cardId=" + cardId + ", customerId=" + customerId + ", cardName=" + cardName + ", cardSurname=" + cardSurname + ", cardDate=" + cardDate + ", cardCVV=" + cardCVV + ", cardType=" + cardType + ", bankName=" + bankName + ", cardNo=" + cardNo + '}';
    }
    
    
    
}

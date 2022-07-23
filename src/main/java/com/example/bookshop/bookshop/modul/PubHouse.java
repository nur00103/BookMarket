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
public class PubHouse {
     private int pubId;
     private String pubName;

    public PubHouse() {
    }

    public PubHouse(int pubId, String pubName) {
        this.pubId = pubId;
        this.pubName = pubName;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    @Override
    public String toString() {
        return pubName;
    }
     
     
}

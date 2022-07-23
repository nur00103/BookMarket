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
public class Lang {
    
    private int langId;
    private String languange;

    public Lang() {
    }

    public Lang(int langId, String languange) {
        this.langId = langId;
        this.languange = languange;
    }

    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    public String getLanguange() {
        return languange;
    }

    public void setLanguange(String languange) {
        this.languange = languange;
    }

    @Override
    public String toString() {
        return languange;
    }
    
    
}

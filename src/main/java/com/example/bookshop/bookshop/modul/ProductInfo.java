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
public class ProductInfo {
    
    private int id;
    private Category category;
    private Product product;
    private Author author;
    private Tip type;
    private Lang lang;
    private int page;
    private PubHouse pubHouse;
    private String color;
    private String description;
    private int bestseller;

    public ProductInfo() {
    }

    public ProductInfo(int id, Category category, Product product, Author author, Tip type, Lang lang, int page, PubHouse pubHouse, String color, String description, int bestseller) {
        this.id = id;
        this.category = category;
        this.product = product;
        this.author = author;
        this.type = type;
        this.lang = lang;
        this.page = page;
        this.pubHouse = pubHouse;
        this.color = color;
        this.description = description;
        this.bestseller = bestseller;
    }

    public ProductInfo(Category category, Product product, Author author, Tip tip, Lang lang, int page, PubHouse pubHouse, String color, String description, int best) {
       this.category = category;
        this.product = product;
        this.author = author;
        this.type = type;
        this.lang = lang;
        this.page = page;
        this.pubHouse = pubHouse;
        this.color = color;
        this.description = description;
        this.bestseller = bestseller;
    }

    public ProductInfo(Category category, Product product, String color, String description, int bestseller) {
        
        this.category = category;
        this.product = product;
        this.color = color;
        this.description = description;
        this.bestseller = bestseller;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Tip getType() {
        return type;
    }

    public void setType(Tip type) {
        this.type = type;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public PubHouse getPubHouse() {
        return pubHouse;
    }

    public void setPubHouse(PubHouse pubHouse) {
        this.pubHouse = pubHouse;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBestseller() {
        return bestseller;
    }

    public void setBestseller(int bestseller) {
        this.bestseller = bestseller;
    }

    @Override
    public String toString() {
        return "ProductInfo{" + "id=" + id + ", category=" + category + ", product=" + product + ", author=" + author + ", type=" + type + ", lang=" + lang + ", page=" + page + ", pubHouse=" + pubHouse + ", color=" + color + ", description=" + description + ", bestseller=" + bestseller + '}';
    }
    
    
}

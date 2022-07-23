/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.ProductInfoDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nur13
 */
public class ProductInfoDaoImpl extends dbHelper implements ProductInfoDao {

    @Override
    public List<ProductInfo> getAllProductInfo() {
        List<ProductInfo> result = new ArrayList<>();
        try (Connection c = connect()) {
            String sql="SELECT PI.*,P.NAME PRODUCT_NAME,P.PRICE,P.STOCK,P.DISCOUNT,C.TYPE CATEGORY_NAME,A.AUTHOR_NAME,T.TYPE,L.LANGUAGE,PH.PUB_NAME  FROM PRODUCT_INFO PI\n" +
"LEFT JOIN PRODUCT P ON PI.PRODUCT_ID=P.ID\n" +
"LEFT JOIN CATEGORY C ON C.CATEGORY_ID=PI.CATEGORY_ID\n" +
"LEFT JOIN AUTHOR A ON A.AUTHOR_ID=PI.AUTHOR_ID\n" +
"LEFT JOIN TYPE T ON T.TYPE_ID=PI.TYPE_ID\n" +
"LEFT JOIN LANG L ON L.LANG_ID=PI.LANG_ID\n" +
"LEFT JOIN PUBLISHING_HOUSE PH ON PH.PUB_ID=PI.PUBLISHING_ID";
            PreparedStatement p = c.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                int categoryId=rs.getInt("CATEGORY_ID");
                int productId=rs.getInt("PRODUCT_ID");
                int authorId=rs.getInt("AUTHOR_ID");
                int typeId=rs.getInt("TYPE_ID");
                int langId=rs.getInt("LANG_ID");
                int pubHouseId=rs.getInt("PUBLISHING_ID");
                int page=rs.getInt("PAGE");
                String color=rs.getString("COLOR");
                String description=rs.getString("DESCRIPTION");
                int bestseller=rs.getInt("BESTSELLER");
                String productName=rs.getString("PRODUCT_NAME");
                int price=rs.getInt("PRICE");
                int stock=rs.getInt("STOCK");
                int discount=rs.getInt("DISCOUNT");
                String categoryName=rs.getString("CATEGORY_NAME");
                String authorName=rs.getString("AUTHOR_NAME");
                String typeName=rs.getString("TYPE");
                String langName=rs.getString("LANGUAGE");
                String pubHouseName=rs.getString("PUB_NAME");
                
                Product product=new Product();
                product.setProductId(productId);
                product.setProductName(productName);
                product.setPrice(price);
                product.setStock(stock);
                product.setDiscount(discount);
                
                Category category=new Category();
                category.setCategoryId(categoryId);
                category.setType(categoryName);
                
                Author author=new Author();
                author.setAuthorId(authorId);
                author.setAuthorName(authorName);
                
                Tip type=new Tip();
                type.setTypeId(typeId);
                type.setType(typeName);
                
                Lang lang=new Lang();
                lang.setLangId(langId);
                lang.setLanguange(langName);
                
                PubHouse pubHouse=new PubHouse();
                pubHouse.setPubId(pubHouseId);
                pubHouse.setPubName(pubHouseName);
                
                ProductInfo pi=new ProductInfo(id, category, product, author, type, lang, page, pubHouse, color, description, bestseller);
                 result.add(pi);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public void addProductInfo(ProductInfo productInfo) throws Exception {
        String sql="INSERT INTO PRODUCT_INFO(ID,CATEGORY_ID,PRODUCT_ID,AUTHOR_ID,TYPE_ID,LANG_ID,PAGE,PUBLISHING_ID,COLOR,DESCRIPTION,BESTSELLER)\n" +
"VALUES(PRODUCTINFO_S.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";
        try (Connection cn = connect()) {
            System.out.println(productInfo);
            PreparedStatement p = cn.prepareStatement(sql);
            p.setInt(1, productInfo.getCategory().getCategoryId());
            p.setInt(2, productInfo.getProduct().getProductId());
            p.setInt(3, productInfo.getAuthor().getAuthorId());
            p.setInt(4, productInfo.getType().getTypeId());
            p.setInt(5, productInfo.getLang().getLangId());
            p.setInt(6, productInfo.getPage());
            p.setInt(7, productInfo.getPubHouse().getPubId());
            p.setString(8,productInfo.getColor());
            p.setString(9, productInfo.getDescription());
            p.setInt(10, productInfo.getBestseller());
            p.execute();
            cn.commit();
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }

    @Override
    public void addProductInfo2(ProductInfo productInfo) throws Exception {
        String sql="INSERT INTO PRODUCT_INFO(ID,CATEGORY_ID,PRODUCT_ID,AUTHOR_ID,TYPE_ID,LANG_ID,PAGE,PUBLISHING_ID,COLOR,DESCRIPTION,BESTSELLER)\n" +
"VALUES(PRODUCTINFO_S.NEXTVAL,?,?,NULL,NULL,NULL,NULL,NULL,?,?,?)";
        try (Connection cn = connect()) {
            System.out.println(productInfo);
            PreparedStatement p = cn.prepareStatement(sql);
            p.setInt(1, productInfo.getCategory().getCategoryId());
            p.setInt(2, productInfo.getProduct().getProductId());
            p.setString(3,productInfo.getColor());
            p.setString(4, productInfo.getDescription());
            p.setInt(5, productInfo.getBestseller());
            p.execute();
            cn.commit();
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }
    
}

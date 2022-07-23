/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.swingCustomer;

import com.example.bookshop.bookshop.dao.*;
import com.example.bookshop.bookshop.modul.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author nur13
 */
public class NewProductInfoFrame extends javax.swing.JFrame {
    
    private CustomerDao c;
    private ProductDao pd;
    private ProductInfoDao pid;
    private Integer globalBtn;
    private AuthorDao ad;
    private CategoryDao cd;
    private LangDao ld;
    private PubHouseDao phd;
    private TypeDao td;
    
    public NewProductInfoFrame() {
        initComponents();
    }
    
    public NewProductInfoFrame(CustomerDao c, ProductDao pd, ProductInfoDao pid, AuthorDao ad, CategoryDao cd, LangDao ld, PubHouseDao phd, TypeDao td) {
        initComponents();
        this.c = c;
        this.pd = pd;
        this.pid = pid;
        this.ad = ad;
        this.ld = ld;
        this.phd = phd;
        this.cd = cd;
        this.td = td;
        showProductCb();
        showCategoryCb();
        showTypeCb();
        showPubHouseCb();
        showAuthorCb();
        showLangCb();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categorycb = new javax.swing.JComboBox<>();
        authorcb = new javax.swing.JComboBox<>();
        productcb = new javax.swing.JComboBox<>();
        langcb = new javax.swing.JComboBox<>();
        pubcb = new javax.swing.JComboBox<>();
        typecb = new javax.swing.JComboBox<>();
        pagetxt = new javax.swing.JTextField();
        desctxt = new javax.swing.JTextField();
        besttxt = new javax.swing.JTextField();
        colortxt = new javax.swing.JTextField();
        Category = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        categorycb.setModel(new DefaultComboBoxModel<>(new String[] { "Select Category", " " }));
        categorycb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorycbActionPerformed(evt);
            }
        });

        authorcb.setModel(new DefaultComboBoxModel<>(new String[] { "Select Author" }));

        productcb.setModel(new DefaultComboBoxModel<>(new String[] { "Select Product", " " }));
        productcb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productcbİtemStateChanged(evt);
            }
        });

        langcb.setModel(new DefaultComboBoxModel<>(new String[] { "Select Language", " " }));

        pubcb.setModel(new DefaultComboBoxModel<>(new String[] { "Select Publishing house", " " }));

        typecb.setModel(new DefaultComboBoxModel<>(new String[] { "Select Type", " " }));

        Category.setText("Category");

        jLabel2.setText("Product");

        jLabel3.setText("Author");

        jLabel4.setText("Language");

        jLabel5.setText("Publishing house");

        jLabel6.setText("Page");

        jLabel7.setText("Color");

        jLabel8.setText("Description");

        jLabel9.setText("Bestseller");

        jLabel10.setText("Type");

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        clearbtn.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pagetxt)
                    .addComponent(typecb, 0, 252, Short.MAX_VALUE)
                    .addComponent(productcb, 0, 252, Short.MAX_VALUE)
                    .addComponent(pubcb, 0, 252, Short.MAX_VALUE)
                    .addComponent(langcb, 0, 252, Short.MAX_VALUE)
                    .addComponent(authorcb, 0, 252, Short.MAX_VALUE)
                    .addComponent(categorycb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desctxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(besttxt)
                    .addComponent(colortxt, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categorycb, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productcb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorcb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typecb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(langcb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pubcb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pagetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(besttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categorycbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorycbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorycbActionPerformed

    private void productcbİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productcbİtemStateChanged
        
    }//GEN-LAST:event_productcbİtemStateChanged

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        try {
            com.example.bookshop.bookshop.modul.Category category = (Category) categorycb.getSelectedItem();
            Product product = (Product) productcb.getSelectedItem();
            if (category.getCategoryId()==1){
            Author author = (Author) authorcb.getSelectedItem();
            Tip type = (Tip) typecb.getSelectedItem();
            Lang lang = (Lang) langcb.getSelectedItem();
            PubHouse pubHouse = (PubHouse) pubcb.getSelectedItem();
            String pagest = pagetxt.getText();
            int page = Integer.parseInt(pagest);
            String color = colortxt.getText();
            String description = desctxt.getText();
            String bestst = besttxt.getText();
            int best = Integer.parseInt(bestst);
            ProductInfo productInfo = new ProductInfo(category, product, author, type, lang, page, pubHouse, color, description, best);
                productInfo.setType(type);
                pid.addProductInfo(productInfo);   
            } else {
                String color = colortxt.getText();
                String description = desctxt.getText();
                String bestst = besttxt.getText();
                int best = Integer.parseInt(bestst);
                ProductInfo productInfo=new ProductInfo(category, product, color, description, best);
                pid.addProductInfo2(productInfo);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Product Info has been added");
        this.dispose();
        
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JComboBox<String> authorcb;
    private javax.swing.JTextField besttxt;
    private javax.swing.JComboBox<String> categorycb;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField colortxt;
    private javax.swing.JTextField desctxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> langcb;
    private javax.swing.JTextField pagetxt;
    private javax.swing.JComboBox<String> productcb;
    private javax.swing.JComboBox<String> pubcb;
    private javax.swing.JButton savebtn;
    private javax.swing.JComboBox<String> typecb;
    // End of variables declaration//GEN-END:variables

    private void showProductCb() {
        try {
            DefaultComboBoxModel productCombo = (DefaultComboBoxModel) productcb.getModel();
            List<Product> products = pd.getAllProduct();
            for (Product product : products) {
                productCombo.addElement(product);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showCategoryCb() {
        try {
            DefaultComboBoxModel categoryCombo = (DefaultComboBoxModel) categorycb.getModel();
            List<Category> categories = cd.getAllCategory();
            for (Category category : categories) {
                categoryCombo.addElement(category);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showTypeCb() {
        try {
            DefaultComboBoxModel typeCombo = (DefaultComboBoxModel) typecb.getModel();
            List<Tip> types = td.getAllType();
            for (Tip type : types) {
                typeCombo.addElement(type);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showPubHouseCb() {
        try {
            DefaultComboBoxModel pubHouseCombo = (DefaultComboBoxModel) pubcb.getModel();
            List<PubHouse> pubs = phd.getAllPubHouse();
            for (PubHouse pubHouse : pubs) {
                pubHouseCombo.addElement(pubHouse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showAuthorCb() {
        try {
            DefaultComboBoxModel authorCombo = (DefaultComboBoxModel) authorcb.getModel();
            List<Author> authors = ad.getAllAuthor();
            for (Author author : authors) {
                authorCombo.addElement(author);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void showLangCb() {
        try {
            DefaultComboBoxModel langCombo = (DefaultComboBoxModel) langcb.getModel();
            List<Lang> langs = ld.getAllLang();
            for (Lang lang : langs) {
                langCombo.addElement(lang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

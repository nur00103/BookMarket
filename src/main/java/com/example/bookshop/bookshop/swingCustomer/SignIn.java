/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.swingCustomer;

import com.example.bookshop.bookshop.dao.*;
import com.example.bookshop.bookshop.daoImpl.*;
import com.example.bookshop.bookshop.modul.Admin;
import com.example.bookshop.bookshop.modul.Customer;
import com.example.bookshop.bookshop.modul.Login;

import javax.swing.JOptionPane;


/**
 *
 * @author nur13
 */
public class SignIn extends javax.swing.JFrame {

            CustomerDao c=new CustomerDaoImpl();
            ProductDao pd=new ProductDaoImpl();
            ProductInfoDao pid =new ProductInfoDaoImpl();
            
            AuthorDao ad=new AuthorDaoImpl();
            CategoryDao cd=new CategoryDaoImpl();
            LangDao ld=new LangDaoImpl();
            PubHouseDao phd=new PubHouseDaoImpl();
            TypeDao td =new TypeDaoImpl();
            AdminDao a=new AdminDaoImpl();
    
    private AdminDao an;
    private CustomerDao cr;

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }

    public SignIn(AdminDao a, CustomerDao cr) {
        initComponents();
        this.a = a;
        this.cr = cr;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        passwordtxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        signinbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.setText("Username");

        password.setText("Password");

        signinbtn.setText("Sign in");
        signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtnActionPerformed
        try {

            String username = usernametxt.getText();
            String password = passwordtxt.getText();

            for (Customer cs : c.getAllCustomer()) {
                if (username.equals(cs.getUsername()) && password.equals(cs.getPassword())) {
                     Login login=new Login(username, password,"Customer");
                     MainFrame mainFrame=new MainFrame(c,pd,pid,ad,cd,ld,phd,td,login);
                     mainFrame.setVisible(true);
                    
                     this.dispose();
                    break;
                } else {
                    for (Admin adn : a.getAllAdmin()) {
                        if (username.equals(adn.getUsername()) && password.equals(adn.getPassword())) {
                            Login login=new Login(username, password,"Admin");
                     MainFrame mainFrame=new MainFrame(c,pd,pid,ad,cd,ld,phd,td,login);
                             mainFrame.setVisible(true);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "User not found");
                        }
                    }

                    this.dispose();
                }
            }
        }
            catch (Exception e
        ) {
            e.printStackTrace();
    }
    }//GEN-LAST:event_signinbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordtxt;
    private javax.swing.JButton signinbtn;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}

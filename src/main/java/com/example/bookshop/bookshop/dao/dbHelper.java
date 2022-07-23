/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 *
 * @author nur13
 */
public class dbHelper {
    public Connection connect() throws Exception {
        Properties p=new Properties();
        p.load(new FileReader("config.properties"));
        Class.forName(p.getProperty("db.driver"));//Java 7 ve asaghi versiyalarda yazilmasi lazimdir
        String username = p.getProperty("db.username");
        String password = p.getProperty("db.password");
        Connection connection = DriverManager.getConnection(p.getProperty("db.url"), username, password);
        return connection;
    }
    
}

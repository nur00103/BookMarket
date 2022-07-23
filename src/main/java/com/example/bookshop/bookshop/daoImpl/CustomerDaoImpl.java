/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bookshop.bookshop.daoImpl;

import com.example.bookshop.bookshop.dao.CustomerDao;
import com.example.bookshop.bookshop.dao.dbHelper;
import com.example.bookshop.bookshop.modul.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nur13
 */
public class CustomerDaoImpl extends dbHelper implements CustomerDao {

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM CUSTOMER");
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String surname = rs.getString("SURNAME");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String address = rs.getString("ADDRESS");
                String city = rs.getString("CITY");
                String email = rs.getString("EMAIL");
                String phone = rs.getString("PHONE");

                Customer customer = new Customer(id, name, surname, username, password, address, city, email, phone);
                result.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public Customer getCustomerById(int customerId) {
        Customer result = null;
        try (Connection connection = connect()) {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER WHERE ID=" + customerId);
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String surname = rs.getString("SURNAME");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String address = rs.getString("ADDRESS");
                String city = rs.getString("CITY");
                String email = rs.getString("EMAIL");
                String phone = rs.getString("PHONE");

                Customer customer = new Customer(id, name, surname, username, password, address, city, email, phone);
                result = customer;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean updateCustomer(Customer c) {
        try (Connection cn = connect()) {
            PreparedStatement p = cn.prepareStatement("UPDATE CUSTOMER SET ID=?,NAME=?,SURNAME=?,USERNAME=?,PASSWORD=?,ADDRESS=?,CITY=?,EMAIL=?,PHONE=? WHERE ID=?");
            p.setInt(1, c.getId());
            p.setString(2, c.getName());
            p.setString(3, c.getSurname());
            p.setString(4, c.getUsername());
            p.setString(5, c.getPassword());
            p.setString(6, c.getAddress());
            p.setString(7, c.getCity());
            p.setString(8, c.getEmail());
            p.setString(9, c.getPhone());
            p.setInt(10, c.getId());
            return p.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addCustomer(Customer c) {
        try (Connection cn = connect()) {
            PreparedStatement p = cn.prepareStatement("INSERT INTO CUSTOMER(ID,NAME,SURNAME,USERNAME,PASSWORD,ADDRESS,CITY,EMAIL,PHONE) "
                    + "VALUES(S_CUSTOM.NEXTVAL,?,?,?,?,?,?,?,?)");
            p.setString(1, c.getName());
            p.setString(2, c.getSurname());
            p.setString(3, c.getUsername());
            p.setString(4, c.getPassword());
            p.setString(5, c.getAddress());
            p.setString(6, c.getCity());
            p.setString(7, c.getEmail());
            p.setString(8, c.getPhone());
            return p.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean removeCustomer(int id) {
        try (Connection c = connect()) {
            Statement stmt = c.createStatement();
            return stmt.execute("DELETE FROM CUSTOMER WHERE ID="+ id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<Customer> searchCustomerData(String text) {
        List<Customer> result = new ArrayList<>();
        try (Connection c = connect()) {
            PreparedStatement p = c.prepareStatement("SELECT * FROM CUSTOMER WHERE ACTIVE=1 AND LOWER(NAME) LIKE LOWER(?) OR LOWER(SURNAME) LIKE LOWER(?) OR LOWER(USERNAME) LIKE LOWER(?)");
            p.setString(1, '%'+ text+'%');
            p.setString(2, '%'+ text+'%');
            p.setString(3, '%'+ text+'%');
            ResultSet rs = p.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String surname = rs.getString("SURNAME");
                String username = rs.getString("USERNAME");
                String password = rs.getString("PASSWORD");
                String address = rs.getString("ADDRESS");
                String city = rs.getString("CITY");
                String email = rs.getString("EMAIL");
                String phone = rs.getString("PHONE");

                Customer customer = new Customer(id, name, surname, username, password, address, city, email, phone);
                result.add(customer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public Customer login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

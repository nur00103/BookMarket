package com.example.bookshop.bookshop.modul;
public class Customer {
    private int id;
    private String name;   
    private String surname;
    private String username;
    private String password;
    private String address;
    private String city;
    private String email;
    private String phone;

    public Customer() {
    }

    public Customer(int id, String name, String surname, String username, String password, String address, String city, String email, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phone = phone;
    }

    public Customer(String name, String surname, String username, String password, String address, String city, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.address = address;
        this.city = city;
        this.email = email;
        this.phone = phone;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", username=" + username + ", password=" + password + ", address=" + address + ", city=" + city + ", email=" + email + ", phone=" + phone + '}' +"\n";
    }
    
    
    
    
            
}

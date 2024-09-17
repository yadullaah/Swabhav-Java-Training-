package com.entity;

public class Customer {
    private int customerID;
    private String customerFirstName;
    private String customerLastName;
    private String username;
    private String password;

    public Customer() {
    	super();

    }
    public Customer(int customerID, String customerFirstName, String customerLastName, String username, String password) {
        super();
        this.customerID = customerID;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.username = username;
        this.password = password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
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
}

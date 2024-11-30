/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;


import java.util.ArrayList;
import java.util.List;

/**
 *
 *lam
 */
public class Customer extends User {
    private static int customerCreatedCount = 0;
    private static int currentCustomerID = 1000;
    private String customerID;
    private double AccBalance;
    private UserInfo userInfo;
    private OrderHistory ownHistory = new OrderHistory();

   

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", AccBalance=" + AccBalance + '}';
    }

    @Override
    public void viewMenu() {
        System.out.println("\n\n\n\n\n\n\n\n|       CUSTOMER MENU         |");
        System.out.println("|_____________________________|");
        System.out.println("|   1. Purchase               |");
        System.out.println("|   2. Order History          |");
        System.out.println("|   3. Logout                 |");
        System.out.println("|-----------------------------|");
        System.out.print("Enter your selection: ");
    }

    
    //constructor
    public Customer(String Username, String Password){
        super(Username, Password);
        this.customerID = "C" + currentCustomerID;
        this.AccBalance = 0;
        
    }
    public Customer( String Username, String Password, UserInfo userInfo) {
        super(Username, Password);
        this.userInfo = userInfo;
        this.customerID = "C" + currentCustomerID;
        this.AccBalance = 0;
        currentCustomerID++;
        customerCreatedCount++;
    }

    public static int getCustomerCreatedCount() {
        return customerCreatedCount;
    }

    public static void setCustomerCreatedCount(int customerCreatedCount) {
        Customer.customerCreatedCount = customerCreatedCount;
    }
    
    
    
    public static int getCurrentCustomerID() {
        return currentCustomerID;
    }
    
      public static void setCurrentCustomerID(int currentCustomerID) {
        Customer.currentCustomerID = currentCustomerID;
    }
      
    public String getCustomerID(){
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public double getAccBalance() {
        return AccBalance;
    }

    //gettor&setter
    public void setAccBalance(double AccBalance) {
        this.AccBalance = AccBalance;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public OrderHistory getOwnHistory() {
        return ownHistory;
    }

    
    
    /*public void getOwnHistory() {
        //ownHistory.viewOwnHistoryContent(ownHistory);
    }*/

    public void setOwnHistory(OrderHistory ownHistory) {
        this.ownHistory = ownHistory;
    }

    public void copyOwnOrderHistory(Order order){
        //ownHistory.addOwnOrder(order);

    }
    
    


    
    
}

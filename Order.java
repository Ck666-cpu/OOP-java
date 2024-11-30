/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
 

public class Order {
    private ShoppingCart cart;
    private CheckOut checkout;
    private CheckOut[] allCheckout;
    private LocalDateTime timeOfPurchase; // new
    private int itemCount = 0;
    private int allCheckoutCount = 0;

    public Order(ShoppingCart cart, CheckOut checkout) {
        this.cart = cart;
        //this.checkout = checkout;
        this.allCheckout = new CheckOut[100];
        this.timeOfPurchase = checkout.getNow(); // new
        this.itemCount = cart.getItemCount();
        //this.allCheckoutCount = 0;
        
    }

    public Order() {
        this.cart = new ShoppingCart();
        this.allCheckout = new CheckOut[100];
        this.allCheckoutCount = 0;
    }


    public Order salesRecord(Order totalOrder, Order order){
        
        Product product = new Product();
        int quantity = 0;
        int itemCount = order.getCart().getItemCount();
        for(int i = 0; i<itemCount; i++){
            product = order.getCart().getItems(i).getProduct();
            quantity = order.getCart().getItems(i).getQuantity();
            totalOrder.getCart().addItem(product, quantity);
        }
        
        return totalOrder;
    }
    
    
    
    public void viewTodaySales(Order totalOrder){
        totalOrder.getCart().viewCartContent();
        //cart.viewCartContent();
    }

    public void viewOrderDetails() {
        
        cart.viewCartContent1(itemCount);
        //System.out.printf("Total Amount: RM %.2f\n", cart1.calculateTotal());
        //System.out.println("Payment Method: " + order.getCheckout().getPaymentMethod());
        System.out.println("Time of Purchase: " + timeOfPurchase.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))); // new
    }
    
    public void viewOrdersDetails() {
        cart.viewCartContent1(itemCount);
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void displayAllCheckout(CheckOut[] allCheckout) {
        for (int i =0; i<allCheckoutCount; i++){
            System.out.println("\n\n\nOrder " + i);
            System.out.println("----------------------\n\n\n");
            allCheckout[i].generateReceipt(allCheckout[i]);
            System.out.println("\n\n\n----------------------\n\n\n");
        }
    }

    public CheckOut getAllCheckout(int i) {
        return allCheckout[i];
    }

    public CheckOut[] getAllCheckout() {
        return allCheckout;
    }
    
    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    
    public int getAllCheckoutCount() {
        return allCheckoutCount;
    }

    public void setAllCheckoutCount(int allCheckoutCount) {
        this.allCheckoutCount = allCheckoutCount;
    }
    
    

    public void setNewAllCheckout(CheckOut checkout) {
        this.allCheckout[allCheckoutCount] = checkout;
        this.allCheckout[allCheckoutCount].getCart().setItemCount(checkout.getCart().getItemCount());
        allCheckoutCount++;
    }

    public CheckOut getCheckout() {
        return checkout;
    }

    public void setCheckout(CheckOut checkout) {
        this.checkout = checkout;
    }

    

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }
}


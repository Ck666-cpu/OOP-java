/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;



import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CheckOut { 
    private static double tax = 0.1;
    private ShoppingCart cart;
    private LocalDateTime now;
    private String paymentMethod;
    private double totalCheckoutAmount;
    private String customerName;
    Scanner scanner = new Scanner(System.in);

    // Constructor
    public CheckOut(ShoppingCart cart, SystemManager manager) { //maybe OrderHistory orderHistory
        this.cart = cart;
        setCart(cart);
        setCustomerName(manager.getCusts().getUsername());
        this.cart.setItemCount(cart.getItemCount());
    }
    
    public CheckOut(){
        
    }


    
    
    // Method to process checkout and print the final total
    public CheckOut processCheckout(CheckOut checkout ) {
        totalCheckoutAmount = checkout.getCart().calculateTotal() + ((checkout.getCart().calculateTotal())*tax);
        System.out.printf("The total amount for your cart is: RM %.2f\n", totalCheckoutAmount);
        checkout = selectPaymentMethod(checkout); // Prompt to select payment method        
        
        return checkout;
        
    }
    

    // Method to select payment method
    public CheckOut selectPaymentMethod(CheckOut checkout) {
        //cart.viewCartContent();
        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. TnG");
        boolean paymentSuccess = true;
        boolean invalidPaymentType = true;
        do{
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkout = processCreditCard(checkout);
                    invalidPaymentType = false;
                    break;
                case 2:
                    checkout= processTng(checkout);
                    invalidPaymentType = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }while(invalidPaymentType);
        
        if(paymentSuccess){
            generateReceipt(checkout);
        }
        
        return checkout;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Method to process credit card payment with validation
    private CheckOut processCreditCard(CheckOut checkout) {
        boolean paymentSuccess;
        System.out.print("Enter your 16-digit credit card number: ");
        String cardNumber = scanner.nextLine();
        /*do{
            paymentSuccess = true;
            if (validateCreditCard(cardNumber)) {*/
                System.out.println("Credit card payment successful.");
                checkout.setPaymentMethod("credit card");

           /*} else {
                System.out.println("Invalid credit card number. Please try again.");
                paymentSuccess = false;
                
            }
        }while(paymentSuccess = false);*/
        
        return checkout;
    }

    // Method to validate credit card number (16 digits)
    private boolean validateCreditCard(String cardNumber) {
        return cardNumber.length() == 16 && cardNumber.matches("\\d{16}"); // Check if it's 16 digits long and contains only numbers
    }

    // Method to process TnG payment with validation
    private CheckOut processTng(CheckOut checkout) {
        boolean paymentSuccess;
        System.out.print("Enter your 10-digit TnG phone number: ");
        String phoneNumber = scanner.next();
        /*do{
            paymentSuccess = true;
            if (validateTng(phoneNumber)) {*/
                System.out.println("TnG payment successful.");
                checkout.setPaymentMethod("tng");
                
            /*} else {
                System.out.println("Invalid TnG phone number. Please try again.");
                paymentSuccess = false;
            }
        }while(paymentSuccess = false);*/
        
        return checkout;
    }

    // Method to validate TnG phone number (10 digits)
    private boolean validateTng(String phoneNumber) {
        return phoneNumber.length() == 10 && phoneNumber.matches("\\d+"); // Check if it's 10 digits long and contains only numbers
    }
    
    // Method to get the formatted date and time
    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //return orderDateTime.format(formatter);
        return now.format(formatter);
    }

    
    // Method to generate a receipt (optional)
    public void generateReceipt(CheckOut checkout) {
        System.out.println("Generating receipt...\n\n\n\n\n");
        checkout.getCart().viewCartContent(); // Reuse the viewCartContent method to show the items
        System.out.printf("\nTotal Amount Due after delivery fee is: RM %.2f\n", checkout.getTotalCheckoutAmount());
        System.out.println("Thank you for shopping with us!");
        completeCheckout(checkout);
    }
     
     public void completeCheckout(CheckOut checkout) {
        this.now = LocalDateTime.now();

        System.out.println("Checkout completed on: " + getFormattedDateTime());
         System.out.println("Customer name = " + getCustomerName());
        System.out.println("Using: " + checkout.getPaymentMethod());
    }
     
     public LocalDateTime getNow() {
        return now;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getTotalCheckoutAmount() {
        return totalCheckoutAmount;
    }

    public void setTotalCheckoutAmount(double totalCheckoutAmount) {
        this.totalCheckoutAmount = totalCheckoutAmount;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
}

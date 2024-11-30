/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;


import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class OrderHistory {
    private CheckOut[] checkout;
    private CartItem[] items;
    private int itemCount = 0; // Tracks the number of items currently in the cart
    private static final int INITIAL_CAPACITY = 5; // Initial array size
    private int totalSystemCheckoutCount = 0;
    //private Order[] orders; // Array to store the orders
    //private Order orders;
    /*private int orderCount = 0;  // Keep track of how many orders have been added
    private static final int MAX_ORDERS = 100; // Set a maximum number of orders
    private static int sumOrderCount = 0;*/
    //private int orderCount1 = 0;
    
    
    //constructor
    public OrderHistory() {
        //orders = new Order[MAX_ORDERS]; // Initialize the array
        //orderCount = 0; // Initially, no orders have been added
        this.items = new CartItem[INITIAL_CAPACITY];
        this.checkout = new CheckOut[100];  //initial 100 checkout for system/customer records
    }
    
    public void recordNewCheckout(Order order){
        for(int i=0; i<order.getAllCheckoutCount(); i++){
            setCheckout(order.getAllCheckout(i));
            //totalSystemCheckoutCount++;
        }
    }

    public void displayAllCheckout(){
        System.out.println("\nTotal Receipt\n");
        for (int i=0; i<totalSystemCheckoutCount; i++){
            System.out.println("\nCheckout " + (i+1));
            getCheckout(i).generateReceipt(getCheckout(i));
        }
        System.out.println("-------------END--------------");
    }
    
    
    //getter & setter
    public CheckOut[] getCheckout() {
        return checkout;
    }
    
    public CheckOut getCheckout(int i){
        return checkout[i];
    }
    
    public void setCheckout(CheckOut checkout) {
        this.checkout[totalSystemCheckoutCount] = checkout;
        totalSystemCheckoutCount++;
    }
    
    public int getTotalSystemCheckoutCount() {
        return totalSystemCheckoutCount;
    }

    public void setTotalSystemCheckoutCount(int totalSystemCheckoutCount) {
        this.totalSystemCheckoutCount = totalSystemCheckoutCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
        
    
    
    /*public int getOrderCount() {
        
        return orderCount;
    }*/
    /*public Order getOrders() {
        return this.orders[orderCount - 1];
    }
    
    public Order getOrdersforHistory(int i){
        return this.orders[i];
    }

    public void setOrders(Order orders) {
        this.orders[orderCount] = orders;
    }

    public void getOrderHistory() {

        viewHistoryContent();
    }*/
    
    /*public void addOwnOrder(Order order){
        setOrders(order);
        
        orderCount++;
    }

    // Method to add an order to the history
    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }


    public void addOrder(Order order) {
        //System.out.println(order);
        setOrders(order);      
        orderCount++; // Increment the order count after adding
        System.out.println("Order added");

    }
    
    public void addSumOrder(Order order) {
            orders[sumOrderCount] = order;
            sumOrderCount++; // Increment the order count after adding

    }
    

    public void viewHistoryContent() {
        if (itemCount == 0) {
            System.out.println("\nYour history is empty.");
        } else {
            
            System.out.println("");
            System.out.println("Detailed view of your shopping cart:\n");
            //double totalPrice = 0.0;
            for(int j=0; j<itemCount; j++){
                System.out.println("Order " + (j+1));
                System.out.println("=============================================================================================================================================");
                for (int i = 0; i < orders[j].getItemCount(); i++) {
                    //orders[j].getCart1().viewCartContent();
                    orders[j].viewOrderDetails();
                }
                System.out.println("=============================================================================================================================================");
                //System.out.printf("\nTotal Price: RM %.2f\n", totalPrice);
            }
            
        }
    }
    
        public void viewSumHistoryContent(OrderHistory orderHistory) {
            if (sumOrderCount == 0) {
                System.out.println("\nSystem do not have order history.");
            } else {
                for (int i = 0; i<sumOrderCount; i++){
                    orderHistory.getOrdersforHistory(i).viewOrderDetails();
                }
            }
        }
        
        public void viewOwnHistoryContent(OrderHistory orderHistory){
            if(orderCount == 0){
                System.out.println("Your history is empty.");
            }else{
                for(int i=0; i<orderHistory.getItemCount(); i++){
                    orderHistory.viewHistoryContent();
                }
            }
        }
        
        public void getOrderHistoryCopy(){
            
        }
    
    public void addItem(Product product, int quantity) {
        // Check if the product is already in the cart
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProduct().getId() == product.getId()) {
                // Product already exists in the cart; update the quantity
                items[i].setQuantity(items[i].getQuantity() + quantity);
                return;
            }
        }

        // Check if the array is full
        if (itemCount == items.length) {
            resizeArray();
        }

        // Add new item to the cart
        items[itemCount] = new CartItem(product, quantity);
        itemCount++;
    }
    
    private void resizeArray() {
        CartItem[] newItems = new CartItem[items.length * 2];
        for (int i = 0; i < itemCount; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }*/
    
    
}

    
   

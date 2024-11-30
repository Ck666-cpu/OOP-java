/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;


/**
 *
 * @author 27cv
 */
public class ShoppingCart {
    private CartItem[] items;
    private int itemCount; // Tracks the number of items currently in the cart
    private int orderCount = 0;
    private static final int INITIAL_CAPACITY = 5; // Initial array size
    private double cartTotalAmount;
   

    public ShoppingCart() {
        this.items = new CartItem[INITIAL_CAPACITY];
        this.itemCount = 0;
    }
    
    public Product retrieveProduct(int i){
        return items[i].getProduct();
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public CartItem getItems(int i) {
        return items[i];
    }

    public void setItems(CartItem[] items) {
        this.items = items;
    }
    
    

    public void recordSale(ShoppingCart cart){
        
    }
    
    // Method to add a product to the cart
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
    
    public void addTotalItem(Product product, int quantity) {
        
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

    // method to clear all items in the item[]
    public void clearItem() {
        for (int i = 0; i < itemCount; i++) {
            
                items[itemCount] = null; // Nullify the  item
                
                //return;
            }
        itemCount = 0;
        }
        
    // Method to remove a product from the cart 
    public void removeItem(int productId) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProduct().getId() == productId) {
                // Shift items to the left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[itemCount - 1] = null; // Nullify the last item
                itemCount--;
                System.out.println("Product with ID " + productId + " removed from the cart.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found in the cart.");
    }

    // Method to view cart content in a different format
    public void viewCartContent() {
        if (itemCount == 0) {
            System.out.println("\nYour shopping cart is empty.");
        } else {
            System.out.println("");
            System.out.println("Detailed view of your shopping cart:\n");
            double totalPrice = 0.0;
            for (int i = 0; i < itemCount; i++) {
                Product product = items[i].getProduct();
                int quantity = items[i].getQuantity();
                double itemTotal = product.getPrice() * quantity;
                totalPrice += itemTotal;
                System.out.println("=============================================================================================================================================");
                System.out.printf("%s (ID: %d) - Quantity: %d - Unit Price: RM %.2f - Total Price: RM %.2f\n", 
                                  product.getName(), product.getId(), quantity, product.getPrice(), itemTotal);
            }
            System.out.println("=============================================================================================================================================");
            System.out.printf("\nTotal Price: RM %.2f\n", totalPrice);
        }
    }
    
    public void viewCartContent1(int orderCount) {
        if (orderCount == 0) {
            System.out.println("\nYour shopping cart is empty.");
        } else {
            int i = (orderCount-1);
            System.out.println("");
            System.out.println("Detailed view of your shopping cart:\n");
            double totalPrice = 0.0;

                Product product = items[i].getProduct();
                int quantity = items[i].getQuantity();
                double itemTotal = product.getPrice() * quantity;
                totalPrice += itemTotal;
                System.out.println("=============================================================================================================================================");
                System.out.printf("%s (ID: %d) - Quantity: %d - Unit Price: RM %.2f - Total Price: RM %.2f\n", 
                                  product.getName(), product.getId(), quantity, product.getPrice(), itemTotal);

            System.out.println("=============================================================================================================================================");
            System.out.printf("\nTotal Price: RM %.2f\n", totalPrice);
        }
    }
    
    public void viewCartContent2(int itemCount){
        if (itemCount == 0) {
            System.out.println("\nToday no sales.");
        } else {
            int i = (itemCount-1);
            System.out.println("");
            System.out.println("\n\n\n\n\n\nToday total sales\n");
            double totalRevenue = 0.0;
            System.out.println("=============================================================================================================================================");
            for(int j = 0; j<itemCount; j++ ){
                Product product = items[i].getProduct();
                int quantity = items[i].getQuantity();
                double itemTotal = product.getPrice() * quantity;
                totalRevenue += itemTotal;
                System.out.printf("%s (ID: %d) - Quantity: %d - Unit Price: RM %.2f - Total Price: RM %.2f\n", 
                                  product.getName(), product.getId(), quantity, product.getPrice(), itemTotal);
                
            }
            System.out.println("=============================================================================================================================================");
            System.out.printf("\nTotal Revenue: RM %.2f\n", totalRevenue);
        }
    }

    // Method to calculate the total price of items in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            Product product = items[i].getProduct();
            total += product.getPrice() * items[i].getQuantity();
        }
        setCartTotalAmount(total);
        return total;
    } 

    // Method to resize the array when the cart is full
    private void resizeArray() {
        CartItem[] newItems = new CartItem[items.length * 2];
        for (int i = 0; i < itemCount; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    public double getCartTotalAmount() {
        return cartTotalAmount;
    }

    public void setCartTotalAmount(double cartTotalAmount) {
        this.cartTotalAmount = cartTotalAmount;
    }
    
    
}

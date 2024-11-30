/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ItemSearch {

    // Search products by name
    public ArrayList<Product> searchByName(Product[] products, String keyword) {
        ArrayList<Product> matchingProducts = new ArrayList<>();
        
        for (Product product : products) {
            if (product != null && product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

   // Search products by price range only, without checking type in the product name
    public ArrayList<Product> searchByCriteria(Product[] products, double minPrice, double maxPrice) {
        ArrayList<Product> matchingProducts = new ArrayList<>();
            for (Product product : products) {
                if (product != null 
                    && product.getPrice() >= minPrice 
                    && product.getPrice() <= maxPrice) {
                    matchingProducts.add(product);
                }
            }
        return matchingProducts;
    }
}


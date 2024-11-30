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
public class User {
    private String username;
    private String password;
    
    

    @Override
    public String toString() {
        return "User{" + "Username=" + username + ", Password=" + password + '}';
    }
    
    public void viewMenu() {
        System.out.println("\n\n\n\n\n\n|_________________|");
        System.out.println("|  1. Register    |");
        System.out.println("|  2. Login       |");
        System.out.println("|  3. Quit        |");
        System.out.println("|-----------------|");
        System.out.print("Enter your selection: ");
    }

    public User(){
        
    }
    
    public User(String Username, String Password){
        this.username= Username;
        this.password = Password;
    }
   

    public String getUsername() {
        return username;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    


   

    
    
    
}

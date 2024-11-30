/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;


import com.mycompany.finalass.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * lam
 */
public class Admin extends User {
    private int AdminNo = 8001;
    private static int adminSecureNo = 2313672;
    private static int adminCreatedCount = 0;
    private UserInfo userInfo;
    private Product[] pr;
    
    public Admin(String Username, String Password) {
        super(Username, Password);
        
    }
    
    public Admin( String Username, String Password, UserInfo userInfo) {
        super(Username, Password);
        this.userInfo = userInfo;
        adminCreatedCount++;
    }
    
    @Override
    public void viewMenu() {
        System.out.println("\n\n\n\n\n\n\n\n|        ADMIN MENU           |");
        System.out.println("|_____________________________|");
        System.out.println("|   1. Manage User            |");
        System.out.println("|   2. View Sales             |");
        System.out.println("|   3. Manage Inventory       |");
        System.out.println("|   4. Logout                 |");
        System.out.println("|-----------------------------|");
        System.out.print("Enter your selection: ");
        
    }


    public int getAdminNo() {
        return AdminNo;
    }

    public void setAdminNo(int AdminNo) {
        this.AdminNo = AdminNo;
    }

    public static int getAdminSecureNo() {
        return adminSecureNo;
    }

    public static void setAdminSecureNo(int adminSecureNo) {
        Admin.adminSecureNo = adminSecureNo;
    }

    public static int getAdminCreatedCount() {
        return adminCreatedCount;
    }

    public static void setAdminCreatedCount(int adminCreatedCount) {
        Admin.adminCreatedCount = adminCreatedCount;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    public void searchProduct(){
    

   }
    public void deleteProduct(){
        
    }
    
}

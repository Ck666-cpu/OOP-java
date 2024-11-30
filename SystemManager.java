/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;

import java.util.ArrayList;
import java.util.Scanner;




/**
 *
 * lam
 */
public class SystemManager {
    Scanner input = new Scanner(System.in);
    private boolean registerValid;
    private Customer[] custs = new Customer[100];   //store data in register
    private Admin[] admins = new Admin[5];          //store data in register
    private User user = new User();
    private static int customerRegCount = 0;        //register object count
    private static int adminRegCount = 0;           //register object count
    private static int accIndexLogged = 0;
    private ShoppingCart cart = new ShoppingCart(); //only put here once
    //private ShoppingCart cart1 = new ShoppingCart();
    private OrderHistory systemOrderHistory = new OrderHistory();// here
    //private OrderHistory orderHistory1 = new OrderHistory();// here
    private Order order = new Order();
    private Order totalOrder = new Order();
    private CheckOut checkout = new CheckOut();
    private ArrayList<Product[]> allProduct = new ArrayList<>();
    private MainMenu menu = new MainMenu(); // cart // maybe
    //constructor

    public SystemManager() {
        UserInfo userInfo1 = new UserInfo("ck@gmail.com", "123,jalan abc");
        UserInfo userInfo2 = new UserInfo("kj@gmail.com", "124,jalan abc");
        custs[0] = new Customer("CK", "qwe", userInfo1);
        admins[0] = new Admin("KJ", "qwe", userInfo2);
        customerRegCount++;
        adminRegCount++;
        allProduct = menu.getAllProduct();
    }
    

    public boolean isAccNotReg(Customer cust){
        System.out.println("Good");
        boolean customerAccNotReg = true;
        for(int i =0; i < customerRegCount; i++){
            System.out.println("Good2");
            if (cust.getUsername().equals(custs[i].getUsername())){
                customerAccNotReg = false;
                System.out.println("Good3S");
                break;
            }
        }
        
        if(customerAccNotReg){           
            custs[customerRegCount]= new Customer(cust.getUsername(),cust.getPassword());
            customerRegCount++;
        }
        
      return customerAccNotReg;  
    }
    
    public boolean isAccNotReg(Admin admin){
        boolean adminAccNotReg = true;
        for(int i =0; i < ((adminRegCount)); i++){
            if (admin.getUsername().equals(admins[i].getUsername())){
                adminAccNotReg = false;
                break;
            }
        }
        
        if(adminAccNotReg){           
            admins[adminRegCount]= new Admin(admin.getUsername(),admin.getPassword());  //record this username in the register object
            adminRegCount++;
        }
        
      return adminAccNotReg;  
    }
    
    public boolean isAccNotExists(String username, String password, int accType){
        boolean loginNotSuccess = true;
        
        switch(accType){
            case 1:
                for(int i = 0; i< customerRegCount; i++){
                    if(username.equals(custs[i].getUsername())){
                        System.out.println("Username found");
                        if(password.equals(custs[i].getPassword())){
                            System.out.println("password Correct");   
                            loginNotSuccess = false;
                            accIndexLogged = i;
                            break;
                        }else{
                            System.out.println("password Wrong");
                            break;
                        }
                    }
                }
                
            case 2:
                for(int i = 0; i< adminRegCount; i++){
                    if(username.equals(admins[i].getUsername())){
                        System.out.println("Username found");
                        if(password.equals(admins[i].getPassword())){
                            System.out.println("password Correct");   
                            loginNotSuccess = false;
                            accIndexLogged = i;
                            break;
                        }else{
                            System.out.println("password Wrong");
                            break;
                        }
                    }
                }
                
        }
        return loginNotSuccess;
    }
    
    //getter setter
    public boolean isRegisterValid() {
        return registerValid;
    }

    public void setRegisterValid(boolean registerValid) {
        this.registerValid = registerValid;
    }

    public Customer getCusts() {
        return custs[accIndexLogged];
    }
    
    public Customer getNewCusts(){
        return custs[customerRegCount -1];
    }

    public void setCusts(Customer[] cust) {
        this.custs = cust;
    }

    public Admin getAdmins() {
        return admins[accIndexLogged];
    }
    
    public Admin getNewAdmins(){
        return admins[adminRegCount -1];
    }

    public void setAdmins(Admin[] admin) {
        this.admins = admin;
    }

    public static int getCustomerRegCount() {
        return customerRegCount;
    }

    public static void setCustomerRegCount(int customerCount) {
        SystemManager.customerRegCount = customerCount;
    }

    public static int getAdminRegCount() {
        return adminRegCount;
    }

    public static void setAdminRegCount(int adminCount) {
        SystemManager.adminRegCount = adminCount;
    }

    public static int getAccIndexLogged() {
        return accIndexLogged;
    }

    public static void setAccIndexLogged(int accIndexLogged) {
        SystemManager.accIndexLogged = accIndexLogged;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    

    public SystemManager registerNewAcc(SystemManager manager){
        System.out.println("Account Registration");
        System.out.println("Enter Account Details");
        input.nextLine();
        System.out.print("Username :");
        String inputUsername = input.nextLine();
        inputUsername = inputUsername.trim();
        System.out.print("Password :");
        String inputPassword = input.nextLine();
        inputPassword = inputPassword.trim();
        System.out.println("Enter number you want to register (1.customer, 2.Admin)");
        System.out.print("Number :");
        int accRole;
        try{
            accRole = input.nextInt();
            switch(accRole){
                case 1:
                    manager = registerCustomer(manager, inputUsername, inputPassword);
                    break;

                case 2:
                    manager = registerAdmin(manager, inputUsername, inputPassword);
                    break;  
                    
                default:
                   System.out.println("Invalid input!!!");
                   //end register selection
                   break; 
            }
        }catch (Exception e){
            System.out.println("Invalid input for accRole");
        }
        
        return manager;
    }
    
   
    public SystemManager registerCustomer(SystemManager manager, String inputUsername, String inputPassword){
        Customer tempCust = new Customer(inputUsername, inputPassword);
        boolean valid = manager.isAccNotReg(tempCust);
        //System.out.println("Good");
        if(valid == true){
            System.out.println("Register as Customer");
            input.nextLine();
            System.out.print("Email :");
            String inputEmail = input.nextLine();
            System.out.print("Address :");
            String inputAddress = input.nextLine();
            UserInfo tempUserInfo = new UserInfo(inputEmail, inputAddress);
            manager.getNewCusts().setUserInfo(tempUserInfo);
            System.out.println("Registered Successfully");
        }else{
            System.out.println("Registration unsuccessful! Username already registered!");
        }
        
        return manager;
    }
    
    public SystemManager registerAdmin(SystemManager manager, String inputUsername, String inputPassword){
        System.out.println("Register as Admin");
        System.out.print("Enter authority code :");
        int authoCode = input.nextInt();

        Admin tempAdmin = new Admin(inputUsername, inputPassword);
        boolean validAdminName = manager.isAccNotReg(tempAdmin);
        if(validAdminName == true){
            //check user authority to create admin account
            if(authoCode != Admin.getAdminSecureNo()){
                System.out.println("You have no authority to create admin Account");
            }else{
                System.out.println("You have authority to create admin account. Please fill in details.");
                System.out.print("Email :");
                String iEmail = input.nextLine();
                System.out.print("Address :");
                String iAddress = input.nextLine();
                UserInfo tempUserInfo = new UserInfo(iEmail, iAddress);
                manager.getNewAdmins().setUserInfo(tempUserInfo);
                System.out.println("Registered Admin Successfully");
            }

        }else{
            System.out.println("Registration Admin unsuccessful! Username already registered!");
        }
        
        return manager;
    }
    
    public SystemManager loginAcc(SystemManager manager){
        System.out.println("Login Account");
        System.out.println("Which Account login? (1.Customer/ 2.Admin)");
        System.out.print("Enter input:");
        int accType = input.nextInt();
        input.nextLine();   //clear input buffer
        System.out.println("User Login");
        System.out.print("Username :");
        String logUsername = input.nextLine();
        logUsername = logUsername.trim();
        System.out.print("Password :");
        String logPassword = input.nextLine();
        logPassword = logPassword.trim();
        boolean loginNotSuccess = manager.isAccNotExists(logUsername, logPassword, accType);
        if(loginNotSuccess == true){
            System.out.println("Login unsuccessful. Please try again later.");
            return manager;
        }else{
            if(accType == 1){                       
                customerInterface(manager);
            }else{
                adminInterface(manager);
            }
        }
        
      return manager;  
      //end of login acc      
    }
  
    public void customerInterface(SystemManager manager){
        System.out.println("Hello Customer " + manager.getCusts().getUsername());
        System.out.println("Welcome to our system");
        boolean end = false;
        while (end != true) {
            System.out.println("");
            manager.getCusts().viewMenu();
            int menuChoice = input.nextInt();
            //allProduct = menu.getAllProduct();
            
            switch (menuChoice) {
                case 1: 
                    
                    order = menu.displayMenu(allProduct, order, manager); //this order object return only contains all the checkout proceed by this customer
                    systemOrderHistory.recordNewCheckout(order);
                    manager.getCusts().getOwnHistory().recordNewCheckout(order);
                    System.out.println(totalOrder.getCart().getItemCount());
                    totalOrder = totalOrder.salesRecord(totalOrder, order);
                    System.out.println(totalOrder.getCart().getItemCount());

                    break;
                case 2: 
                    manager.getCusts().getOwnHistory().displayAllCheckout();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("logout"); 
                    end = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid category.");
                    System.out.println("");
            } 
        }
            
        //end of customerInterface
    }
    
    
    public void adminInterface(SystemManager manager){
        System.out.println("Hello Admin " + (manager.getAdmins().getUsername()));
        System.out.println("Welcome to our system");
        boolean continueAdminView = true;
        do{
            manager.getAdmins().viewMenu();
            //continue your code here as admin
            int selection1 = input.nextInt();

            switch(selection1){
                case 1:
                    manager = manageCustomer(manager);
                    break;
                case 2:
                    adminSalesInterface();
                    break;
                case 3:
                    adminInventoryMenu();
                    break;
                case 4:
                    System.out.println("Logout admin");
                    continueAdminView = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while(continueAdminView);
        
    }
    
    public void adminSalesInterface(){
        boolean continueSalesMenu = true;
        do{
            System.out.println("\n\n\n\n\n\n\n\n------Sales Menu------");
            System.out.println("1. display all checkout");
            System.out.println("2. view total sales");
            System.out.println("3. Back");
            System.out.println("------------------------------");
            System.out.print("Enter your choice :");
            int choice = input.nextInt();
            
            switch(choice){
                case 1:
                    systemOrderHistory.displayAllCheckout();
                    break;
                case 2:
                    totalOrder.viewTodaySales(totalOrder);
                    break;
                case 3:
                    System.out.println("end inventory menu.");
                    continueSalesMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while(continueSalesMenu);
    }
    
    public void adminInventoryMenu(){
        boolean continueInventoryMenu = true;
        do{
            System.out.println("\n\n\n\n\n\n\n\n------Inventory Menu------");
            System.out.println("1. display products");
            System.out.println("2. update product price");
            System.out.println("3. Back");
            System.out.println("------------------------------");
            System.out.print("Enter your choice :");
            int choice = input.nextInt();
            
            switch(choice){
                case 1:
                    menu.displayAllProduct(allProduct);
                    break;
                case 2:
                    allProduct = menu.updateProductDetails(allProduct);
                    break;
                case 3:
                    System.out.println("end inventory menu.");
                    continueInventoryMenu = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while(continueInventoryMenu);
    }
    
    public SystemManager manageCustomer(SystemManager manager){
        boolean continueManageCust = true;
        do{
            System.out.println("\n\n\n\n\n\n----Manage Customer Menu----");
            System.out.println("1. show all customer");
            System.out.println("2. show customer info");
            System.out.println("3. upgrade customer to admin");
            System.out.println("4. Back");
            System.out.print("Enter selection :");
            int selection = input.nextInt();

            switch(selection){
                case 1:
                    displayCustomer();
                    break;
                case 2:
                    showSelectedCustomerDetails();
                    break;
                case 3:
                    manager = upgradeCustomerRole(manager);
                    break;
                case 4:
                    System.out.println("Back to admin main menu.");
                    continueManageCust = false;
                    return manager;
                default:
                    System.out.println("Invalid selection. Please try again");
                    break;
            }
        }while(continueManageCust);
        
        
        return manager;
    }
    
    public void displayCustomer(){
        System.out.println("\n\n\n\n\n----------Customer List------------");
        for(int i = 0; i< customerRegCount; i++ ){
            System.out.println((i+1) + ". Username: " + custs[i].getUsername() + " & Customer ID: " + custs[i].getCustomerID());
        }
        System.out.println("\n-----------------------------------");
        System.out.println("Customers list display done.");
    }
    
    public void showSelectedCustomerDetails(){
        boolean validCustomerID = false;
        System.out.print("\nEnter customer ID :");
        input.nextLine();
        String searchID = input.nextLine();
        
        for(int i=0; i<customerRegCount; i++){
            if(custs[i].getCustomerID().contentEquals(searchID)){
                System.out.println("\n\n\nCustomer Information:");
                System.out.println("Username = " + custs[i].getUsername());
                System.out.println("Email = " + custs[i].getUserInfo().getEmail());
                System.out.println("Address = " + custs[i].getUserInfo().getAddress());
                System.out.println("All information display done.");
                validCustomerID = true;
            }
        }
        
        if(validCustomerID = false){
            System.out.println("This customerID not Exits");
        }
    }
    
    public SystemManager upgradeCustomerRole(SystemManager manager){
        manager = registerAdmin(manager);
        
        return manager;
    }
    
    public SystemManager registerAdmin(SystemManager manager){
        System.out.print("\n\n\nEnter customer's ID that are going to upgrade to admin :");
        input.nextLine();
        String searchID = input.nextLine();
        int customerIndex = 0;
        
        for(int i=0; i<customerRegCount; i++){
            if(custs[i].getCustomerID().contentEquals(searchID)){
                customerIndex = i;
            }
        }
        
        Admin tempAdmin = new Admin(custs[customerIndex].getUsername(), custs[customerIndex].getPassword());
        boolean validAdminName = manager.isAccNotReg(tempAdmin);
        if(validAdminName == true){
            UserInfo tempUserInfo = custs[customerIndex].getUserInfo();
            manager.getNewAdmins().setUserInfo(tempUserInfo);
            System.out.println("upgrade to Admin Successfully");
        }else{
            System.out.println("upgrade to Admin unsuccessful! Username already registered!");
        }
        
        return manager;
    }
    
    public int getSelection(){
       boolean wrongInt = true;
       int selection = 0;
        do{
            input = new Scanner(System.in);
            try{
                user.viewMenu();
                selection = input.nextInt();
            }catch (Exception ex){
                System.out.println("fuck");
                wrongInt = false;
                input = new Scanner(System.in);
                selection = 0;
            }

        }while(wrongInt = false);
        
        return selection;
   }
    //end of systemmanager class
}

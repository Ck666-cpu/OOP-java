/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalass;



import java.util.Scanner;

/**
 *
 * lam
 */
public class Main {
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] Args){
        SystemManager manager = new SystemManager();
        int selection;
        do{
            
            selection = manager.getSelection();

            switch(selection){
                case 1:
                    manager = manager.registerNewAcc(manager);
                    break;
                
                case 2:
                    manager = manager.loginAcc(manager);
                    break;

                case 3:
                    System.out.println("Thank You");
                    break;
                    
                default:
                    System.out.println("Invalid selection. Please select again.");
                    break;
            }
        }while(selection != 3);                     
    }  
//end of Main class
}

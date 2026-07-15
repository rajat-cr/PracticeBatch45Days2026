/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicebatch45days2026;

import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class PracticeBatch45Days2026 {

    public static void main(String[] args) {
        
       Singleton con = Singleton.Display();
       if(con!=null){
            System.out.println("Database Conntected");
       }else{
        System.out.println("Database not connected");}
       
    
    PracticeScreen  obj = new PracticeScreen();
    obj.setVisible(true);
    }
}

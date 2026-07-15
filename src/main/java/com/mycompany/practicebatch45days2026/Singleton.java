/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicebatch45days2026;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Singleton {
    
    private static Singleton instance = null;
    Connection conn = null; 
// jdbc:mysql://localhost:3306/6week2026?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]

    
    private Singleton(){
        try{
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/6week2026","root","");
             if(conn!=null){
              String table = "CREATE TABLE IF NOT EXISTS student("
                      + "id INT AUTO_INCREMENT PRIMARY KEY,"+
                      "name VARCHAR(100),"+
                      "rollNo VARCHAR(50)"+
                      ")";
              
              PreparedStatement stm = conn.prepareStatement(table);
              stm.execute();
             }
            
        }catch(Exception ex){
              System.out.println(ex);   
        }
    }
    
    public static Singleton Display(){ 
    if(instance == null){
    instance = new Singleton();
    }   
        return instance;
}   
 
}

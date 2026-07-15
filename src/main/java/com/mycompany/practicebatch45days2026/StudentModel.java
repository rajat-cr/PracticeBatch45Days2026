/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicebatch45days2026;

/**
 *
 * @author ASUS
 */
public class StudentModel {
    int id;
    String name;
    String rollNo;
    
    StudentModel(int id, String name, String rollNo){
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public int getId(){
    return id;
    }
    
    public String getName(){
    return name;
          }
    
    public String getRollNo(){
    return rollNo;
    }
    
}

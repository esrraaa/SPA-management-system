/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmwindspaa;

import java.util.Scanner;

/**
 * The purpose of this class is to define the special customer
 * This class is derived from the customer class
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 2022/5/23| 1443/10/22
 */

public class SpecialCustomer extends Customer{
    

    /**
     * This attribute is for the customers saved name
     */
    private String scName;

    /**
     * This attribute is for the customers saved username
     */
    private String scUserName;
    
    /**
     * This attribute is for the customers saved email address
     */
    private String scEmail;
    
    /**
     * This attribute is for the customers saved password
     */
    private String scPassword;
    /**
     * This attribute is for the customers saved birth date
     */
    private String scBirthday;
    /**
     * This attribute is for the customers saved phone number
     */
    private int scPhone;
    
    /**
     * specialCustomer This attribute is for special customers
     */
    private boolean specialCustomer;
    
    /**
     * numberOfVisits This attribute is for counting number of visits
     */
    private int numberOfVisits;

    /**
     * SpecialCustomer is a non parameterize constructor of class SpecialCustomer
     */
    public SpecialCustomer(){
    super();
    }

    /**
    * SpecialCustomer is a constructor of class SpecialCustomer
    * initializing class fields
    * @param name customer name
    * @param username customer account username
    * @param email customer email address     
    * @param password customer account password
    * @param dateOfBirth customer birthday
    * @param phone customer phone number
    * @param customerType for customer type
    * @param specialCustomer for special customer
    * @param numberOfVisits count number of visits
    */
    public SpecialCustomer(String name, String username, String email, String password, String dateOfBirth, int phone, String customerType, boolean specialCustomer, int numberOfVisits) {
        super(name, username, email, password, dateOfBirth, phone, customerType);
        this.specialCustomer = specialCustomer;
        this.numberOfVisits = numberOfVisits;
    }
    
    /**
    * SpecialCustomer is a constructor of class SpecialCustomer
    * initializing class fields
    * @param name customer name
    * @param username customer account username
    * @param email customer email address     
    * @param password customer account password
    * @param dateOfBirth customer birthday
    * @param phone customer phone number
    */
    public SpecialCustomer (String name, String username, String email, String password, String birthday, int phone){
        this.scName = name;
        this.scUserName = username;
        this.scEmail = email;
        this.scPassword = password;
        this.scBirthday = birthday;
        this.scPhone = phone;
    }

    /**
     * getNumberOfVisits this method is for counting number of visits
     * @return number of visits
     */
    public int getNumberOfVisits() {  // this method does the same job as method counterVisit in UML 
        return numberOfVisits;
    }
    
     /**
     * setNumberOfVisits this method for a set number of visits 
     * @param numberOfVisits 
     */
    public void setNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }

    /**
     * getSpecialCustomer this method is to check if the customer is a special customer or not
     * @return true if customer is special or false customer is not special
     */
    public boolean getSpecialCustomer() {
        return specialCustomer;
    }

    /**
     * setSpecialCustomer this method is for determine special customer
     * @param specialCustomer 
     */
    public void setSpecialCustomer(boolean specialCustomer) {
        this.specialCustomer = specialCustomer;
    }
    
    /**
     * getScUserName this method to return customer username
     * @return person unique username
     */
    public String getScUserName() {
        return scUserName;
    }

     /**
     * setScUserName this method is for customer unique username
     * @param scUserName 
     */
    public void setScUserName(String scUserName) {
        this.scUserName = scUserName;
    }

     /**
     * getScEmail this method to return customer email address
     * @return scEmail
     */
    public String getScEmail() {
        return scEmail;
    }

     /**
     * setScEmail this method is for customer email address
     * @param scEmail 
     */
    public void setScEmail(String scEmail) {
        this.scEmail = scEmail;
    }

      /**
     * getScPassword this method to return customer password
     * @return Person Password
     */
    public String getScPassword() {
        return scPassword;
    }

     /**
     * setScPassword this method for customer password
     * @param scPassword 
     */
    public void setScPassword(String scPassword) {
        this.scPassword = scPassword;
    }

    /**
     * getScName this method to return name
     * @return scName
     */
    public String getScName() {
        return scName;
    }

    /**
     * setScName this method for a set name
     * @param scName 
     */
    public void setScName(String scName) {
        this.scName = scName;
    }

    /**
     * getScBirthday this method to return birthday
     * @return scBirthday
     */
    public String getScBirthday() {
        return scBirthday;
    }

    /**
     * setScBirthday this method for a set birthday
     * @param scBirthday
     */
    public void setScBirthday(String scBirthday) {
        this.scBirthday = scBirthday;
    }

    /**
     * getScPhone this method to return phone
     * @return scPhone
     */
    public int getScPhone() {
        return scPhone;
    }

      /**
     * setScPhone this method for a set
     * @param scPhone 
     */
    public void setScPhone(int scPhone) {
        this.scPhone = scPhone;
    }

    
    
    
    /**
     * increaseNumberOfVisits increases the number of visits by 1
     */
    public void increaseNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits += 1;
    }
    
    /**
     * decreaseNumberOfVisits decreases the number of visits by 1
     */
    public void decreaseNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits -= 1;
    }

    
    /**
     * checkCustomer this method to check if a customer is a special or not
     * @return if a customer is a special or not
     */
    public boolean checkCustomer() {

        if(getNumberOfVisits()>=3)
        {
            specialCustomer = true;
            return true;   
        }    
        else
        {
            specialCustomer = false;
            return false; 
        }
            
    }
    
     /**
    * toString() method
    * @return String of attributes values
    */
    @Override
    public String toString() {
        return "\nName: "+ super.getName()+"\nUsername: " + super.getUserName() +"\nEmail: "+super.getEmail()+"\nPassword: " + super.getPassword() ;
    }  
    
}
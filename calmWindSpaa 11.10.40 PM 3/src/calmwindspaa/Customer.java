/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmwindspaa;

/**
 * The purpose of this class is to define the type of customer
 * This class is derived from the person class
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 2022/5/23| 1443/10/22
 */

import java.util.*;

public class Customer extends Person implements canLogIn {

    /**
     * customerType This attribute is for the type of customer
     */
    private String customerType; 
    
    /**
     * Customer is a non parameterize constructor of class Customer
     */
    public Customer(){
        super();
    }

    /**
    * Customer is a constructor of class Customer
    * initializing class fields
    * @param name person name
    * @param username person account username
    * @param email person email address
    * @param password person account password
    * @param dateOfBirth person birthday
    * @param phone person phone number  
    * @param customerType is a customer type
    */
    public Customer(String name, String username, String email, String password, String dateOfBirth, int phone, String customerType) 
    {
        super(name, username, email, password, dateOfBirth, phone);
        this.customerType = customerType;
    }


    /**
     * getCustomerType returns customer type
     * @return customerType customer type
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * setCustomerType set the customer Type
     * @param CustomerType as the customer type
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * checkCustomerType is the method to check customer type
     * @param email to check email
     * @return type of customer 
     */
    public String checkCustomerType(String email){
        if(checkEmailType(email).equals("Student customer"))
            customerType = "Student";  
        else  
            customerType = "Customer";
        return customerType;
    }
    
    /**
     * checkEmailType is the method to check if the email is student email or not
     * @param email to check if the email is student email or not
     * @return type of email is student or not
     */
    public String checkEmailType(String email) {
        String uniEmail = ".edu";
        if(email.toLowerCase().contains(uniEmail))
            return "Student Email";
        else
            return "Customer Email";
    }
    
    /**
     * validUserName is the method to check if user name is valid or not
     * @return true if user name is valid and false if not
     */
    @Override
    public boolean validUserName(){
        if(getUserName().contains("!")||getUserName().contains("@")||getUserName().contains("#")||getUserName().contains("$")||getUserName().contains("%")||getUserName().contains("^")||getUserName().contains("&")||getUserName().contains("*")||getUserName().contains("(")||getUserName().contains(")"))
            return false;
        else
            return true;
    }
    
    /**
     * validPassword is the method to check if password length is greater than 8
     * @return true if password length is greater than 8 and false if its less than 8
     */
    @Override
    public boolean validPassword(){
        if(getPassword().length()>=8)
            return true;
        else
            return false;
    }
}
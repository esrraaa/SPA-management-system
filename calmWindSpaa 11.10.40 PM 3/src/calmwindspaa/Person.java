/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmwindspaa;
import java.util.*;

/**
 * Creating Person class
 * This class has two sub-classes: class Customer and class Employee
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 2022/5/23 | 1443/10/22
 */
public abstract class Person {
    /**
    * This attribute is for the Person name
    */
    private static String name;
    /**
     * This attribute is for the Person unique username
     */
    private static String userName;
    /**
     * This attribute is for the Person password
     */
    private static String password;
    /**
     * This attribute is for the Person email address
     */
    private static String email;
    /**
     * This attribute is for the Person birthday
     */
    private static String dateOfBirth;
    /**
     * This attribute is for the Person phone number
     */
    private static int phone;

    
    /**
     * No-argument constructor
     */
    public Person(){}
    
    
    /**
    * Person is a constructor of class Person
    * initializing class fields
    * @param name as the person name
    * @param username as a unique name for each person
    * @param email as the person email address
    * @param password as a valid password
    * @param dateOfBirth as the person birthday
    * @param phone as the person phone number
    */
    public Person(String name, String username, String email, String password, String dateOfBirth, int phone){
        this.name = name;
        this.userName = username;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    
    /**
     * getName returns person name
     * @return name person name
     */
    public String getName(){
        return name;
    }
    
    
    /**
     * setName set the person's name
     * @param name as the person's name
     */
    public void setName(String name){
        this.name = name;
    }

    
    /**
     * getUserName returns person username
     * @return username person username
     */
    public String getUserName(){
        return userName;
    }
    
    
    /**
     * setUserName set the username attribute
     * @param username Person's username
     */
    public void setUserName(String username){
        this.userName = username;
    }

    
    /**
     * getPassword returns person password
     * @return password person password
     */
    public String getPassword() {
        return password;
    }
    
    
    /**
     * setPassword set the Person password
     * password length must be between 8-16
     * @param password as the Person's password
     */
    public void setPassword(String password) {
        if(password.length() <= 8)
            System.out.println("Your password is too short!");
        else if (password.length() >= 16)
            System.out.println("Your password is too long!");
        else
            this.password = password;
    }

    
    /**
     * getEmail returns person email address
     * @return email person email address
     */
    public String getEmail() {
        return email;
    }
    
    
    /**
     * setEmail set the Person email
     * @param email as the Person's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    /**
     * getDateOfBirth returns person birthday
     * @return dateOfBirth person birthday
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    /**
     * setDateOfBirth set the Person birthday
     * @param dateOfBirth as the Person's birthday
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    /**
     * getPhone returns person phone number
     * @return phone person phone number
     */
    public int getPhone() {
        return phone;
    }
    
    
    /**
     * setPhone set the Person phone number
     * @param phone as the Person's phone number
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }


    
    /**
    * signUp method allows the person to enter personal information and create an account
    */
    public void signUp(){
        
        Scanner input = new Scanner(System.in);
        
        try{
        System.out.print("\nName: ");
        name = input.next();
        System.out.print("User name: ");
        userName= input.next();
        System.out.print("Email address: ");
        email = input.next();
        System.out.print("Password: ");
        password = input.next();
        System.out.print("Date of birth: ");
        dateOfBirth = input.next();
        System.out.print("Phone number: ");
        phone = input.nextInt();
        }
        
        catch (InputMismatchException e)
            {
                System.out.println("Please write correct information :)"); 
            }
        catch (Exception e)
            {
                System.out.println("You have an ERORR, please try again");
            }
    }

    
    /**
     * login method allows the person to log in his existing account
     */
    public void login(){
        
        Scanner input = new Scanner(System.in);
        
        try{
        System.out.print("Name: ");
        name= input.next();
        System.out.print("User name: ");
        userName= input.next();
        System.out.print("Email address: ");
        email = input.next();
        System.out.print("Password: ");
        password = input.next();
        }
        
        catch (InputMismatchException e)
            {
                System.out.println("Please write correct information :)"); 
            }
        catch (Exception e)
            {
                System.out.println("You have an ERORR, please try again");
            }
    }

    /**
     * toString() method
     * @return String of attributes values
     */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", userName=" + userName + ", password=" + password + ", email=" + email + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + '}';
    }

}

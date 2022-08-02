/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calmwindspaa;
/**
 * This class demonstrates the calmWindSpa project.
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 23/5/2022 | 1443/10/22
 */

import java.util.*;

public class CalmWindSpaa {

    
    public static void main(String[] args) {
 
        //Application of the concept of Exception
        try{
        // to get any data from user
        Scanner input = new Scanner(System.in); 
        // create object from Employee class
        Employee e1 = new Employee();
        // create object from SpecialCustomer class
        SpecialCustomer sc1 = new SpecialCustomer();
        //create array of objects from SpecialCustomer class
        SpecialCustomer [] sCustomers = new SpecialCustomer[3];
        sCustomers [0] = new SpecialCustomer("Ali","al2i","ali442@st.uqu.edu.sa","7724h56a","8/4/2000",567884912);
        sCustomers [1] = new SpecialCustomer("Sara","sara42","ssara@gmail.com","8835i67b","2/11/2002",567884912);
        sCustomers [2] = new SpecialCustomer("Salma","salma","salma442@st.uqu.edu.sa","9946j78c","22/1/1998",567884912);
        
        // create object from Booking class
        Booking b1 = new Booking();
        // create object from Payment cass
        Payment p1 = new Payment();

        System.out.println("**Welcome to Calm Wind SPA**");
        // Program start
        System.out.println("Enter Account Type:\nEmployee \nCustomer");
        String answer = input.next(); //from user
        
        // if user is customer
        if(answer.equalsIgnoreCase("Customer")){
            System.out.println("Do you have an existing account?");
            String answer2 = input.next(); //from user
            // if user has an account
            if(answer2.equalsIgnoreCase("yes")){
            
                sc1.increaseNumberOfVisits(sc1.getNumberOfVisits());// increase number of visits by 1
                sc1.increaseNumberOfVisits(sc1.getNumberOfVisits());// increase number of visits by 1
                sc1.increaseNumberOfVisits(sc1.getNumberOfVisits());// increase number of visits by 1

                if(sc1.checkCustomer()==true){
                    System.out.println("\nPlease Log in to your account: ");
                    // if the user is a special customer, then surely he had an account before he just need to log in
                    sc1.login();     
                    // Verifying user login by comparing user's input and the values saved in sCustomer object array
                    //We were unable to use any kind of loop because we can't reach the flag variable (VariableScope) 
                    boolean flag;
                    boolean flag1;
                    boolean flag2;

                    if(sc1.getUserName().equals(sCustomers[0].getScUserName())){
                        flag = true;
                        if(sc1.getEmail().equals(sCustomers[0].getScEmail()))
                            flag = true;
                            if(sc1.getPassword().equals(sCustomers[0].getScPassword()))
                                flag = true;
                    }
                    else
                         flag = false;
                        
                    if(sc1.getUserName().equals(sCustomers[1].getScUserName())){
                        flag1 = true;
                        if(sc1.getEmail().equals(sCustomers[1].getScEmail()))
                            flag1 = true;
                            if(sc1.getPassword().equals(sCustomers[1].getScPassword()))
                                flag1 = true;
                    }
                    else
                        flag1 = false;
                        
                    if(sc1.getUserName().equals(sCustomers[2].getScUserName())){
                        flag2 = true;
                        if(sc1.getEmail().equals(sCustomers[2].getScEmail()))
                            flag2 = true;
                            if(sc1.getPassword().equals(sCustomers[2].getScPassword()))
                                flag2 = true;
                    }
                    else
                        flag2 = false;                        
                        
                            
                    //check if the login process is valid or not
                    if(flag == true || flag1 == true || flag2 == true)
                    {
                        // Username must not contain !@#$%^&*() and password >=8
                        System.out.println("You have logged in successfully");
  
                    
                        //determine if user student or not
                        System.out.println("Your email is a "+sc1.checkEmailType(sc1.getEmail()));
                        //print number of visits
                        System.out.println("\nCongratulations!\nyou became a special customer \nThe number of your visits is: "+sc1.getNumberOfVisits());
                        //for checking services and prices
                        p1.checkService();
                        //if your email is student and special customer you get 2 discounts
                        System.out.println("Total Price after special customers discount: "+p1.calculateDiscount()+"$");
                        if(sc1.checkEmailType(sc1.getEmail()).equals("Student Email"))
                            System.out.println("Total Price after students discount: "+p1.calculateDiscount()+"$");
                            System.out.println("\nPlease book an appointment:");
                            // to book a date
                            b1.setBookedDate();
                            // to confirm your reservation
                            b1.reservationConfirmation();
                            //to choose payment method
                            p1.displayPayment();
                            //if you do not want to cancel booking
                            if(b1.CancelBooking()==false){
                                b1.sendNotification();
                                System.out.println("\nCustomer personal information: "+sc1.toString());
                                p1.printRipt();}
                            //if you want to cancel booking
                            else{
                                System.out.println("\nCustomer personal information: "+sc1.toString());
                                //returns paid amount
                                p1.refundPayment();}
                            
                 }
                    else
                    System.out.println("Invalid username or password, please try again");

                } 
            }
            // if user is a customer but doesn't have an account
            else if(answer2.equalsIgnoreCase("no")){
            { 
                sc1.increaseNumberOfVisits(sc1.getNumberOfVisits()); // increase number of visits by 1
                System.out.println("\nPlease sign up: ");
                System.out.println("\"Your username  must not contain any symbols\"");
                System.out.println("\"Your password must be at least 8 characters\"");
                // The user will need to create an account
                sc1.signUp();
                // username  must not contain any symbols and password length must be >= 8
                if(sc1.validUserName()&&sc1.validPassword()) 
                {
                    System.out.println("Account created successfully");
                    //determine if user student or not
                    System.out.println("Your email is a "+sc1.checkEmailType(sc1.getEmail()));
                    //for checking services and prices
                    p1.checkService();
                    //if your email is student email you get a discount
                    if(sc1.checkEmailType(sc1.getEmail()).equals("Student Email"))
                        System.out.println("Total Price after students discount: "+p1.calculateDiscount()+"$");
                        System.out.println("\nPlease book an appointment:");
                        //to book a date
                        b1.setBookedDate();
                        //to confirm your reservation
                        b1.reservationConfirmation();
                        //to choose payment method
                        p1.displayPayment();
                        //if you do not want to cancel booking
                        if(b1.CancelBooking()==false){
                            b1.sendNotification();
                            System.out.println("\nCustomer personal information: "+p1.toString());
                            p1.printRipt();}
                        //if you want to cancel booking
                        else{
                            System.out.println("\nCustomer personal information: "+p1.toString());
                            //returns paid amount
                            p1.refundPayment();}
                        
                }
                else
                         System.out.println("Invalid username or password, please try again");    
                }
              }
            }      
        
            // If the user is not a customer but an employee
            else if(answer.equalsIgnoreCase("employee")){
            // if the user is an employee, then surely he had an account before he just needs to login
            System.out.println("Please Log in to your account: "); 
            e1.login(); 
                // Username must not contain !@#$%^&*() and password >=8
                if(e1.validUserName()&&e1.validPassword()){
                
                    System.out.println("you have logged in successfully");
                    //The employee will need to enter Id for his department
                    System.out.println("Please enter your Id:"); 
                    e1.setEmployeeId(input.nextInt());
                    //To store the section in which it is working
                    e1.checkEmployeeType(e1.getEmployeeId());
                    //The employee will need to enter his housr of works
                    System.out.println("Please choose hours of works\n4 - 8 - 12:");
                    e1.setWorkHours(input.nextInt()); 
                    //To store his salary
                    e1.checkSalary(e1.getEmployeeId());
                    //To store his experinace years
                    System.out.println("Please enter your years of experinace:");
                    e1.setExperienceYears(input.nextInt());
                    //print the information of the employee
                    System.out.println("-------------------------------------------\nEmployee personal information: \n"+e1.toString()+"\n-------------------------------------------");
                }
                else
                    System.out.println("Invalid username or password, please try again");
                }
        // If the user does not enter "customer" or "employee"
        else{
            System.out.println("Wrong input!, please try again");
        }   
    }
         // Display error 
        catch(InputMismatchException e){
                System.out.println("Please write correct information :)"); 
            }
        catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

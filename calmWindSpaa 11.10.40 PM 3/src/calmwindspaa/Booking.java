/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmwindspaa;

/**
 * The purpose of this class is to define the Booking
 * This class is derived from the Special Customer class
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 2022/5/23| 1443/10/22
 */
import java.util.*;


public class Booking extends SpecialCustomer {
    
    /**
    * count This attribute  is for reservationID initialization
    */
    public static int count = 23800+((int)Math.random()*99);
    
    /**
    * reservationId This attribute is for reservation ID
    */
    public int reservationId;
    
    /**
    * discount This attribute is for the discount amount
    */
    protected double discount;
    
    /**
    * bookedDate This attribute is for the booking date
    */
    private String bookedDate;
    
    /**
    * day This attribute is for the booked day date
    */
    private static int day;
    
    /**
    * month This attribute is for the booked month date
    */
    private static int month;
    
    /**
    * year This attribute is for the booked year date
    */
    private static int year;
    
    Scanner input= new Scanner(System.in);

    
    /**
    * Customer is a non parameterize constructor of class Booking
    */
    public Booking() {
       super();
       this.reservationId = count++;
    }

     /**
     * Booking is a constructor of class Booking
     * @param reservationId for reservation ID
     * @param serviceType Type of service
     * @param discount discount for customer
     * @param bookedDate data of booked 
     */
    public Booking(String name, String username, String email, String password, String dateOfBirth, int phone, String customerType, boolean specialCustomer, int numberOfVisits, int reservationId, double discount, String bookedDate) {
        super(name, username, email, password, dateOfBirth, phone, customerType, specialCustomer, numberOfVisits);
        this.reservationId = reservationId;
        this.discount = discount;
        this.bookedDate = bookedDate;
        
    }

    /**
     * getReservationId this method is for Reservation ID
     * @return id of Reservation
     */
    public int getReservationId() {
        return reservationId;
    }

     /**
     * setReservationId this method for setting Reservation ID 
     * @param reservationId 
     */
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    /**
    * getDiscount this method for the discount amount
    * @return discount
    */
    public double getDiscount() {
        return discount;
    }

    /**
    * setDiscount this method for setting the discount amount
    * @param discount 
    */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    /**
    * getDay this method for the day the user booked in
    * @return day
    */
    public int getDay() {
        return day;
    }
    /**
    * setDay this method is for setting the booked day date
    */
    public void setDay(int day) {
        this.day = day;
    }
    
    /**
    * getMonth this method is for the month the user booked in
    * @return month
    */
    public int getMonth() {
        return month;
    }
    /**
    * setMonth this method is for setting the booked month date
    */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
    * getYear this method is for the year the user booked in
    * @return year
    */
    public int getYear() {
        return year;
    }
    /**
    * setYear this method is for setting the booked year date
    */
    public void setYear(int year) {
        this.year = year;
    }

    /**
    * getBookedDate this method is for the Booked Date
    * @return bookedDate
    */
    public String getBookedDate() {
        return this.bookedDate;
    }
    

    /**
    * setBookedDate this method for setting Booked Date
    */   
    public void setBookedDate() {
        System.out.print("Enter a day number: ");
        this.day = input.nextInt();
        if(day > 31){
            System.out.println("Invalid day number please check and enter again");
            this.day = input.nextInt();
        }
        
        System.out.print("Enter a month number: ");
        this.month = input.nextInt();
        if(month > 12){
            System.out.println("Invalid month number please check and enter again"); 
            this.month = input.nextInt();
        }
        
        System.out.print("Enter a year number: ");
        this.year = input.nextInt();
        if(year < 2022){
            System.out.println("Invalid year number please check and enter again");
            this.year = input.nextInt();
        }
        this.bookedDate=("Your booking date is: "+ getDay() + "/ " + getMonth() + "/ "+ getYear());
        System.out.println(getBookedDate());  
    }
    

    

    /**
    * reservationConfirmation this method is for reservation Confirmation 
    * @return if its true or false
    */
    public boolean reservationConfirmation(){
     this.reservationId ++;
     return true;
    }
        
    
   
    
    /**
    * sendNotification this method is to send Notification with the reservation ID for a customer after booking
    */
    public void sendNotification(){
     if ( reservationId > 0) 
     System.out.println("\nNotification from Calm Wind SPA:\n\"Dear Customer your Reservation Id  is: "+reservationId+"\"");
     }

    /**
    * CancelBooking this method is to cancel the booking 
    * @return canceled or not
    */
    public boolean CancelBooking(){
     System.out.println("\nDo you want to cancel your booking?");
     System.out.println("Yes / No");
     String cancel= input.next().toUpperCase();
     if (cancel.equals("YES")){
     System.out.println("Your booking has been canceld"); 
     return true;
     } 
     else if (cancel.equals("NO")) {
     
     return false;
     } 
     else {
     System.out.println("Please enter a valid data and check again");
     return false;
     }
     }
    
    /**
    * bookedService this method is for saving the services booked by the user
    * @return chosenServices
    */
    public int bookService(){
        int[] bookedServices = new int[4];
        int chosenServices = input.nextInt();
        for(int i=0; i< bookedServices.length; i++){
            bookedServices[i] = chosenServices;
                    
           
        }  
        return chosenServices;
    }
        
      
    /**
    * toString() method
    * @return String of attributes values
    */
    @Override
    public String toString() {
        return "\nName: " + super.getName() + "\nUsername: " + super.getUserName() + "\nEmail: " + super.getEmail() +"\nPassword: " + super.getPassword()+ "\nBirthday:" + super.getDateOfBirth() + "\nPhone number: " + super.getPhone();
    }  
}
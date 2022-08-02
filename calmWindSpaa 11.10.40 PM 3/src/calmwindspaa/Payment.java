/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmwindspaa;

import java.util.ArrayList;

/**
 * The purpose of this class is to define the Payment
 * This class is derived from the Booking class
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 2022/5/23 | 1443/10/22
 */


public class Payment extends Booking {
 
    /**
     * creditCardNo This attribute is for the credit card number
     */
    private String creditCardNo;
    
    /**
     * refund This attribute is for the refund of the price
     */
    private String refund;
    
     /**
     * chosenService This attribute is for the user's service choice
     */
    private int serviceNum;
    
    /**
     * servicesType This attribute is for the type of service
     */
    public String serviceType;
    
    /**
     * total this attribute is for the total price of services
     */
    public float total;
    
    /**
    * price This attribute is for each service price
    */
    public float price;

    /**
    * serviceList create object of ArrayList
    */
    ArrayList <String> serviceList = new ArrayList <String>();
       

    
    /**
    * Payment is a non parameterize constructor of class Payment
    */
    public Payment(){
       super(); 
    }
    
    /**
    * Customer is a constructor of class Payment
    * @param creditCardNO is a credit card number
    * @param refund is the given back money after canceling booking
    * @param customerId is a customer Id
    * @param servicesType is a type of services
    */
    public Payment (String creditCardNo, String refund, String customerId,String servicesType ){
        this.refund=refund;
        this.creditCardNo=creditCardNo;
        this.serviceType= servicesType;        
    }
    
    /**
    * getServiceNum returns the number of the chosen service
    * @return serviceNum number of the service chosen by the user
    */  
    public int getServiceNum() {
        return serviceNum;
    }
    /**
    * setServiceNum set the number of the chosen service 
    * @param serviceNum as the number of the service chosen by the user
    */
    public void setServiceNum(int serviceNum) {
        this.serviceNum = serviceNum;
    }
    
    /**
     * getPrice returns price 
     * @return price Services price
     */   
     public float getPrice() {
        return price;
    }
     
     /**
     * setPrice set the price 
     * @param price as the price 
     */
     public void setPrice(float price) {
        this.price = price;
    }
    
     /**
     * getcreditCardNo returns credit card number
     * @return creditCardNo credit card number
     */
    public String getCreditCardNo() {
        return creditCardNo;
    }

    /**
     * setcreditCardNo set the credit Card number
     * @param creditCardNO as the customer type
     */
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    
    /**
    * getRefund returns refund
    * @return refund 
    */
    public String getRefund() {
        return refund;
    }

    /**
    * setRefund set the refund
    * @param refund
    */
    public void setRefund(String refund) {
        this.refund = refund;
    }
   
    /**
    * getservicesType returns services Type 
    * @return services Type 
    */
    public String getServiceType() {
        return serviceType;
    }

    /**
    * setservicesType set the services Type using the number of service chosen by the user
    * @return serviceType
    */
    public String setServiceType(int s) {
        switch(serviceNum){
            case 1:
               this.serviceType = "treatment Service";
                System.out.println(serviceType);
                break;
            case 2:
               this.serviceType = "massage Service";
               System.out.println(serviceType);
                break;
            case 3:
               this.serviceType = "gym Service";
               System.out.println(serviceType);
                break;
            case 4:
               this.serviceType = "beauty Service";
                System.out.println(serviceType);
                break;
            default:
              System.out.println("Service unavailable");
        }
        return serviceType;
    }
 
    /**
     * checkService ask the user to enter a service and check its price
     */
    public void checkService(){
    System.out.print("\nPlease enter the number of Service you want: ");
        System.out.println("\n1- Treatment Service\n2- Massage Service\n3- Gym Service\n4- Beauty Service");
         boolean flag = true;
         
                    while(flag==true){
                        serviceNum = input.nextInt();                       
                        serviceList.add(setServiceType(serviceNum));
                        
                        float chosenServices = checkPrice(serviceNum);
                        
                        System.out.println("Service price: "+chosenServices+"$");
                        
                        System.out.println("\nDo you want to choose another service?\nYes/No");
                        String choice = input.next();
                        System.out.println("Total Price = "+ (total += chosenServices)+"$");  
                        
                        if(choice.equalsIgnoreCase("yes")){
                        System.out.println("\nPlease choose another service:");

                        }
                        else
                         flag = false; 
                   }  
                    
    }
    
    /**
     * displayPayment ask the customer to pay by credit card or cash
     */
    public void displayPayment(){
        System.out.println("\nHow would you like to pay?\n1-Cash \n2-Card\n");
        String answer = input.next();
        if (answer.equals("2")){
        System.out.println("\nEnter your credit card number to complete the process:");
        this.creditCardNo = input.next();
        System.out.println("Paid amount: "+total+"$"+"\nPurchase request completed");}
        else if (answer.equals("1"))
            System.out.println("\n\"The reception will be informed about of your request\"");
        else
            System.out.println("\nPayment method not available");
    }
    
    
     /**
     * checkPrice return the price of the service
     * @param serviceType check if the email is student email or not
     * @return price of service Type
     */
    public float checkPrice(int serviceType){
    switch(serviceType){
        case 1:
            return 300;
        case 2:
            return 500;
        case 3:
            return 450;
        case 4:
            return 250;
        default:
            System.out.println("Service unavailable");
            return 0;
    }
}
          
    /**
    * calculateDiscount calculate total discount for special customer
    * @return total the total discount
    */
    public double calculateDiscount(){
        discount = 0.25;
        return total-=(total *discount);     
    }
   
    /**
    * refundPayment print the refund 
    */
    public void refundPayment(){
          System.out.println("\n-------------------------------------------\nThe refund of your payment is: "+total+"$\nHave nice day\n-------------------------------------------\n");
    }
    
    
    /**
    * printRipt prints the whole Receipt
    */
    public void printRipt(){
        System.out.println("\n-------------------------------------------");
        System.out.println("\n           Customer Receipt\n\n========== Calm Wind SPA ==========");
        System.out.println("Welcome to our SPA! \nChosen servies:");
        for(int i=0; i<serviceList.size();i++){
            System.out.println(serviceList.get(i));
        }
        System.out.println("booking date: "+ super.getDay() + "/ " + super.getMonth() + "/ "+ super.getYear());
        System.out.println("Reservation Id  is: "+reservationId);
        System.out.println("Total price: "+total +"$\n\nENJOY your rest!");
        System.out.println("-------------------------------------------\n");
        
    }
    
}
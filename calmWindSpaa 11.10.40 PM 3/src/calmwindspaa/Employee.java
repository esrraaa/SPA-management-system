/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmwindspaa;
import java.util.*;

/**
 * The purpose of this class is to define the type of employees and print each employee's information
 * This class is derived from the person class
 * @author Esraa Alamoudi, Jenan Mustafa, Ruba Balubaid, Teif Aldadi, Shahad Alharbi
 * @version 2.0
 * 2022/5/23 | 1443/10/22
 */
public class Employee extends Person implements canLogIn{
    /**
    * employeeId This attribute is for the employee's unique ID
    */
    private int employeeId;
    /**
    * employeeType This attribute is for the type of employee
    */
    private String employeeType;
    /**
    * workHours This attribute is for the employee's hours of work
    */
    private int workHours;
    /**
    * experienceYears This attribute is for the employee's years of experience
    */
    private int experienceYears;
    /**
    * salary This attribute is for the employee's salary
    */
    private int salary;
       
    
    
    /**
     * No-argument constructor
     */
    public Employee(){
        super();
    }
    
 
    /**
    * Employee is a constructor of class Employee
    * initializing class fields
    * @param name person name
    * @param username person account username
    * @param email person email address     
    * @param password person account password
    * @param dateOfBirth person birthday
    * @param phone person phone number
    * @param employeeId as a unique ID for each employee
    * @param workHours working hours
    * @param experienceYears Years of Experience
    * @param salary person salary
    */
    public Employee(String name, String username, String email, String password, String dateOfBirth, int phone, int employeeId, int workHours, int experienceYears, int salary) {
        super(name, username, email, password, dateOfBirth, phone);
        this.employeeId = employeeId;
        this.employeeType = checkEmployeeType(employeeId);
        this.workHours = workHours;
        this.experienceYears = experienceYears;
        this.salary = checkSalary(employeeId);
    }
    
    
    /**
     * getEmployeeId get the employee ID number
     * @return employeeId unique ID number for each employee
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * setEmployeeId set the employee's ID number
     * @param employeeId unique ID number for each employee
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * getEmployeeType get the type of employee
     * @return employeeType the department that the employee belongs to 
     */
    public String getEmployeeType() {
        return employeeType;
    }

    /**
     * setEmployeeType set the employee type
     * @param employeeType the department that the employee belongs to
     */
    public void setEmployeeType(String employeeType) { 
        this.employeeType = employeeType;
    }

    /**
     * getWorkHours get the hours of work for the employee
     * @return workHours number of hours worked by the employee per day
     */
    public int getWorkHours() {
        return workHours;
    }

    /**
     * setWorkHours set the hours of work for the employee
     * @param workHours number of hours worked by the employee per day
     */
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    /**
     * getExperienceYears get the number of years of experience for the employee
     * @return experienceYears employee years of experience
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * setExperienceYears set the number of years of experience for the employee
     * @param experienceYears employee years of experience
     */
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    
    /**
     * getSalry get the employee's salary depending on the hours of work
     * @return salary amount of salary for each employee
     */
    public int getSalary() {
        return salary;
    }

    
    /**
     * setSalary set the employee's salary depending on the hours of work
     * @param salary amount of salary for each employee
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
   
    
    
    
    /**
     * checkSalary check the amount of salary for each employee depending on the employee's work hours
     * @param id employee ID
     * @return salary employee salary amount
     */
    public int checkSalary(int id){
        if(checkEmployeeType(id).equals("Reception Employee"))
           salary = workHours*50;
        else if (checkEmployeeType(id).equals("Treatment Employee"))
           salary = workHours*100;
        else if (checkEmployeeType(id).equals("Massage Employee"))
           salary = workHours*150;
        else if (checkEmployeeType(id).equals("Beauty Employee"))
           salary = workHours*200;
        else if (checkEmployeeType(id).equals("Gym Employee"))
           salary = workHours*250;
        else
            salary = 0;
        return salary;
    }

    
    /**
     * checkEmployeeType check the type of employee depending on the employee's ID
     * @param employeeId unique ID for each department
     * @return employeeType the department of each employee 
     */
    public String checkEmployeeType(int employeeId){

        switch(employeeId){
            case 1022:
                employeeType = "Reception Employee";
                break;
            case 1023:
                employeeType = "Treatment Employee";
                break;
            case 1024:
                employeeType = "Massage Employee";
                break;
            case 1025:
                employeeType = "Beauty Employee";
                break;
            case 1026:
                employeeType = "Gym Employee";
                break;
            default:
                employeeType = "ID invalid";
        }
        return employeeType;
    }

    
    /**
    * validUserName check if user name is valid or not
    * @return true if user name is valid and false if not
    */
    @Override
    public boolean validUserName() {
        if(getUserName().contains("!")||getUserName().contains("@")||getUserName().contains("#")||getUserName().contains("$")||getUserName().contains("%")||getUserName().contains("^")||getUserName().contains("&")||getUserName().contains("*")||getUserName().contains("(")||getUserName().contains(")"))
            return false;
        else
            return true;   
    }

  
    /**    
    * validPassword check if password is valid or not
    * @return true if password length greater than 8 and false if less than 8
    */
    @Override
    public boolean validPassword(){
        if(getPassword().length()>=8)
            return true;
        else
            return false;
    }
    
    /**
     * toString() method
     * @return String of attributes values
     */
    @Override
    public String toString() {
        return "\nEmployee Name: " +super.getName() + "\nEmployee ID: " + employeeId + "\nEmployee Type: " + employeeType + "\nWork Hours: " + workHours + "\nExperience Years: " + experienceYears + "\nSalary: " + salary +'$';
    }
    
    
}
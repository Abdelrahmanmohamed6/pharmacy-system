/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public abstract class Employee {

    private String name,phone_number;
    private int id, vacation_day, daily_hours_price;
    private double daily_hours;
//    public Mission mission;
    private String mission;
    private String title;

    public Employee(String name, int id, String phone_number) {
        this.name = name;
        this.id = id;
        this.phone_number = phone_number;
        setTitle();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getVacation_day() {
        return vacation_day;
    }

    public void setVacation_day(int vacation_day) {
        this.vacation_day = vacation_day;
    }

    public int getDaily_hours_price() {
        return daily_hours_price;
    }

    public void setDaily_hours_price(int daily_hours_price) {
        this.daily_hours_price = daily_hours_price;
    }

    public double getDaily_hours() {
        return daily_hours;
    }

    public void setDaily_hours(double daily_hours) {
        this.daily_hours = daily_hours;
    }

//    public Mission getMission() {
//        return mission;
//    }
//
//    public void setMission(Mission mission) {
//        this.mission = mission;
//    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
    
    

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }


    public void setTitle() {
        if (this instanceof Service) {
            title = "Service:";
        } else {
            title = "Doctor:";
        }
    }

    public void takeVacation(int n) {
        if (n < getVacation_day()) {
            setVacation_day(getVacation_day() - n);
        } else {
            System.out.println("YOU DONT HAVE VACATION BALANCE AVAILIBLE : " + getVacation_day());
        }
    }

    public int BaseSalary() {
        return (int) (getDaily_hours() * getDaily_hours_price());
    }

    abstract int ChickOverTime(double daily_hours);

    @Override
    public String toString() {
        return "Employees Information : \n" + getTitle() + "\n Name : " + name + "\n ID : " + id + "\n phone number : " + phone_number + "\n Base Salary : " + BaseSalary() + "\n Salary after Add over Time : " + ChickOverTime(getDaily_hours()) + "\n Mission : " + getMission() + "\n";
    }

}

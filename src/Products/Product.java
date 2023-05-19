/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Products;

import data.structure.QUsingLinkedList;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import java.text.*;

/**
 *
 * @author DELL
 */
public class Product {

    public String name, Source, strDate;
    private Date date, current_date;
    private double selling_price, purchasing_price, discount, gain;
    private int noofproduct;
    private QUsingLinkedList Qproduct_storage;

    public Product(String name, String Source) {
        this.name = name;
        this.Source = Source;
        this.noofproduct = 0;
        this.discount = 0;
        this.current_date = new Date();
        this.Qproduct_storage = new QUsingLinkedList();
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public Date getDate() {
        return date;
    }

    public double getPurchasing_price() {
        return purchasing_price;
    }

    public void setPurchasing_price(double purchasing_price) {
        this.purchasing_price = purchasing_price;
    }

    public int getNoofproduct() {
        return noofproduct;
    }

    public void setNoofproduct(int noofproduct) {
        this.noofproduct = noofproduct;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public void setDate(int day, int month, int year) {
        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.DATE, day);
        calender.set(Calendar.MONTH, month);
        calender.set(Calendar.YEAR, year);
        date = calender.getTime();
//        LocalDate.of(year, month, day).getDayOfWeek().name(); //if need specific day of week
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate(String date) throws Exception {
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            this.strDate = date.format(date);
//            if (this.date.before(current_date)) {
//                throw new Exception("ITS WRONG DATE OR EXPIRED");//must be handle new exception
//
//            }
        } catch (ParseException ex) {
            Logger.getLogger(Product.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void MximumDiscount(double discount) {
        if (this instanceof Medical) {
            if (discount <= 0.15) {
                this.discount = discount;
            } else {
                this.discount = 0.15;//its maximum discount
            }
        } else {//cosmatics
            if (discount <= 0.25) {
                this.discount = discount;
            } else {
                this.discount = 0.25;
            }
        }
    }

    public void buy(int noofproduct, double purchasing_price, String date) {

        this.noofproduct += noofproduct;
        for (int i = 1; i <= noofproduct; i++) {
            try {
                setPurchasing_price(purchasing_price);
                setDate(date);
                setSelling_price(getPurchasing_price() * getGain());//1.2 must change if it cos 
                Qproduct_storage.EnQ(purchasing_price, date);

            } catch (Exception ex) {
                Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public double sell(int noofneed) {//return total cost of same product => using Quene
        if (noofneed <= noofproduct) {//&& this.date.after(current_date)
            for (int i = 1; i <= noofneed; i++) {
                Qproduct_storage.DeQ();
            }
            this.noofproduct -= noofneed;
            return ((getSelling_price() - (getSelling_price() * getDiscount())) * noofneed);
        } else {
            System.out.println("SORRY QUANTITY NOT PROPERATE");
            return 0;
        }
    }

    public void DisplayproductQ() {
        Qproduct_storage.display();
    }

//    @Override
//    public void run(){
//        System.out.println("thread");
//    }
    @Override
    public String toString() {
        String type;
        if (this instanceof Medical) {
            type = "Medical";
        } else {
            type = "Cosmatics";
        }
        return "PRODUCT Information : \nTYPE : " + type + "\n Name : " + name + "\n selling price : " + selling_price + "\n THE Source : " + Source + "\n THE availible number : " + noofproduct + "\n";
    }

}

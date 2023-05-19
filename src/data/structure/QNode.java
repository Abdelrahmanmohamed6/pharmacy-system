/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structure;

import Products.Product;
import java.util.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class QNode {

    protected QNode Next;
    protected Date date;
    protected String strDate;
    public double purchasing_price, selling_price;
    public QNode(double purchasing_price, String date) {
        this.Next = null;
        this.purchasing_price = purchasing_price;
        try {
            this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            this.strDate = date.format(date);
        } catch (ParseException ex) {
            Logger.getLogger(QNode.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(QNode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

    public double getPurchasing_price() {
        return purchasing_price;
    }

    public void setPurchasing_price(double purchasing_price) {
        this.purchasing_price = purchasing_price;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public void setSelling_price(double selling_price) {
        this.selling_price = selling_price;
    }

}

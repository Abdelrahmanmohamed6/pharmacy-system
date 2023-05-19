/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;

import Products.Product;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class Client {

    private String name, phone_number;
    private int id;
    public double total;

    public Client(String name, String phone_number, int id) {
        this.name = name;
        this.phone_number = phone_number;
        this.id = id;

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public abstract void buy(Product product, int noofneed);

    @Override
    public String toString() {
        return "Client : \n name : " + name + "\n phone_number : " + phone_number + "\n id : " + id + "\n total product price : " + getTotal()+"\n" ;
    }




}

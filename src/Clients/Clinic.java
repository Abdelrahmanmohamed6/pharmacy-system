/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clients;

import Products.Cosmotics;
import Products.Medical;
import Products.Product;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Clinic extends Client {

    public Clinic(String name, String phone_number, int id) {
        super(name, phone_number, id);
    }

    @Override
    public void buy(Product product, int noofneed) {
        product.MximumDiscount(0.10);
        this.total +=product.sell(noofneed);      
    }
}

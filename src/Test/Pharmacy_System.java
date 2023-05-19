/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Clients.Client;
import Employees.Employee;
import Products.Product;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Pharmacy_System {

    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();

    public Pharmacy_System(ArrayList<Client> clients, ArrayList<Employee> employees, ArrayList<Product> products) {
        this.clients=clients;
        this.employees=employees;
        this.products=products;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Clients.*;
import Employees.*;
import Products.*;
import Test.*;
import data.structure.*;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//                                           **  EMPLOYEES  ** 
////
        Doctor Abdullatif = new Doctor("Abdullatif", 1, "011544", "owner");
        Doctor Mahmoud = new Doctor("Mahmoud", 2, "0125542", "manager");
        Doctor Shady = new Doctor("Shady", 3, "015225552", "worker");
//        
        Service Islam = new Service("Islam", 4, "021656", "cashir");
        Service Abdallah = new Service("Abdallah", 5, "0345464", "delivery");
//
        Abdallah.ChickOverTime(9);      //deafault 8 hours-->1 hour overtime + over time 4 day vacation
        Abdallah.takeVacation(3);       // will minus vacations day from over time
//
        SingleLinkedList employees = new SingleLinkedList();
        employees.AddNode(Abdullatif);
        employees.AddNode(Mahmoud);
        employees.AddNode(Shady);
        employees.AddNode(Islam);
        employees.AddNode(Abdallah);
        employees.PrintList();
//        System.out.println(employees.CountNodes());
//
//                                        **  PRODUCTS  ** 
//
        Medical cital = new Medical("cital", "elmothda");
        cital.buy(2, 10, "10/6/2022");
        cital.buy(1, 12, "15/6/2022");
        cital.buy(1, 14, "20/7/2022");
        cital.buy(1, 15, "05/6/2023");
//        
        Cosmotics eva = new Cosmotics("Eva", "elmothda");
        eva.buy(5, 10, "10/7/2024");
//        
//                                        **  CLIENTS  ** 
//
        Monthly_Client abbas = new Monthly_Client("abbas", "0122545", 1);
        abbas.buy(cital, 1);
        abbas.buy(eva, 1);

        Clinic safwa = new Clinic("Elsafwa", "0124556", 2);
        safwa.buy(cital, 1);
        safwa.buy(eva, 1);
         
        Doctorr said = new Doctorr("said", "01214548", 3);
        said.buy(cital, 1);
        said.buy(eva, 1);
//        


//        ArrayList<Employee> employees = new ArrayList<>();                  //here the eror is only ruun only doc or ser
//        employees.add(Shady);
//        employees.add(Mahmoud);
//        employees.add(Abdullatif);
//        employees.add(Islam);
//        employees.add(Abdallah);
////        
//        ArrayList<Product> products = new ArrayList<>();
//        products.add(eva);
//        products.add(cital);
////        
//        ArrayList<Client> clients = new ArrayList<>();
//        clients.add(said);
//        clients.add(abbas);
//        clients.add(safwa);

//        System.out.println(eva.toString());
//        System.out.println(cital.toString());
        cital.DisplayproductQ();
//        System.out.println(abbas.toString());
//        for (Employee employee : employees) {
//        System.out.println(employee.toString());
//        }
//
//        Pharmacy_System el2gz5ana = new Pharmacy_System(clients, employees, products);
////        
//        File file = new File("Report.txt");
//        try {                                      //every time sent report updation
//            FileWriter fw = new FileWriter("Report.txt");
////            for (Employee employee : employees) {
////                fw.write(employee.toString());
////            }
//
//            for (Product product : products) {
//                fw.write(product.toString());
//            }
//            for (Client client : clients) {
//                fw.write(client.toString());
//            }
//            fw.flush();
//        } catch (IOException e) {
//            System.out.println("rr");
//        }
//    Runnable r =new Product();
//    Thread k = new Thread(r);
//    k.start();
    }
}

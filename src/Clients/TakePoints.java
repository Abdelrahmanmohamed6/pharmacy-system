/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clients;

/**
 *
 * @author DELL
 */
public class TakePoints implements Points{
    
   @Override
   public void takePoints(Client client){
    if(client.getTotal()>10000){
        System.out.println("Congrates you take points");
    }
   }
}

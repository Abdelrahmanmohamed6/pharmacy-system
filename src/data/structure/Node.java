/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structure;

import Employees.Employee;

/**
 *
 * @author DELL
 */
public class Node {
    public Employee employee;
    public Node Next;

    public Node(Employee data, Node Next) {  //Constractor instead METHOD Create Node
        this.employee = data;
        this.Next = null;
    }

    public Node() {
    }
    
   
    
}

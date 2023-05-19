/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.structure;

import Products.Product;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class QUsingLinkedList {

    QNode front, rear;
//        Product product;

    public QUsingLinkedList() {
        front = rear = null;
    }

    public boolean EnQ(double purchasing_price, String date) throws Exception {
        boolean retval = false;
        QNode node = new QNode(purchasing_price, date);//add data to node
//        node.setSelling_price(purchasing_price*product.gain);
        if (node != null) {//created
            if (front == null) {
                front = rear = node;
            } else {
                rear.Next = node;
                rear = node;
            }
            retval = true;
        }
        return retval;
    }

    public QNode DeQ() {
        QNode retval = null;
        if (front != null) {
            retval = front;
            front = front.Next;
            if (front == null) {
                rear = null;
            }
        }
        return retval;
    }

    boolean isEmpty() {
        return front == null;
    }

    public QNode getFront() {
        return front;
    }

    public void setFront(QNode front) {
        this.front = front;
    }

    public void display() {
        QUsingLinkedList temp = new QUsingLinkedList();
        QNode tmpnode;
        System.out.println("PRODUCT REPORT ");
        while (!this.isEmpty()) {
            try {
                tmpnode = DeQ();
                System.out.println("Comes in: " + tmpnode.getStrDate() + " & With price: " + tmpnode.getPurchasing_price());
                temp.EnQ(tmpnode.getPurchasing_price(), tmpnode.getStrDate());
            } catch (Exception ex) {
                Logger.getLogger(QUsingLinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (!temp.isEmpty()) {
            tmpnode = temp.DeQ();
            try {
                EnQ(tmpnode.getPurchasing_price(), tmpnode.getStrDate());
            } catch (Exception ex) {
                Logger.getLogger(QUsingLinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    

}

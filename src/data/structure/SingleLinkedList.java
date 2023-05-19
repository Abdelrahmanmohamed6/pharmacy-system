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
public class SingleLinkedList {

    Node Head = null;

    public Node CreateNode(Employee Data) {
        Node node = new Node();
        if (node != null) { //created succefully
            node.employee = Data;
            node.Next = null;
        }
        return node;
    }

    public boolean AddNode(Employee Data) {
        boolean retval = false;
        Node node = CreateNode(Data);
        Node temp;
        if (node != null) {     //createdsuccefully
            if (Head == null) { //no list
                Head = node;
            } else {   //List
                temp = Head;
                while (temp.Next != null) { //case 1 or more temp in one step
                    temp = temp.Next;
                }
                temp.Next = node;
            }
            retval = true;
        }
        return retval;
    }

    public boolean InsertNode(Employee Data, int loc) {
        boolean retval = false;
        Node node = CreateNode(Data);
        Node temp;
        if (node != null) {
            if (Head == null) {
                Head = node;
            } else {
                if (loc == 0) {
                    node.Next = Head;
                    Head = node;
                } else {
                    temp = Head;
                    for (int i = 0; i < loc - 1 && temp.Next != null; i++) {//middle or last   ###attension temp wla temp.next
                        temp = temp.Next;
                    }
                    if (temp.Next == null) { //add to last 
                        temp.Next = node;
                    } else {
                        node.Next = temp.Next;
                        temp.Next = node;
                    }
                }
            }
            retval = true;
        }
        return retval;
    }

    public Node SearchNode(Employee Data) {
        Node node = Head;
        while (node != null && node.employee != Data) {
            node = node.Next;
        }
        return node;
    }

    public void PrintList() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.employee + " ");
            temp = temp.Next;
        }
        System.out.println("");

    }

    public int CountNodes() {
        Node temp = Head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.Next;
        }
//        System.out.println("count is " + count);
        return count;
    }

    public int NodePos(Employee Data) {    //mknt4 3arfha
        int pos = -1;     //initial -1
        Node temp = Head;
        while (temp != null) {  //there is the list
            pos++;
            if (temp.employee == Data) {
                return pos;
            }

            temp = temp.Next;
        }
        return -1;
    }

    public boolean CheckNodeExist(Employee Data) {  //i see it same search
        return NodePos(Data) != -1;     //#########
    }

    public boolean DeleteNode(int loc) {
        boolean retval = false;
        Node temp = Head;
        if (Head != null) {
            if (loc == 0) {//first
                Head = Head.Next;
                retval = true;
            } else {//midlle or last
                for (int i = 1; i < loc && temp != null; i++) {
                    temp = temp.Next;
                }
                if (temp != null) {//node found
                    temp.Next = temp.Next.Next;
                    retval = true;
                }
            }
        }
        return retval;
    }

    public void Concatinatination(SingleLinkedList list) {
        Node temp = Head;
        while (temp.Next != null) {
            temp = temp.Next;
        }
        temp.Next = list.Head;
    }

}

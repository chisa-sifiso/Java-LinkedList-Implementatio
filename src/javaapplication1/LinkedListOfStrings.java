/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Sifiso
 */
public class LinkedListOfStrings {
    public class Node{
      private String item;
      private Node next;
    }
    private Node head;
    
    public void addBegining(String iteam){
        Node newNode = new Node();//new node has refere
        newNode.item=iteam;
        newNode.next=head;
        head = newNode;//store the reference
    } 
    public void addEnd(String iteam){
        Node newNode =new Node();
        newNode.item=iteam;
        
        Node temp = head;
        while(temp.next!=null){
          temp=temp.next;  
        }
        temp.next=newNode;//addind reffrance to the last node
        
    }
    public void removeEnd(){
        if (head == null) { // If list is empty
           System.out.println("List is empty, nothing to remove.");
           return;
       }
        if (head.next == null) { // If there's only one node
           head = null;
           return;
       }

       Node temp = head;
       while (temp.next.next != null) { // Traverse to the second-last node
           temp = temp.next;
       }

       temp.next = null; // Remove reference to the last node
    }
    public void removeBegining(){
        Node temp = head;
        head = temp.next;
        
    }
   public void display(){
       Node temp = head;
       while(temp!=null){
           System.out.print(temp.item+"->");
           temp=temp.next;
       }
       System.out.print(" End");
       
   }
    
    
}

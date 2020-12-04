/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractclasschallenge;

/**
 *
 * @author kerbag
 */
public class Main {
   public static void main(String[] args){
      MyLinkedList list = new MyLinkedList(null);
      list.traverse(list.getRoot());
      String stringData = "5 7 3 9 8 2 1 0 4 6";
      String[] data = stringData.split(" ");
      for(String s : data){
         list.addItem(new Node(s));
      }
      list.traverse(list.getRoot());
      list.removeItem(new Node("5"));
      list.traverse(list.getRoot());
      
   }
   
}

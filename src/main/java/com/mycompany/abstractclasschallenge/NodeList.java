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
public interface NodeList {
   ListItem getRoot();
   boolean addItem(ListItem item);
   boolean removeItem(ListItem item);
   void traverse(ListItem root);
}

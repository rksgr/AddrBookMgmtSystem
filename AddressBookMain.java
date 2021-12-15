
package com.mycompany.dec_14_addressbookmgmt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class AddressBookMain {
    /*
    Use Case 1: Create contacts in address book
    */
    public void createContacts(ArrayList <String> contact){
        
        // Create an arraylist of arraylist to store contact details of all the persons
        ArrayList<ArrayList <String>> address_book = new ArrayList<ArrayList <String>>();
        
        // Add contact details of person to address book
        address_book.add(contact);
    }
    
    public static void main(String []args){
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain abm  = new AddressBookMain();
        //abm.createContacts();
        
    }
}

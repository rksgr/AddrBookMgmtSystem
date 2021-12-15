
package com.mycompany.dec_14_addressbookmgmt;
import java.util.ArrayList;
import java.util.Arrays;



public class AddressBookMain {
    /*
    Use Case 1: Create contacts in address book
    */
    public void createContacts(String first_name,String last_name,String address,
            String city, String state, String zip, String phone_num,String email){
        
        // Create a new arraylist of arraylist to store details of all the persons
        ArrayList<ArrayList <String>> address_book = new ArrayList<ArrayList <String>>();
        
        // ArrayList of string type to store contact details of a person
        ArrayList <String> contacts = new ArrayList <String>();
        contacts.add(first_name);
        contacts.add(last_name);
        contacts.add(address);
        contacts.add(city);        
        contacts.add(state);        
        contacts.add(zip);
        contacts.add(phone_num);        
        contacts.add(email);                 
        // Add contact details of person to address book
        address_book.add(contacts);
    }
    
    
    public static void main(String []args){
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain abm  = new AddressBookMain();
        //abm.createContacts();
        
    }
}

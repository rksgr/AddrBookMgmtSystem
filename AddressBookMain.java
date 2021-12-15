
package com.mycompany.dec_14_addressbookmgmt;
import java.util.ArrayList;
import java.util.Arrays;



public class AddressBookMain {
    /*
    Use Case 1: Create contacts in address book
    */
    public void createContacts(){
        // Initialize variables
        String first_name = "first_name";
        String last_name = "last_name";
        String address = "address";
        String city = "city";
        String state = "state";
        String zip = "zip";
        String phone_num = "phone_num";
        String email = "email";
        
        // Create a new arraylist of arrays to store details of all the persons
        ArrayList<String[]> address_book = new ArrayList<String []>();
        
        // Array of string type to store contact details of a person
        String contact[] = {first_name,last_name,address,city,state,zip,phone_num,email};
        
        // Add contact details of a person to address book(arraylist)
        address_book.add(contact);
    }
    
    
    public static void main(String []args){
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain abm  = new AddressBookMain();
        abm.createContacts();
        
    }
}

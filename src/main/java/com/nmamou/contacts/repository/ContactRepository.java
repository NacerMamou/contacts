package com.nmamou.contacts.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nmamou.contacts.pojo.Contact;

@Repository
public class ContactRepository {
  private List<Contact> contacts = Arrays.asList(
    new Contact("123", "Jon Snow", "90"),
    new Contact("124", "Jon Dow", "91"),
    new Contact("125", "Jon Smile", "92")
  );

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, Contact contact) { 
        contacts.set(index, contact); 
    }
    
    public void deleteContact(int index) {
        contacts.remove(index);
    }
}

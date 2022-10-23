package com.nmamou.contacts.service;

import java.util.List;

import com.nmamou.contacts.pojo.Contact;

public interface ContactService {
  // Abstract Method having no body
  Contact getContactById(String id);
  void saveContact(Contact contact);
  List<Contact> getContacts();
  void updateContact(String id, Contact contact);
  void deleteContact(String id);
}

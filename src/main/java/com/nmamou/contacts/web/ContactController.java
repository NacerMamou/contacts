package com.nmamou.contacts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nmamou.contacts.pojo.Contact;
import com.nmamou.contacts.service.ContactService;

@RestController
public class ContactController {
  @Autowired
  private ContactService contactService;

  @GetMapping("/contact/{id}")
  public ResponseEntity<Contact> getContact(@PathVariable String id){
    System.out.println(id);
    Contact contact = contactService.getContactById(id);
    return new ResponseEntity<>(contact, HttpStatus.OK);
  }
}

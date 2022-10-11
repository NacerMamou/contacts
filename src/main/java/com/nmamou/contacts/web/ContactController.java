package com.nmamou.contacts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nmamou.contacts.pojo.Contact;
import com.nmamou.contacts.service.ContactService;

@RestController
// Use directly @RestController instead of @Controller
// This the same as @Controller + @ResponseBody 

// @ResponseBody
// Or used at class level
public class ContactController {
  @Autowired
  private ContactService contactService;

  @GetMapping("/contact/{id}")
  // It can used at method level 
  // @ResponseBody 
  public Contact getContact(@PathVariable String id){
    System.out.println(id);
    // When a RestController is used this will automatically wrap the data in json object included in the response
    return new Contact("123", "Nacer", "1232393948");
  }
}

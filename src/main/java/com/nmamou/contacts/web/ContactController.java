package com.nmamou.contacts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nmamou.contacts.service.ContactService;

@Controller
public class ContactController {
  @Autowired
  private ContactService contactService;
}

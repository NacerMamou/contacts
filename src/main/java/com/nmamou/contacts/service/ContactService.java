package com.nmamou.contacts.service;

import com.nmamou.contacts.pojo.Contact;

public interface ContactService {
  // Abstract Method having no body
  Contact getContactById(String id);
}

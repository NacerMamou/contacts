package com.nmamou.contacts.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.nmamou.contacts.pojo.Contact;
import com.nmamou.contacts.repository.ContactRepository;

@Service
@ConditionalOnProperty(name = "server.port", havingValue = "8000")
public class ContactServiceImpl implements ContactService {
  @Autowired
  private ContactRepository contactRepository;

  private int findIndexById(String id) {
    return IntStream.range(0, contactRepository.getContacts().size())
        .filter(index -> contactRepository.getContacts().get(index).getId().equals(id))
        .findFirst()
        .orElseThrow();
  }

  @Override
  public Contact getContactById(String id){
    return contactRepository.getContact(findIndexById(id));
  }
  @Override
  public void saveContact(Contact contact){
    contactRepository.saveContact(contact);
  }
  @Override
  public List<Contact> getContacts(){
    return contactRepository.getContacts();
  }

  @Override
  public void updateContact(String id, Contact contact){
    contactRepository.updateContact(findIndexById(id), contact);
  }

  @Override
  public void deleteContact(String id){
    contactRepository.deleteContact(findIndexById(id));
  }
}

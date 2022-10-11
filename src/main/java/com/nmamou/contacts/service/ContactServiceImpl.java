package com.nmamou.contacts.service;

import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

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
}

package com.mariusz.swierkot.springsecurity.repository;

import com.mariusz.swierkot.springsecurity.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}

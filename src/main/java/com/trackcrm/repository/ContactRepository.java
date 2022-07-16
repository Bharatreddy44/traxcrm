package com.trackcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trackcrm.entity.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}

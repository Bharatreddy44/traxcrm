package com.trackcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trackcrm.entity.Lead;

public interface LeadsRepository extends JpaRepository<Lead, Long> {

}

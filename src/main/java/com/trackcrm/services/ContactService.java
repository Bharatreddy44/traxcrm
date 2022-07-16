package com.trackcrm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trackcrm.entity.Billing;
import com.trackcrm.entity.Contacts;

@Service
public interface ContactService {
	
	public void saveContact(Contacts contact);

	public List<Contacts> listAll();

	public Contacts findContactsById(long id);

}

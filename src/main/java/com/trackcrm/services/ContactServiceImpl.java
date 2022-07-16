package com.trackcrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackcrm.entity.Billing;
import com.trackcrm.entity.Contacts;
import com.trackcrm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	
	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void saveContact(Contacts contact) {
			contactRepo.save(contact);
	}

	@Override
	public List<Contacts> listAll() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts findContactsById(long id) {
		Optional<Contacts> contactBy = contactRepo.findById(id);
		Contacts contact=contactBy.get();
		return contact;
	}
}

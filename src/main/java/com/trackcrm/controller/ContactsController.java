package com.trackcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackcrm.entity.Contacts;
import com.trackcrm.services.ContactService;

@Controller
public class ContactsController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap model) {
		List<Contacts> contacts = contactService.listAll();
		model.addAttribute("contacts", contacts);
		return "search_contact";
	}
	
	@RequestMapping("/getContactsById")
	public String getContactsById(@RequestParam("id") long id, ModelMap model) {
		Contacts contact = contactService.findContactsById(id);
		model.addAttribute("contact", contact);
		return "contact_info";	
	}
}

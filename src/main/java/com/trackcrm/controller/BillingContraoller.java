package com.trackcrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackcrm.entity.Contacts;
import com.trackcrm.services.ContactService;

@Controller
public class BillingContraoller {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/generateBill")
	public String viewBillingPage(@RequestParam("id") long id, ModelMap map) {
		Contacts contact = contactService.findContactsById(id);
		map.addAttribute("contact", contact);
		return "create_bill";
	}
	
	/*
	 * @RequestMapping("/saveBill") public String billingInfo(@RequestParam("id")
	 * long id, ModelMap map ) { contactService.saveContact(contact); return " "; }
	 */
}

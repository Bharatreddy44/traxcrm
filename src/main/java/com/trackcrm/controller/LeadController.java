package com.trackcrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackcrm.entity.Contacts;
import com.trackcrm.entity.Lead;
import com.trackcrm.services.ContactService;
import com.trackcrm.services.LeadService;


@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/")
	public String viewLeadPage() {
		return "view_lead_pages";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertedLead")
	public String converLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getLeadById(id);	
		
		Contacts contact=new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setLeadSource(lead.getLeadSource());
		contact.setGender(lead.getGender());
		
		
		contactService.saveContact(contact);
		
		leadService.deleteOneLead(id);
		
		List<Contacts> contacts = contactService.listAll();
		model.addAttribute("contacts", contacts);
		
		return "search_contact";
	}
	
	@RequestMapping("/listAllLeads")
	public String getAllLeads(Model map){
		List<Lead> leads = leadService.listAll();
		map.addAttribute("leads", leads);
		return "search_leads";
	}
	
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
}

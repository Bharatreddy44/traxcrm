package com.trackcrm.services;

import java.util.List;

import com.trackcrm.entity.Lead;

public interface LeadService {
	public void saveLead(Lead lead);
	public Lead getLeadById(long id);
	public void deleteOneLead(long id);
	public List<Lead> listAll();
}

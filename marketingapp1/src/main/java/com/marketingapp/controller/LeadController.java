package com.marketingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;

	@RequestMapping("/createLead")
	public String viewCreateLeadPage() {
		return "create_new_lead";
	}

//	@RequestMapping("/saveLead")
//	public String saveOneLead(@ModelAttribute("lead") Lead lead) {
////		System.out.println(lead.getFirstName());
////		System.out.println(lead.getLastName());
////		System.out.println(lead.getEmail());
////		System.out.println(lead.getMobile());
////		System.out.println("Completed");
//		leadService.saveLead(lead);
//		return "create_new_lead";
//	}
//	@RequestMapping("/saveLead")
//    public String saveOneLead(LeadData data) {
//		Lead l = new Lead();
////		leadService.saveLead(data);
//		l.setFirstName(data.getFirstName());
//		l.setLastName(data.getLastName());
//		l.setEmail(data.getEmail());
//		l.setMobile(data.getMobile());
//		leadService.saveLead(l);
//        return "create_new_lead";
//	}
	@RequestMapping("/saveLead")
	public String saveOneLead(@RequestParam("firstName") String fName,@RequestParam("lastName") String lName,@RequestParam("email") String emailId,@RequestParam("mobile") long mobile) {
		Lead l = new Lead();
		//leadService.saveLead(data);
		l.setFirstName(fName);
		l.setLastName(lName);
		l.setEmail(emailId);
		l.setMobile(mobile);
		leadService.saveLead(l);
		return "create_new_lead";
	}

}

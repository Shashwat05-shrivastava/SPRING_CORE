package org.virtusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.virtusa.services.SampleServices;

@Component
public class SampleController {
	private SampleServices services;
	
	@Autowired
	public SampleController(SampleServices services) {
		super();
		this.services = services;
	}
	public void controller() {
		services.service();
	}
	
}

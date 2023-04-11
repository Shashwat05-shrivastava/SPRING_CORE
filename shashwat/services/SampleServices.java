package org.virtusa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.virtusa.dao.SampleDao;

@Component
public class SampleServices {
	private SampleDao dao;
	
	@Autowired
	public SampleServices(SampleDao dao) {
		super();
		this.dao = dao;
	}

	public void service() {
		dao.dao();
	}
}

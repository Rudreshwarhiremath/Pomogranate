package com.xworkz.crud.implimentres;

import com.xworkz.crud.excepion.EmailSizeExceededException;
import com.xworkz.crud.repository.EmailRepository;

public class EmailRepositeryImpl implements EmailRepository {
	private String [] emails=new String[10];
	private int emailIndex=0;
	

	@Override
	public boolean create(String email) {
		//System.out.println("Running create in email repo....");
		if(this.emailIndex>=this.emails.length) {
			throw new EmailSizeExceededException();
		}
		this.emails[emailIndex]=email;
		this.emailIndex++;
		return false;
	}
	@Override
	public int total() {
		System.out.println("Total");
		return this.emailIndex;
		
	}

}
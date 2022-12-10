package com.xworkz.crud.boot;

import com.xworkz.crud.implimentres.EmailRepositeryImpl;
import com.xworkz.crud.repository.EmailRepository;

public class EmailRepositoryRunner {

	public static void main(String[] args) {
		EmailRepository mail=new EmailRepositeryImpl();
		mail.create("Rudreshwar@gmail.com");
		mail.create("veeresh@gmail.com");
		mail.create("jagadeesh@gmail.com");
		mail.create("prashant@gmail.com");
		mail.create("siddu@gmail.com");
		mail.create("malku@gmail.com");
		mail.create("deepak@gmail.com");
		mail.create("vijaysai@gmail.com");
		mail.create("rohit@gmail.com");
		mail.create("bassu@gmail.com");
		mail.create("deepak@gmail.com");
		
		System.out.println(mail.total());

	}

}

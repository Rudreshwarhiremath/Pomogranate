package com.xworkz.bridge.govern;

import com.xworkz.bridge.rules.LibrariaRules;

public class Librarian {
	private LibrariaRules librarianRules;

	public Librarian() {
		super();
	}

	public Librarian(LibrariaRules librarianRules) {
		super();
		this.librarianRules = librarianRules;
	}
	public void librarianrule() {
		if(librarianRules!=null) {
			boolean rule1=librarianRules.silent();
			boolean rule2=librarianRules.timimg();
			int rule3=librarianRules.peoples();
			if(rule1==true&& rule2==true&& rule3<=2) {
				System.out.println("This library is fallowing rules");
			}else {
				System.out.println("This library is not fallowing rules");
				
			}
		}
	}
	
	

}

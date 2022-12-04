package com.xworkz.bridge.runner;

import com.xworkz.bridge.fallowers.Readers1;
import com.xworkz.bridge.fallowers.Readers2;
import com.xworkz.bridge.govern.Librarian;

public class LibrarianRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Readers1 read1=new Readers1();
		Readers2 read2=new Readers2();
		Librarian librian=new Librarian(read1);
		Librarian librian2=new Librarian(read2);
		librian.librarianrule();
		librian2.librarianrule();

	}

}

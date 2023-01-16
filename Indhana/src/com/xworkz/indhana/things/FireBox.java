package com.xworkz.indhana.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Browser;
import com.xworkz.indhana.intera.Provider;

@Component
public class FireBox implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;

	public FireBox() {
		System.out.println("created FireBox");
	}

	@Override
	public void browse() {
		provider.connect();
		System.out.println("implimented browse in FireBox");
	}

}

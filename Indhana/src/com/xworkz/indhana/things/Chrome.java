package com.xworkz.indhana.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.indhana.intera.Browser;
import com.xworkz.indhana.intera.Provider;
@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	public Chrome() {
		System.out.println("created chrome ");
	}

	@Override
	public void browse() {
		provider.connect();
		System.out.println("implimented browse in chrome");
	}

}

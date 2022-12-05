package com.xworkz.bridge.runner;

import com.xworkz.bridge.things.JavaTrainee;
import com.xworkz.bridge.things.KarnartakaRTO;
import com.xworkz.bridge.things.Person;
import com.xworkz.bridge.things.TransportRule;
import com.xworkz.bridge.things.VijayLakshmi;
import com.xworkz.bridge.things.XworkzRule;

public class JavatraineeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new VijayLakshmi();
		person.setAge(23);
		person.setDateofbirth("20-11-2000");
		person.setMobileNo(8088888888L);
		person.setName("Pradeep ");
		person.setPassout(2022);
		System.out.println(person.getAge());
		System.out.println(person.getDateofbirth());
		System.out.println(person.getMobileNo());
		System.out.println(person.getName());
		System.out.println(person.getPassout());

		System.out.println(System.lineSeparator());

		TransportRule rule = new VijayLakshmi();
		System.out.println(rule.gst());
		System.out.println(rule.paidTax(25000));
		System.out.println(System.lineSeparator());

		XworkzRule rule2 = new VijayLakshmi();
		System.out.println(rule2.completedProgram());
		System.out.println(rule2.uploadedTask());
		System.out.println(System.lineSeparator());

		KarnartakaRTO rule3 = new VijayLakshmi();
		System.out.println(rule3.gst());
		System.out.println(rule3.paidTax(35000));
		System.out.println(rule3.vat());
		System.out.println(System.lineSeparator());

		JavaTrainee rule4 = new VijayLakshmi();
		rule4.setAge(24);
		rule4.setDateofbirth("26-11-1999");
		rule4.setMobileNo(8088928928L);
		rule4.setName("Prakash");
		rule4.setPassout(2021);
		System.out.println(rule4.getAge());
		System.out.println(rule4.getDateofbirth());
		System.out.println(rule4.getMobileNo());
		System.out.println(rule4.getName());
		System.out.println(rule4.getPassout());
		System.out.println(rule4.completedProgram());
		System.out.println(rule4.uploadedTask());

		System.out.println(System.lineSeparator());

		VijayLakshmi rule5 = new VijayLakshmi();
		rule5.setAge(26);
		rule5.setDateofbirth("15-11-1997");
		rule5.setMobileNo(999999999999L);
		rule5.setName("Deepak");
		rule5.setPassout(2018);
		System.out.println(rule5.getAge());
		System.out.println(rule5.getDateofbirth());
		System.out.println(rule5.getMobileNo());
		System.out.println(rule5.getName());
		System.out.println(rule5.getPassout());
		System.out.println(rule5.completedProgram());
		System.out.println(rule5.uploadedTask());
		System.out.println(rule5.paidTax(10000));
		System.out.println(rule5.gst());
		System.out.println(rule5.vat());

	}

}

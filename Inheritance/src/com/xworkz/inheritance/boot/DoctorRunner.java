package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Doctor;
import com.xworkz.inheritance.things.child.Cardiologist;
import com.xworkz.inheritance.things.child.Dentist;
import com.xworkz.inheritance.things.child.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor=new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.number);
		ENT doctor1=new ENT();
		System.out.println(doctor1.Hname);
		System.out.println(doctor1.patients);
		Dentist doctor2=new Dentist();
		System.out.println(doctor2.expireance);
		System.out.println(doctor2.location);
		Cardiologist doctor3=new Cardiologist();
		System.out.println(doctor3.income);
		System.out.println(doctor3.workers);
		
		Doctor dent=(Dentist)doctor2;
		Doctor ent=(ENT)doctor1;
		Doctor cardo=(Cardiologist)doctor3;
		System.out.println(dent.name);
		System.out.println(dent.number);
		System.out.println(ent.name);
		System.out.println(ent.number);
		System.out.println(cardo.name);
		System.out.println(cardo.number);




		

	}

}

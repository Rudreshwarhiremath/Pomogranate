package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Doctor;
import com.xworkz.inheritance.things.child.Cardiologist;
import com.xworkz.inheritance.things.child.Dentist;
import com.xworkz.inheritance.things.child.ENT;

public class DoctorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.number);
		ENT doctor1 = new ENT();
		System.out.println(doctor1.Hname);
		System.out.println(doctor1.patients);
		Dentist doctor2 = new Dentist();
		System.out.println(doctor2.expireance);
		System.out.println(doctor2.location);
		Cardiologist doctor3 = new Cardiologist();
		System.out.println(doctor3.income);
		System.out.println(doctor3.workers);
		System.out.println("------------------------------------------------------------");

		
		Doctor doctor4=new Cardiologist();
		System.out.println(doctor4.name);
		System.out.println(doctor4.number);
		Cardiologist cardiologist=(Cardiologist)doctor4;
		System.out.println(cardiologist.income);
		System.out.println(cardiologist.workers);
		Doctor doctor5=new ENT();
		ENT ent1=(ENT)doctor5;
		System.out.println(ent1.Hname);
		System.out.println(ent1.patients);
		Doctor doctor6=new Dentist();
		Dentist denti=(Dentist)doctor6;
		System.out.println(denti.expireance);
		System.out.println(denti.location);
		

	}

}

package com.xworkz.Product.equalsrunner;

import com.xworkz.Product.equals.Currency;
import com.xworkz.Product.equals.God;
import com.xworkz.Product.equals.Hospitel;
import com.xworkz.Product.equals.Institution;
import com.xworkz.Product.equals.Makeupkit;
import com.xworkz.Product.equals.Paint;
import com.xworkz.Product.equals.Vehicle;
import com.xworkz.Product.equals.WaterBottel;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint("Apex Ultima", 1.00, "Saffron", "Asiaan", 500, true, true, "Best", "Oilpaint","Banglore");
        Paint paint1=new Paint();
		paint1.setBrand("Asian");
		paint1.setColor("White");
		paint1.setDustproof(true);
		paint1.setLocation("Banglore");
		paint1.setName("Emporia");
		paint1.setPrice(500);
		paint1.setQuality("Best");
		paint1.setQuantity(2.5);
		paint1.setType("oilpaint");
		paint1.setWaterproof(true);
		System.out.println(paint);
		System.out.println(paint1);
		boolean same=paint.equals(paint1);
		System.out.println(same);
		paint=paint1;
		boolean same14=paint.equals(paint1);
		System.out.println(same14);
		System.out.println(System.lineSeparator());
		Vehicle car=new Vehicle("Car", "4Wheeler","Mahindra",7,7,"XUV700","Bidar", "Rudresh",24,"KA39M505");
		Vehicle bike=new Vehicle("Bike", "2wheeler", "Mahindra", 2, 2, "Jawa", "Bidar", "Jaagadeesh", 26, "KA56J2365");
		System.out.println(car);
		System.out.println(bike);
		boolean same1=car.equals(bike);
		System.out.println(same1);
		bike=car;
		boolean same13=car.equals(bike);
		System.out.println(same13);
		System.out.println(System.lineSeparator());
		WaterBottel bottel=new WaterBottel("Biseleri","Biseleri", "Filtred",'M', 500, true, 10,7, 3,"RequiredMinerls");
		WaterBottel water=new WaterBottel("Kinley","Kinely", "Filtred",'M', 1000, true, 25,18, 7,"RequiredMinerls");
		System.out.println(bottel);
		System.out.println(water);
		boolean same2=bottel.equals(water);
		System.out.println(same2);
		bottel=water;
		boolean same3=bottel.equals(water);
		System.out.println(same3);
		System.out.println(System.lineSeparator());
		Currency rokka=new Currency("USA", "Doller",80,"UK","Pounda",94.05,"Japan","japnies",0.55,100);
		Currency duddu=new Currency("Poland", "Polish zloty",80,"UK","Pounda",94.05,"Japan","japnies",0.55,100);
		System.out.println(rokka);
		System.out.println(duddu);
		boolean same4=rokka.equals(duddu);
		System.out.println(same4);
		rokka=duddu;
		boolean same5=rokka.equals(duddu);
		System.out.println(same5);
		System.out.println(System.lineSeparator());
		God god=new God("Devi", "female", "Banglore", "RRTEMPLE", "Trishul", "Shakti", "Banglore", "karnatak", "RR nagar", "Parameshwar swroop");
		God god1=new God(null, null, null, null, null, null, null, null, null, null);
		System.out.println(god);
		System.out.println(god1);
		boolean same6=god.equals(god1);
		System.out.println(same6);
		System.out.println(System.lineSeparator());
		Institution institute=new Institution("Sri guru","school", "kalburgi", "kalburgi", "ka", "raghuram", "Ramprasad", "50", "100000000000", "education");
		Institution institute1=new Institution("appa","school", "kalburgi", "kalburgi", "ka", "Appa ins", "Sharanbasappa", "90", "10000000000000000", "education");
		
		System.out.println(institute);
		System.out.println(institute1);
		boolean same7=institute.equals(institute1);
		System.out.println(same7);
		institute=institute1;
		boolean same8=institute.equals(institute1);
		System.out.println(same8);
		System.out.println(System.lineSeparator());
		Hospitel hospitel=new Hospitel("ESI","Multispeasality", "banglore", "bang", "ka", "Specialcare", "Govern", "50", "100000000000", "200");
		Hospitel hospitel1=new Hospitel("Gims","hospital", "kalburgi", "kalburgi", "ka", "disthead", "dc", "45", "100000000000", "100");
		System.out.println(hospitel);
		System.out.println(hospitel1);
		boolean same9=hospitel.equals(hospitel1);
		System.out.println(same9);
		hospitel=hospitel1;
		boolean same10=hospitel.equals(hospitel1);
		System.out.println(same10);
		System.out.println(System.lineSeparator());
		Makeupkit makeupkit=new Makeupkit("Loreal","Lipstick", "Lipappliens", "350", "best", "banglore", "lulumall", "perfume", 1000, "Shital");
		Makeupkit makeupkit1=new Makeupkit("dove","shampoo", "hairappliens", "500", "best", "banglore", "orieanmall", "eyelinear",2500, "putti");
		System.out.println(makeupkit);
		System.out.println(makeupkit1);
		boolean same11=makeupkit.equals(makeupkit1);
		System.out.println(same11);
		makeupkit=makeupkit1;
		boolean same12=makeupkit.equals(makeupkit1);
		System.out.println(same12);
		System.out.println(System.lineSeparator());
		
		
	}

}

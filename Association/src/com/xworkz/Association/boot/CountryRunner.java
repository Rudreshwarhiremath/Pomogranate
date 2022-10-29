package com.xworkz.Association.boot;

import com.xworkz.Association.Constants.Gender;
import com.xworkz.Association.things.City;
import com.xworkz.Association.things.Country;
import com.xworkz.Association.things.Name;
import com.xworkz.Association.things.President;

public class CountryRunner {
	public static void main(String[] args) {
		Country country=new Country("Bharath");
		President president=new President("Dhrowpadi Muramura");
		president.setGender(Gender.FEMALE);
		president.setTenure(5);
		country.setPresident(president);
		Name name1=new Name("Bangluru","IT hub","Benda Kaluru");
		City city=new City(name1);
		city.setCapital(false);
		city.setArea(745);
		Name name2=new Name("New Dehali","Territory","Dilli");
		City city2=new City(name2);
		city2.setCapital(true);
		city2.setArea(1483);
		Name name3=new Name("Mumbai","Bharath Gate","Bombay");
		City city3=new City(name3);
		city3.setCapital(false);
		city3.setArea(603.4);
		Name name4=new Name("Kolakatta","cultrual capital","Calcutta");
		City city4=new City(name4);
		city4.setCapital(false);
		city4.setArea(206.1);
		City[] array= {city,city2,city3,city4};
		country.setCities(array);
		country.display();
	}

}

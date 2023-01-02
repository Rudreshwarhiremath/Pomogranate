package com.xworkz.javacollection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.javacollection.dto.CompanyCEOdto;
import com.xworkz.javacollection.dto.Daughterdto;

public class CompanyCeoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughterdto daughter1=new Daughterdto("Poorvika", 8888888888L, 21, true, true);
		Daughterdto daughter2=new Daughterdto("Devika", 9999999999L, 22, false, true);
		Daughterdto daughter3=new Daughterdto("Pranati", 7777777777L, 18, true, true);
		Daughterdto daughter4=new Daughterdto("Samapathi", 6666666666L, 19, true, true);
		Daughterdto daughter5=new Daughterdto("Preeti", 8888888888L, 20, false, true);
		CompanyCEOdto company1=new CompanyCEOdto("Prashant","TCS",35,"Indian","BE", true, daughter1);
		CompanyCEOdto company2=new CompanyCEOdto("Jagadeesh","Cognijent",30,"Indian","BE", true, daughter2);
		CompanyCEOdto company3=new CompanyCEOdto("Jaideep","Wipro",25,"Indian","BE", true, daughter3);
		CompanyCEOdto company4=new CompanyCEOdto("Satish","Infosys",33,"Indian","BE", true, daughter4);
		CompanyCEOdto company5=new CompanyCEOdto("Siddu","Tech Mahindra",31,"Indian","BE", true, daughter5);
		
		Collection<CompanyCEOdto> ref=new ArrayList<CompanyCEOdto>();
		ref.add(company5);
		ref.add(company4);
		ref.add(company3);
		ref.add(company2);
		ref.add(company1);
		
		ref.stream().map(dto->dto.getDaughterDTO()).collect(Collectors.toList()).forEach(vet->System.out.println(vet));
		System.out.println(System.lineSeparator());

		ref.stream().map(dto->dto.getDaughterDTO().getName()).collect(Collectors.toSet()).forEach(ele->System.err.println(ele));
		System.out.println(System.lineSeparator());
		ref.stream().filter(values->values.getAge()>30).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		
		ref.stream().forEach(age->System.err.println("Father age:"+age.getAge()+"  Daughter age:"+age.getDaughterDTO().getAge()));
	}

}

package ProgramingApti;

public class Practise111 {
	public  String name;
	public  String lname;
	public int age;
	public double sallery;

	public void show(String name, String lname, int age, double sallery) {
		this.name=name;
		this.lname=lname;
		this.age = age;
		this.sallery = sallery;
		
	}

	public void show(double sallery, int age, String lname, String name) {
		this.name=name;
		this.lname=lname;
		this.age = age;
		this.sallery = sallery;

	}
	public static void main(String[] args) {
		Practise111 set=new Practise111();
		set.show(40000,30,"Sham","Sundar");
		System.out.println(set.name);
		System.out.println(set.lname);
		System.out.println(set.age);
		System.out.println(set.sallery);
		set.show("Neeraj","Bhosnle",25,50000);
		System.out.println(set.name);
		System.out.println(set.lname);
		System.out.println(set.age);
		System.out.println(set.sallery);
	
		
	}

}

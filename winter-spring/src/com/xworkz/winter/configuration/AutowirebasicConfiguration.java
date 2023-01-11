package com.xworkz.winter.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.winter.autowirebasic")
public class AutowirebasicConfiguration {
	public AutowirebasicConfiguration() {
		System.out.println("creted default constructer AutowirebasicConfiguration");
	}

	@Bean
	public int id() {
		return 2365;
	}

	@Bean
	public String name() {
		return "vinay Hard ware shop";
	}

	@Bean
	public String gstNo() {
		return "256G489H789K";
	}

	@Bean
	public String ownerName() {
		return "Jaideep Strong Man";
	}

	@Bean
	public String adress() {
		return "Near Bhasyam circle 121 complex underground";
	}

	@Bean
	public String nameofSowftware() {
		return "instagram";
	}

	@Bean
	public int version() {
		return 301;// 265.0.0.19.301.
	}

	@Bean
	public String developer() {
		return "facebook";
	}

	@Bean
	public LocalDate date() {
		return LocalDate.now();
	}

	@Bean
	public boolean free() {
		return true;
	}

	@Bean
	public String nameOfSoftwareEngineer() {
		return "Shruthi ";
	}

	@Bean
	public long salary() {
		return 700000L;
	}

	@Bean
	public String companyName() {
		return "Esko graphics";
	}

	@Bean
	public int expirence() {
		return 4;
	}

	@Bean
	public String nameOfPencil() {
		return "Apsara";
	}

	@Bean
	public String type() {
		return "Super Dark";
	}

	@Bean
	public double price() {
		return 8.25;
	}

	@Bean
	public String color() {
		return "greay";
	}

	@Bean
	public boolean sharp() {
		return true;
	}

	@Bean
	public boolean stolen() {
		return false;
	}

	@Bean
	public String nameOfRubbber() {
		return "Apsara Rubber";
	}

	@Bean
	public String typeOfRubber() {
		return "Dust less";
	}

	@Bean
	public double priceOfRubber() {
		return 5.00;
	}

	@Bean
	public String colorOfRubber() {
		return "White and packwith green";
	}

	@Bean
	public String shape() {
		return "Rectangle";
	}

	@Bean
	public boolean isStolenRubber() {
		return true;
	}

	@Bean
	public String size() {
		return "15cmcube";
	}

	@Bean
	public String nameOfTractor() {
		return "mini Shakti of kubuta";
	}

	@Bean
	public String brand() {
		return "KUBOTA";
	}

	@Bean
	public String model() {
		return "B2428";
	}

	@Bean
	public long priceOfTractor() {
		return 750000L;
	}

	@Bean
	public boolean fourWheelDrive() {
		return true;
	}

	@Bean
	public int hp() {
		return 24;
	}

	@Bean
	public int frontGear() {
		return 9;
	}

	@Bean
	public int reverseGear() {
		return 3;
	}

	@Bean
	public int cylinder() {
		return 2;
	}

}

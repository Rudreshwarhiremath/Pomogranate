package com.xworkz.rudreshwar.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.rudreshwar.dto.BeverageDTO;
import com.xworkz.rudreshwar.dto.ChatDTO;
import com.xworkz.rudreshwar.dto.EDucationdto;
import com.xworkz.rudreshwar.dto.Famelydto;
import com.xworkz.rudreshwar.dto.MobileDTO;

@Component
@RequestMapping("/")
public class RudraController {
	public RudraController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@GetMapping("/takeEmail")
	public String getEmail(Model model) {
		System.out.println("Running in email");
		model.addAttribute("email", "Rudreshwarhiremath@gmail.com");
		return "index";
	}

	@GetMapping("/takeMobile")
	public String getMobile(Model model) {
		System.out.println("Running in Mobile");
		model.addAttribute("mobile", "8088928928");
		return "index";
	}

	@GetMapping("/takeAdhar")
	public String getAdhar(Model model) {
		System.out.println("Running in Adhar");
		model.addAttribute("adhar", "622873500368");
		return "index";
	}

	@GetMapping("/takeAge")
	public String getAge(Model model) {
		System.out.println("Running in Age");
		model.addAttribute("age", "23");
		return "index";
	}

	@GetMapping("/takeDob")
	public String getDOB(Model model) {
		System.out.println("Running in dateofbirth");
		model.addAttribute("birth", LocalDate.of(1999,11,26).atTime(9,50,59));
		return "index";
	}

	@GetMapping("/takeDS")
	public String getDesiredSallery(Model model) {
		System.out.println("Running in DesiredSallery");
		model.addAttribute("sallery", "5.5LPA");
		return "index";
	}

	@GetMapping("/takeBestFriendsList")
	public String getBFL(Model model) {
		System.out.println("Running in BestFriendsList");
		List<String> ref = new ArrayList<String>();
		ref.add("Prashant");
		ref.add("Jaggu");
		ref.add("Jaiiiii");
		ref.add("Akhilesh");
		ref.add("God");
		model.addAttribute("bfl", ref);
		return "index";
	}

	@GetMapping("/takeMVP")
	public String getMVP(Model model) {
		System.out.println("Running in mostvisited place");
		List<String> ref = new ArrayList<String>();
		ref.add("Temple");
		ref.add("BusStand");
		ref.add("Hotel");
		ref.add("Cloth Shop");
		ref.add("Saloon");
		model.addAttribute("mvp", ref);
		return "index";
	}

	@GetMapping("/takeSkillSet")
	public String getSkillSet(Model model) {
		System.out.println("Running in Skill SET");
		List<String> ref = new ArrayList<String>();
		ref.add("Java");
		ref.add("HTML");
		ref.add("SQL");
		ref.add("CSS ");
		ref.add("SPRING");
		model.addAttribute("skills", ref);
		return "index";
	}

	@GetMapping("/takeEdto")
	public String getEducation(Model model) {
		System.out.println("Running in EDucationdto");
		EDucationdto dto = new EDucationdto();
		dto.setSchoolName("Shree Shivayogi SiddveerSwami Gurukul School");
		dto.setDistrict("Bidar");
		dto.setHmName("OM");
		dto.setNoOfBusses("5");
		dto.setNoOfClasses("20");
		dto.setNoOfStudents("500");
		dto.setNoOfTeachers("25");
		dto.setPlace("Tadola");
		dto.setState("Karnataka");
		dto.setTaluk("Basavakalyan");
		model.addAttribute("edto", dto);
		return "index";
	}

	@GetMapping("/takeFamily")
	public String getFamily(Model model) {
		System.out.println("Running in familydto");
		Famelydto dto = new Famelydto();
		dto.setFamilyLives("Tadola");
		dto.setFamilyName("Hiremath");
		dto.setFatherName("Gurushant");
		dto.setIndian(true);
		dto.setMotherName("Bhagyashree");
		dto.setName("Rudreshwar");
		dto.setState("Karnataka");
		dto.setTotalLand(40.25D);
		dto.setTotalMembers(7);
		dto.setVegeterin(true);

		model.addAttribute("fdto", dto);
		return "index";
	}

	@GetMapping("/takeMobileInfo")
	public String getMobileInfo(Model model) {
		System.out.println("Running in mobiledto");
		MobileDTO dto = new MobileDTO();
		dto.setCamera(64D);
		dto.setModel("Redme Note 7S");
		dto.setNumber(8088928928L);
		dto.setPrice(13000D);
		dto.setStorage(128D);
		model.addAttribute("mdto", dto);
		return "index";
	}
	@GetMapping("/takeBeverage")
	public String getBeverage(Model model) {
		System.out.println("running in beverage ");
		BeverageDTO dto=new BeverageDTO();
		dto.setJuise1("Orange");
		dto.setJuise2("Musk milion");
		dto.setJuise3("Water milion");
		dto.setJuise4("Sapota");
		dto.setJuise5("Pomogranate");
		dto.setJuise6("Banana");
		dto.setJuise7("Papya");
		dto.setJuise8("Grapes");
		model.addAttribute("bdto",dto);
		return "index";
	}
	@GetMapping("/takeChata")
	public String getChat(Model model) {
		System.out.println("running in chat");
		ChatDTO dto=new ChatDTO();
		dto.setChat1("Panipuri");
		dto.setChat2("Masalapuri");
		dto.setChat3("Dhai puri");
		dto.setChat4("Samosa");
		dto.setChat5("Bhela puri");
		dto.setChat6("Kachori");
		dto.setChat7("Bajji");
		dto.setChat8("Pava bhaji");
		dto.setChat9("Masala papada");
		dto.setChat10("Katlis");
		dto.setChat11("What you want order");
		model.addAttribute("cdto",dto);
		return "index";
	}

}

package com.xworkz.lake.boot;

import com.xworkz.lake.dto.BakeryDTO;
import com.xworkz.lake.exception.inValideData;
import com.xworkz.lake.repositery.BakeryRepositery;
import com.xworkz.lake.repositery.BakeryRepositeryImpl;
import com.xworkz.lake.service.BakeryService;
import com.xworkz.lake.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {
		BakeryDTO bakeryDTO=new BakeryDTO();
		bakeryDTO.setName("Ogivarrier");
		bakeryDTO.setOwner("Variyer sons");
		bakeryDTO.setContact(2121212121212L);
		bakeryDTO.setLocation("Industrial Town");
		bakeryDTO.setFamousFor("Cakes");
		BakeryDTO bakeryDTO1=new BakeryDTO();
		BakeryRepositery bakeryRepositery=new BakeryRepositeryImpl();
		BakeryService bakeryService=new BakeryServiceImpl(bakeryRepositery);
		try {
			boolean sucess=bakeryService.savedValideData(bakeryDTO);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BakeryService bakeryService1=new BakeryServiceImpl(bakeryRepositery);
		BakeryService bakeryService2=new BakeryServiceImpl(bakeryRepositery);
		BakeryService bakeryService3=new BakeryServiceImpl(bakeryRepositery);
		BakeryService bakeryService4=new BakeryServiceImpl(bakeryRepositery);
		try {
			boolean sucess=bakeryService.savedValideData(bakeryDTO1);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boolean sucess=bakeryService.savedValideData(bakeryDTO);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boolean sucess=bakeryService.savedValideData(bakeryDTO);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boolean sucess=bakeryService.savedValideData(bakeryDTO);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			boolean sucess=bakeryService1.savedValideData(bakeryDTO);
		} catch (inValideData e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

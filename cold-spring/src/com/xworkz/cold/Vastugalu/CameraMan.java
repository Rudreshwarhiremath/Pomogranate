package com.xworkz.cold.Vastugalu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;

	public CameraMan() {
		System.out.println("created camera man");
	}

	public Camera getCamera() {
		return camera;
	}

}

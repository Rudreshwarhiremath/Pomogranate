package com.xworkz.encapsulation.things;

public class Shirt {

	public String name = "bhintop";
	public FullShirt fullShirt = new FullShirt("roadpro", "string", true, "country", 'I', "jagadeesh",
			"roadster company", 6654123L);

	public void wearIt() {
		System.out.println(this.name);
		if (this.fullShirt != null) {

			// System.out.println(this.fullShirt);
			System.out.println(fullShirt.name);
			System.out.println(fullShirt.type);
			System.out.println(fullShirt.quality);
			System.out.println(fullShirt.country);
			System.out.println(fullShirt.code);
			System.out.println(fullShirt.ownerName);
			System.out.println(fullShirt.producedBy);
			System.out.println(fullShirt.totalShirts);

			System.out.println(fullShirt.getBrand());
			fullShirt.setBrand("levise"); // modified
			System.out.println("after modifying " + fullShirt.getBrand());

			System.out.println(fullShirt.getPrice());
			fullShirt.setPrice(980);
			System.out.println("after modifying " + fullShirt.getPrice());

			System.out.println(fullShirt.getQuantity());
			fullShirt.setQuantity(6);
			System.out.println("after modifying " + fullShirt.getQuantity());
		} else {
			System.out.println("fullShirt is null");
		}

	}

}

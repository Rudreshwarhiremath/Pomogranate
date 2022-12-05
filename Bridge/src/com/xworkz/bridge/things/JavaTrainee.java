package com.xworkz.bridge.things;

public abstract class JavaTrainee  extends Person implements XworkzRule{
	abstract boolean training();
	abstract boolean executeProgram();

	@Override
	public boolean uploadedTask() {
		System.out.println("Uploaded task in JavaTrainee");
		return true;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("completedProgram in JavaTrainee");
		return true;
	}

}

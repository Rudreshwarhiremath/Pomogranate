package ProgramingApti;

import java.util.ArrayList;
import java.util.List;

public class DataArgescs {
	int id;
	String name;
	double marks;

	public DataArgescs(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		DataArgescs std1 = new DataArgescs(1, "Sam", 453);
		DataArgescs std2 = new DataArgescs(2, "Tom", 768);
		DataArgescs std3 = new DataArgescs(3, "Roy", 543);
		DataArgescs std4 = new DataArgescs(4, "suh", 566);

		List<DataArgescs> std = new ArrayList<>();
		std.add(std1);
		std.add(std2);
		std.add(std3);
		std.add(std4);

		for (DataArgescs data : std) {
			System.out.println(data.getName());

		}

	}

}

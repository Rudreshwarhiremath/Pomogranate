package ProgramingApti;

public class GetUniqcharectrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "rudreshwarhiremath";
		int i, j, count;
		char[] sets = name.toCharArray();
		for (i = 0; i < name.length(); i++) {
			count = 1;
			for (j = i + 1; j < name.length(); j++) {
				if (sets[i] == sets[j]) {
					count++;
					sets[j] = 0;
				}

			}
			if (count==1 ) {
				if (sets[i] != ' ' && sets[i] != 0) {
					System.out.println(sets[i]);
				}
			}
		}

	}

}

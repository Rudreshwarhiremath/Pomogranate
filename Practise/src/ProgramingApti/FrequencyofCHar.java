package ProgramingApti;

public class FrequencyofCHar {

	public static void main(String[] args) {

		String name = "welcome to new world of java aaawwww";

		name = name.toLowerCase();
		int[] freq = new int[name.length()];
		int i, j;
		char str[] = name.toCharArray();
		for (i = 0; i < name.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < name.length(); j++) {
				if (str[i] == str[j]) {
					freq[i]++;
					str[j] = 0;
				}
			}
		}
		System.err.println("Frequency lengt:-"+name.length());
		for (i = 0; i < freq.length; i++) {
			if ( str[i] != 0) {
				System.out.println(str[i] + "-" + freq[i]);
			}
		}
	}
}

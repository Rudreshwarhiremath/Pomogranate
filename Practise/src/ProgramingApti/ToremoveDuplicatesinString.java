package ProgramingApti;

public class ToremoveDuplicatesinString {

	public static void main(String[] args) {

		String name = "Rudreshwar someshwari";
		int i, j;
		char[] str = name.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (i = 0; i < str.length; i++) {
			boolean flag = true;
			for (j = 0; j < i; j++) {
				if (str[j] == str[i]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				sb.append(str[i]);
			}
		}
		System.out.println(sb.toString());

	}
}

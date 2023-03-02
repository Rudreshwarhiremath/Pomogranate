package ProgramingApti;

public class CouponCode {

	public static void main(String[] args) {
		String coupon = "AB202601A";
		char[] code = coupon.toCharArray();

		boolean a = false;
		boolean b = false;
		// boolean c = false;
		for (int i = 0; i < code.length; i++) {
			if (code[0] >= 'A' && code[0] <= 'Z' || code[1] >= 'A' && code[1] <= 'Z'
					|| code[8] >= 'A' && code[8] <= 'Z') {
				a = true;
			}
			if (code[2] == '2' && code[3] == '0' && code[4] == '2' && code[5] >= '0' && code[5] <= '3') {
				b = true;
			}

		}
		if (a == true && b == true) {
			System.out.println("valide coupon");
		} else {
			System.err.println("in vallide coupon");
		}

	}

}

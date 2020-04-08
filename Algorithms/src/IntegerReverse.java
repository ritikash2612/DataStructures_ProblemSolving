
public class IntegerReverse {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

	}
	public static int reverse(int x) {
		String res = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
				: new StringBuilder(String.valueOf(x)).reverse().toString();

//		System.out.println(String.valueOf(x));
		return Integer.valueOf(res);
	}

	public static boolean isIntegerPalindrome(int n) {
		boolean isPalindrome = false;
		String val = n < 0 ? new StringBuilder(String.valueOf(n)).append("-").reverse().toString()
				: new StringBuilder(String.valueOf(n)).reverse().toString();

		if (String.valueOf(n).equalsIgnoreCase(val)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

	public static void printPattern() {
		int i, j;
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

	}
}

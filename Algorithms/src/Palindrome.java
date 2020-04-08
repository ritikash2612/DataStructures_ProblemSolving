import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	
	public String longestPalindrome(String s) {
		String longestPal = "";
		String reverse = findPalindrome(reverse(s));
		longestPal = findPalindrome(s);
		if (reverse.equals(longestPal)) {
			return reverse;
		}
		return longestPal;
	}

	public String findPalindrome(String s) {
		String result = "";
		String palLeft = "";
		String palRight = "";
		if (s.length() <= 2) {
			char c = s.charAt(0);
			result = "" + c;
		} else if (s.length() % 2 == 1) {

			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
					palLeft = palLeft + s.charAt(i);
					palRight = palRight + s.charAt(s.length() / 2) + s.charAt(s.length() - i - 1);
					result = palLeft + palRight;
				}
			}

		} else {
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
					palLeft = palLeft + s.charAt(i);
					palRight = palRight + s.charAt(s.length() - i - 1);
					result = palLeft + palRight;
				}

			}

		}
		return result;
	}

	public String reverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = in.readLine()) != null) {
			String s = "";

//          String ret = longestPalindrome(s);

			// String out = (ret);

//          System.out.print(out);
		}
	}
}

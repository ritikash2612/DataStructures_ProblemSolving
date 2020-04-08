import java.util.SortedSet;

import javax.naming.ldap.SortControl;

public class StringProblems {

	public static void main(String[] args) {

		String s = "tesyututut";
//		System.out.println(testUniques(s));
		
		boolean[] a = new boolean [2];
	
//		if(a[1]) {
//			System.out.println(true+ "there");
//		}
//		else {
//			System.out.println("no");
//		}
		
//		System.out.println(sortString("ritika"));
		
//		boolean isPermutation = arePermutations("testt", "totet");
//		System.out.println(isPermutation);
		String text ="Mr John Smith    ";
//		char [] str = text.toCharArray();
		
//		replaceSpaces(str, 13);
		// permute 2
//		System.out.println(permute("test", "burt"));
		
		
		//isPalindrome
		String pal = "abcddcba   ";
	
		isPalindrome(pal.trim());
	}
	
	
	public static void isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		
		String a = s != null? sb.reverse().toString(): "";
		if(s.equals(a)) {
			System.out.println("true");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

	
	public static void replaceSpaces(char [] str, int trueLen) {
		int totalSpaces = 0;
		for(int i = 0; i< str.length; i++) {
			if(str[i] == ' ') {
				totalSpaces++;
			}
		}
		
		System.out.println(totalSpaces + "  ---  "+str.length);
		
		//add three spaces for the new characters
		int index = trueLen + totalSpaces * 2;

		for (int i = 0; i< str.length; i++) {
			System.out.println("test vlaues =>"+str[i]);
		}
		
		System.out.println(str);
		char newArray[] = new char[index];
		for(int i = trueLen - 1; i>= 0; i--) {
			if(str[i] == ' ') {
				newArray[index - 1] = '0';
				newArray[index - 2] = '2';
				newArray[index - 3] = '%';
				index -=3;
			}
			else {
				newArray[index -1] = str[i];
				index--;
			}
		}
		System.out.println(newArray);
		
	}
	
	
	public static String sortString(String s) {
		char [] content = s.toCharArray();
		java.util.Arrays.sort(content);
		System.out.println(content);
		return new String(content);
	
		
	}
	
	
	//permutations
	public static boolean arePermutations(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		else {
			String sortedA = sortString(a);
			String sortedB = sortString(b);
			if(sortString(a).equals(sortString(b))) {
				System.out.println(sortString(a)+ " "+ sortString(b));
				return true;
			}
		}
		return false;
	}
	
	
	//permutations2
	static boolean permute(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		int letters [] = new int[128]; // ACSII
		
		for(int i = 0; i < a.length(); i++) {
			letters[a.charAt(i)]++;
			System.out.println("test   ===>" + letters[i] + " --"+ i);
		}
		for(int i = 0; i < b.length(); i++) {
			letters[b.charAt(i)]--;
			System.out.println("test result -->"+letters[b.charAt(i)]--);
			System.out.println("test2   ===>" + letters[i]+ "-- "+ i);
			if(letters[b.charAt(i)]<0) {
				return false;
			}
		}
//		for (int c : letters)
//		System.out.println(c);
		return true;
	}
	
	
	// uniques
	public static boolean testUniques(String s) {
		boolean char_set[] = new boolean[128];

		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (char_set[val]) {
				return false;
			} else {
				char_set[val] = true;

			}
		}
		return true;

	}
}

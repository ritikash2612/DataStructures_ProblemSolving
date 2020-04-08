
public class TestAnagrams {

	public static int diffAnagrams(String a, String b) {

		int minDeletions = 0;
		int aFreq[] = new int[26];
		int bFreq[] = new int[26];
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			int chartoInt = (int) c;
			int position = chartoInt - (int) 'a';
			aFreq[position]++;
		}

		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			int chartoInt = (int) c;
			int position = chartoInt - (int) 'a';
			bFreq[position]++;

		}

		for (int i = 0; i < 26; i++) {
			int diff = Math.abs(aFreq[i] - bFreq[i]);
			minDeletions += diff;
		}
		return minDeletions;
	}

	public static void main(String[] args) {
		String a = "cde";
		String b = "abc";
		System.out.println(diffAnagrams(a,b));

	}

}

import java.util.Arrays;
import java.util.Comparator;

public class AnagramStringsSorting implements Comparator<String> {

	public int compare(String s1, String s2) {
		System.out.println("one "+ s1 + "  two " + s2);
		return sortChars(s1).compareTo(sortChars(s2));
	}
	
	
	public String sortChars(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	
	public static void main(String[] args) {
		String [] array = {
			"ab", "ca","ba"
		};
		Arrays.sort(array, new AnagramStringsSorting());
		for (String i : array){
			System.out.println(i);
		}
	}

}

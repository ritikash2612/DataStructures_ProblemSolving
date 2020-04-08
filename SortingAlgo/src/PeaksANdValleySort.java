import java.util.Arrays;

public class PeaksANdValleySort {

	public static void main(String[] args) {

		int a[] = {9,1,0,4,8,7};
		sortValleyPeak(a);
		for(int i : a) {
			System.out.println(i);
		}
		
	}

	static void sortValleyPeak(int []a) {
		Arrays.sort(a);
		for(int i = 1; i< a.length; i+=2) {
			swap(a, i-1, i);
		}
	}
	
	static void swap(int []a, int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
}

import java.util.Arrays;

public class MinAbsDifferenceArr {

	public static void main(String[] args) {
		int arr[] = { 1,3,6,10,15 };
		System.out.println(minAbsDifference(arr));
	}

	public static int minAbsDifference(int arr[]) {
		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 1; i < arr.length - 1; i++) {
			int currDiff = Math.abs(arr[i] - arr[i - 1]);
			min = Math.min(min, currDiff);

		}
		return min;
	}
}

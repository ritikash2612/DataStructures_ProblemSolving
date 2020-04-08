
public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {3,2,1,4,5};
		int ar[] = rotateArray(arr, 2); //14532
		for (int i=0; i< ar.length;i++) {
			System.out.println(ar[i] + " ");

		}
			
	}

	public static int[] rotateArray(int arr[], int k) {
		int len = arr.length;
		int moveIndex = k;
		int i =0;
		int newArr[] = new int[len];
		while(moveIndex < len) {
			
			newArr[i] = arr[moveIndex];
			i++;
			moveIndex++;
		}
		moveIndex = 0;
		while(moveIndex < k) {
			newArr[i] = arr[moveIndex];
			i++;
			moveIndex++;
		}
		return newArr;
	}
}


public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int a[] = new int[6];
		a[0] = 3;
		a[1] = 4;
		a[2] = 7;
		for(int i = 0; i< a.length; i++) {
			System.out.println("\n" +a[i]);
		}
		System.out.println("after merge: ");

		int b[] = {7,8,9};
		merge(a, b);
		for(int i = 0; i< a.length; i++) {
			System.out.println("\n" +a[i]);
		}
	}

	
//	0,1,2  0,1
	// 0 1 2 3
	
	
	//a -- 3  4  7
	//b -- 5  8  9
	
	public static void merge(int[] a, int[] b) {
		int lastA = 2;
		int indexA = a.length-1;
		int lastB = b.length -1;
		int lastIndex = lastA + lastB+1;
		
		while(lastB >= 0) {
			if(indexA>0 && a[lastA] > b[lastB]) {
				a[lastIndex] = a[lastA];
				lastA--;
			}
			else {
				
				a[lastIndex] = b[lastB];
				lastB--;
			}
			lastIndex--;
		}
	}
}

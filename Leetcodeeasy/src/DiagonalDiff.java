
public class DiagonalDiff {

	public static void main(String[] args) {
		int [][] a = new int[3][3];
		a[0][0] = 3;
		a[0][1] = 11;
		a[0][2] = 23;
		a[1][0] = 3;
		a[1][1] = 31;
		a[1][2] = 5;
		a[2][0] = 3;
		a[2][1] = 43;
		a[2][2] = 89;

		System.out.println(diagonalDifference(a));
	}

	static public int diagonalDifference(int arr[][]) {
		int leftToRight = 0;
		int rightToLeft = 0;
		int rows = arr.length;
		int cols = arr[0].length;
		int i =0, j=0, k = 0;
		int l = arr.length-1;
		while(i< rows && j < cols && k < rows && l>=0) {
			leftToRight += arr[i][j];
			rightToLeft += arr[k][l];
			i++;
			j++;
			k++;
			l--;
		}
		
		return Math.abs(leftToRight-rightToLeft);
	}
}

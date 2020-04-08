
public class MergeSort {

	int array[];
	int temp[];
	int length;

	public void mergeSort(int array[], int low, int high) {
		if (low < high) {
			int mid = low + (high - low) / 2;
			System.out.println("mid ="+mid);
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);

		}
	}

	public void merge(int array[], int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			temp[i] = array[i];
		}

		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j]) {
				array[k] = temp[i];
				i++;
			} else {
				array[k] = temp[j];
				j++;
			}
			System.out.println(array[k]);
			k++;
		}
		

		while(i <= mid) {
			array[k] = temp[i];
			k++;
			i++;
		}
	}

	public void sort(int input[]) {
		this.array = input;
		this.length = input.length;
		this.temp = new int[length];
		mergeSort(array, 0, length-1);
		
	}
	public static void main(String[] args) {
		int input[] = {2,4,3,1};
		MergeSort s = new MergeSort();
		s.sort(input);
		for(int i = 0; i<= input.length-1; i++) {
			System.out.println("values" + input[i]);
		}
	}

}

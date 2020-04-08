import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static int removeDuplicates(int[] nums) {
		Set<Integer> list = new HashSet<Integer>();
		int i = 0;
		if (nums.length == 0 || nums == null) {
			return 0;
		} else {
			while (i < nums.length) {
				if (list.contains(nums[i])) {
					
				} else {
					list.add(nums[i]);
				}
				i++;
			}
		}
		return list.size();
	}
	
	public static int removeDup(int[] nums) {
		int i = 0;
		for(int j = 1; j< nums.length; j++) {
			if(nums[i]!= nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,1,2};
		int arr2[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
		System.out.println(removeDup(arr2));
	}

}

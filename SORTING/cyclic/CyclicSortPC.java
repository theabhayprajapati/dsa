package SORTING.cyclic;

import java.util.Arrays;

class CylicSortPC {

	public static void main(String[] args) {

		int nums[] = { 5, 4, 3, 2, 1 };
		cyclicSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void cyclicSort(int nums[]) {

		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			} else {

				i++;
			}

		}
	}

}

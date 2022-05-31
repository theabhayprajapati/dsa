package SORTING.MergeSort;

class MergeSortPC {

	public static void main(String[] args) {

		int nums[] = { 5, 4, 3, 2, 1 };
		mergeSort(nums, 0, nums.length - 1);
		// print with loop
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	static void mergeSort(int nums[], int start, int end) {
		if (start < end) {
			int mid = (end + start) / 2;
			mergeSort(nums, start, mid);
			mergeSort(nums, mid + 1, end);
			mergeThem(nums, start, mid, end);
		}

	}

	// this is the merge part;
	static void mergeThem(int temp[], int start, int mid, int high) {
		int i = start;
		int j = mid + 1;
		int k = 0;
		int[] temp2 = new int[high - start + 1];
		while (i <= mid && j <= high) {
			if (temp[i] < temp[j]) {
				temp2[k++] = temp[i++];
			} else {
				temp2[k++] = temp[j++];
			}
		}
		while (i <= mid) {
			temp2[k++] = temp[i++];
		}
		while (j <= high) {
			temp2[k++] = temp[j++];
		}
		for (int l = 0; l < temp2.length; l++) {
			temp[start + l] = temp2[l];
		}
	}

}

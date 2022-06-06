package Binary;

class PeakPC {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 5, 6, 8, 3, 1 };
        int ans = findPeak(nums);
        System.out.println(ans);
        int first = binarySearch(nums, 0, ans);
    }

    // senpai, nani, masaka;
    static int findPeak(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] > nums[middle + 1]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }

    static int binarySearch(int nums[], int start, int end) {
        int middle = start + (end - start) / 2;
        if (nums[middle] > nums[middle + 1]) {
            end = middle;
        } else {
            start = middle + 1;
        }
        return start;
    }
}
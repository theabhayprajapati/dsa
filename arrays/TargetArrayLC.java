package arrays;

public class TargetArrayLC {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        createTargetArray(nums, index);
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int nind = index[i];
            int nnumval = nums[i];
            int prevtargetvalue = targetArray[nind];
            targetArray[nind] = nnumval;
            for (int j = nind + 1; j < targetArray.length; j++) {
                int prevjval = targetArray[j];
                targetArray[j] = prevtargetvalue;
                prevtargetvalue = prevjval;
            }
        }
        return targetArray;
    }
}
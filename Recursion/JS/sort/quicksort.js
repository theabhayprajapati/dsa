var nums = [5, 4, 3, 3, 2, 1];
// [1, 4, 3, 2, 5]r
// [1, 2, 3, 4, 5]

var quickSort = (nums, low, hi) => {
    if (low >= hi) {
        return;
    }
    var start = low;
    var end = hi;
    var mid = start + Math.floor((end - start) / 2);
    var pvt = nums[mid];
    while (start <= end) {
        while (nums[start] < pvt) {
            start++;
        }
        while (nums[end] > pvt) {
            end--;
        }
        if (start <= end) {
            var temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    quickSort(nums, low, end);
    quickSort(nums, start, hi);
}
quickSort(nums, 0, nums.length - 1);
console.log(nums);
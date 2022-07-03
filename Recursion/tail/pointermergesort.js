// make a merge sort function that takes in a pointer to an array
var mergeSort = (arr, start, end) => {
    if (start === end) {
        return;
    }
    var mid = Math.floor((start + end) / 2);
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, start, mid, end);
}
var merge = (arr, start, mid, end) => {
    var left = start;
    var right = mid + 1;
    var sorted = [];
    while (left <= mid && right <= end) {
        if (arr[left] < arr[right]) {
            sorted.push(arr[left]);
            left++;
        } else {
            sorted.push(arr[right]);
            right++;
        }
    }
    while (left <= mid) {
        sorted.push(arr[left]);
        left++;
    }
    while (right <= end) {
        sorted.push(arr[right]);
        right++;
    }
    for (var i = start; i <= end; i++) {
        arr[i] = sorted[i - start];
    }
}
var nums = [5, 4, 3, 2, 1];
// make a loop and push 1000 random numbers into the array
for (var i = 0; i < 1000; i++) {
    nums.push(Math.floor(Math.random() * 1000));
}
mergeSort(nums, 0, nums.length - 1);
console.log(nums);
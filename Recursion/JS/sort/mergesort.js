var nums = [5, 4, 3, 2, 1];
var mergeSort = (nums) => {
    if (nums.length <= 1) {
        return nums;
    }
    var mid = Math.floor(nums.length / 2);
    var left = mergeSort(nums.slice(0, mid));
    var right = mergeSort(nums.slice(mid));
    console.log(left, right);
    return merge(left, right);
}
var merge = (left, right) => {
    var result = [];
    while (left.length && right.length) {
        if (left[0] < right[0]) {
            result.push(left.shift());
        } else {
            result.push(right.shift());
        }
    }
    while (left.length) {
        result.push(left.shift());
    }
    while (right.length) {
        result.push(right.shift());
    }
    console.log(result);
    return result;
}
console.log(mergeSort(nums));
var obj = {
    name: [1, 12, 12, 12, 12],
    age: [1, 2, 3, 4, 5]
}
console.log(obj);
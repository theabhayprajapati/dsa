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
    var i = 0;
    var j = 0;
    while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
            result.push(left[i]);
            i++;
        } else {
            result.push(right[j]);
            j++;
        }
    }
    while (i < left.length) {
        result.push(left[i]);
        i++;
    }
    while (j < right.length) {
        result.push(right[j]);
        j++;
    }
    return result;
}
console.log(mergeSort(nums));
var obj = {
    name: [1, 12, 12, 12, 12],
    age: [1, 2, 3, 4, 5]
}
console.log(obj);



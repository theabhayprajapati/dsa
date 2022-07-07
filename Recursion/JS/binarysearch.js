var binarySearch = (arr, start, end, target) => {
    var mid = Math.floor((start + end) / 2);
    if (arr[mid] === target) {
        return mid;
    }
    if (start >= end) {
        return -1;
    }
    if (arr[mid] > target) {
        return binarySearch(arr, start, mid - 1, target);
    }
    return binarySearch(arr, mid + 1, end, target);
}
var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(binarySearch(arr, 0, arr.length - 1, 10));

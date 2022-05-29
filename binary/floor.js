let arr = [5,7,7,8,8,10]
let FirstansLast = (arr, target) => {
    let ans = [-1, -1]
    ans[0] = binarySearch(arr, target, true);
    ans[1] = binarySearch(arr, target, false)
    return ans
}

let binarySearch = (arr, target, startornot) => {
    let start = 0;
    let ans = -1;
    let end = arr.length - 1;
    let mid = Math.floor((start + end) / 2);
    while (start <= end) {
        if (target < arr[mid]) {
            end = mid - 1;
        }
        else  {
            start = mid + 1;
        }
        mid = Math.floor((start + end) / 2);
    }
    return ans
}



console.log(FirstansLast(arr, 8))

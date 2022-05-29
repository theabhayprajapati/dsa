arr = [1, 2, 4, 5, 6, 7, 8, 12, 34, 55]
target = 12

// meaining of ceil is the smallest number that is greater than or equal to the target;
// meaning of floor is the largest number that is less than or equal to the target;
let findCeiling = (arr, target) => {
    let start = 0;
    let end = arr.length - 1
    let middle = Math.floor((start + end) / 2)
    while (arr[middle] != target && start < end) {
        if (target < arr[middle]) {
            end = middle - 1
        } else {
            start = middle + 1
        }
        middle = Math.floor((start + end) / 2)
    }
    return arr[middle] === target ? `We found ceiling for ${target} at ${middle}` : `${arr[start]} was found at ${target}'s cleing`
}
console.log(findCeiling(arr, 13))
let array = [0, 2, 4, 5, 7, 8, 10, 12, 23]

let infiniteSearch = (arr, target) => {
    let start = 0
    let end = 1
    while (target > arr[end]) {
        start = end
        end = end + ((end - start + 1) * 2)
        console.log(end)
    }
    console.log(binarySearch(arr, target, start, end))
}

let binarySearch = (nums, target, start, end) => {
    let middle = Math.floor((start + end) / 2)
    console.log(middle)
    while (target != nums[middle] && start <= end) {
        if (target < nums[middle]) {
            console.log(`target value is less: ${target} < ${nums[middle]}`);
            end = middle - 1
            console.log(`end: ${end} = ${middle} - 1`);
        }
        else {
            console.log(`target value is more: ${target} > ${nums[middle]}`);
            start = middle + 1
            console.log(`start: ${end} = ${middle} + 1`);
        }
        middle = Math.floor((start + end) / 2)
        console.log(`middle: ${middle} = ${start} + ${end} / 2`);
    }
    return array[middle] === target ? `found at index ${middle} -> ${target}` : `not found`
}

infiniteSearch(array, 13)
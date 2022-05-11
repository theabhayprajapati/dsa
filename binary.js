let array = [0, 2, 4, 5, 7, 8, 10, 12, 23]


let binarySearch = (nums, target) => {
    let start = 0
    let end = nums.length - 1
    let middle = Math.floor((start + end) / 2)
    console.log(middle)

    while (start <= end) {
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
    return array[middle] === target ? `found at index ${middle} -> ${target}` : `${start} : Ceiling Index : value ${nums[start]}`
}

console.log(binarySearch(array, 14))

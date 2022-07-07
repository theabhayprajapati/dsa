// make a recursive mergesort alog
var bubbleSort = (arr) => {
    // console.log(arr);
    for (var j = 0; j < arr.length; j++) {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                var temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
                // console.log("true")
            }
            // console.log("false")
        }
        // console.log(arr)
        console.log(j);
    }
}
var arr = [4, 3, 7, 6, 4, 2, 8];
// mergesort
var mergeSort = (arr, start, end ) => {
    if (start < end) {
        var mid = Math.floor((start + end) / 2);
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
}
var merge = (arr, start, mid, end) => {
    var temp = [];
    var i = start;
    var j = mid + 1;
    var k = 0;
    while (i <= mid && j <= end) {
        if (arr[i] < arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }
    while (i <= mid) {
        temp[k++] = arr[i++];
    }
    while (j <= end) {
        temp[k++] = arr[j++];
    }
    for (var i = start; i <= end; i++) {
        arr[i] = temp[i - start];
    }
}
mergeSort(arr, 0, arr.length - 1);
console.log(arr);
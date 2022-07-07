// Quicksort(A, p, r)
// {
//     if (p < r)
//     {
//      q: <- Partition(A, p, r)
//      Quicksort(A, p, q)
//      Quicksort(A, q+1, r)
//     }
//    }

var quickSort = (A, p, q) => {
    if (p < q) {
        var r = partition(A, p, q);
        quickSort(A, p, r);
        quickSort(A, r + 1, q);
    }
}
var partition = (A, p, q) => {
    var pivot = A[q];
    var i = p - 1;
    for (var j = p; j < q; j++) {
        if (A[j] <= pivot) {
            i++;
            var temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    var temp = A[i + 1];
    A[i + 1] = A[q];
    A[q] = temp;
    return i + 1;
}
var nums = [2, 1];
quickSort(nums, 0, nums.length - 1);
console.log(nums);
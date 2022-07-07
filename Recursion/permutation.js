// var getPermutation = (n) => {
//     if (n == 1) {
//         return n;
//     }
//     return n * getPermutation(n - 1);
// }
// console.log(getPermutation(3))
// // with tail recursion

var getPermutation = (n) => {
    go(n, 1);
}
var go = (n, i) => {
    if (n == 1) {
        return i;
    }
    return go(n - 1, i * n);
}

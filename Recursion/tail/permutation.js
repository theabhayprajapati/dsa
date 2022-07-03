var getPermutation = (n) => {
    console.log("getting permutaion of " + n)
    return go(n, 1);
}
var go = (n, a) => {
    console.log(n)
    if (n == 1) {
        return a;
    }
    console.log(n)
    return go(n - 1, a * n);
}
console.log(getPermutation(4));
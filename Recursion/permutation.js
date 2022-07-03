var getPermutation = (n) => {
    if (n == 1) {
        return n;
    }
    return n * getPermutation(n - 1);
}
console.log(getPermutation(3))
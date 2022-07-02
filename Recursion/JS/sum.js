
var n = 1;
var sumOfN = (n) => {
    if (n === 0) return 0;
    return n + sumOfN(n - 1);
}
console.log(sumOfN(n));

// using loop
var sumOfN = (n) => {
    var sum = 0;
    for (var i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}
console.log(sumOfN(n));
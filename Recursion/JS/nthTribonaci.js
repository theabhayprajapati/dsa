
// var n = 25;
// find nth tribonacci number
var tribonacci = function (n) {
    if (n === 0) return 0;
    if (n === 1) return 1;
    if (n === 2) return 1;
    if (n === 3) return 2;
    return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
}
// make optimized version
var tribonacci = function (n) {
    var a = 0;
    var b = 1;
    var c = 1;
    if (n === 0) return a;
    if (n === 1) return b;
    if (n === 2) return c;
    for (var i = 3; i <= n; i++) {
        var d = a + b + c;
        a = b;
        b = c;
        c = d;
    }
    return c;
}
// good job
//# sourceMappingURL=nthTribonaci.js.map
var climbStairs = function (n) {
    if (n === 1) return 1;
    if (n === 2) return 2;
    return climbStairs(n - 1) + climbStairs(n - 2);
}
// make optimized version
var climbStairs = function (n) {
    var a = 1;
    var b = 2;
    if (n === 1) return a;
    if (n === 2) return b;
    for (var i = 3; i <= n; i++) {
        var c = a + b;
        a = b;
        b = c;
    }
    return b;
}


console.log(climbStairs(5));

// console.log(tribonacci(n));
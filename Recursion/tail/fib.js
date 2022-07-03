var fib = (n) => {
    return go(n, 0, 1)
}
var go = (n, a, b) => {
    if (n === 0) {
        return a;
    }
    if (n == 1) {
        return b;
    }
    return go(n - 1, b, b + a);
}

console.log(fib(6));
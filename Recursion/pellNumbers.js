const { log } = console
var pellNumbers = function (n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return (2 * pellNumbers(n - 1)) + pellNumbers(n - 2);
}
log(pellNumbers(10))
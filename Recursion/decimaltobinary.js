var decimalToBinary = function (decimal) {
    if (decimal === 0) {
        return "0";
    }
    if (decimal === 1) {
        return "1";
    }
    var binary = decimalToBinary(Math.floor(decimal / 2));
    return binary + (decimal % 2);
}
console.log(decimalToBinary(3));

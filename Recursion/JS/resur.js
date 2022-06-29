var printTillOne = (n) => {
    if (n == 0) {
        return;
    }
    console.log(n)
    printTillOne(n - 1)
    console.log(n)
}
// printTillOne(10)
// fac
var factorial = (n) => {
    if (n == 0) {
        return 1;
    }
    // print without new line
    process.stdout.write(n + " ");
    return n * factorial(n - 1)
}

// console.log(factorial(5))

var sumOfDigits = (n) => {
    if (n < 10) {
        return n;
    }
    // get first digit
    var firstDigit = n % 10;
    process.stdout.write("" + firstDigit);
    // get rest of the number
    var rest = n / 10;
    process.stdout.write(" : " + Math.floor(rest) + " ");
    return firstDigit + sumOfDigits(Math.floor(rest));
}
// console.log(" " + sumOfDigits(123456789))

// return true of false that does the number is power of 2
var isPowerOfTwo = (n) => {
    if (n == 0) {
        return false;
    }
    if (n == 1) {
        return true;
    }
    if (n % 2 != 0) {
        return false;
    }
    return isPowerOfTwo(n / 2);
}

// console.log(isPowerOfTwo(10))

var powerOfThree = (n) => {
    if (n == 0) {
        return false;
    }
    if (n == 1) {
        return true;
    }
    if (n % 3 != 0) {
        return false;
    }
    return powerOfThree(n / 3);
}
// console.log(powerOfThree(27))

var powerOfFour = (n) => {
    if (n == 0) {
        return false;
    }
    if (n == 1) {
        return true;
    }
    if (n % 4 != 0) {
        return false;
    }
    return powerOfFour(n / 4);
}
// console.log(powerOfFour(64))

var reverseANumber = (n) => {
    if (n < 10) {
        process.stdout.write(n + " ");
        return n;
    }
    var lastDigit = n % 10;
    var rest = Math.floor(n / 10);
    process.stdout.write("" + lastDigit);
    return (lastDigit * 10) + reverseANumber(rest);
}
// reverseANumber(12345678)
// return reverse of a number
var reverseVal = 0;
var reverse = (n) => {
    if (n == 0) {
        return reverseVal;
    }
    var lastDigit = n % 10;
    var rest = Math.floor(n / 10);
    reverseVal = (reverseVal * 10) + lastDigit;
    return reverse(rest);
}

reverse(987654321)
// console.log(reverseVal)

var reverseX = (n) => {
    var digits = Math.floor(Math.log10(n)) + 1;
    return helper(n, digits);
}
var helper = (n, digits) => {
    if (digits == 0) {
        return 0;
    }
    var lastDigit = n % 10;
    var rest = Math.floor(n / 10);
    return (lastDigit * Math.pow(10, digits - 1)) + helper(rest, digits - 1);
}
console.log(reverseX(1234506789))

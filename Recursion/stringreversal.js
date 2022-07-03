// /string reveral
var reverseString = (string) => {
    if (string.length == 0) {
        return "";
    }
    return reverseString(string.substring(1)) + string[0];
}
console.log(reverseString("ring"));


var lreverseString = (string) => {
    var ans = "";
    for (var i = string.length - 1; i >= 0; i--) {
        ans = ans + string[i]
    }
    return ans;
}
console.log(lreverseString("ring"));
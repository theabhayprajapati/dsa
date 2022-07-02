// /string reveral
var reverseString = (string) => {
    if (string.length == 0) {
        return "";
    }
    return reverseString(string.substring(1)) + string[0];
}
console.log(reverseString("ring"));

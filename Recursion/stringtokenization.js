// string tokenization
var tokenize = (string) => {
    if (string.length == 0) {
        return [];
    }
    var first = string[0];
    var rest = string.substring(1);
    return [first].concat(tokenize(rest));``
}
console.log(tokenize("string"));
// without using .concat, .substring

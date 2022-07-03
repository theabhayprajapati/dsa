// string tokenization
var tokenize = (string) => {
    if (string.length == 0) {
        return [];
    }
    var first = string[0];
    var rest = string.substring(1);
    return [first].concat(tokenize(rest)); ``
}
console.log(tokenize("string"));

var lTokenize = (string) => {
    var ans = [];
    for (var i = 0; i < string.length; i++) {
        ans.push(string[i]);
    }
    return ans;
}
console.log(lTokenize("string"));

var getMutations = (string) => {
    return go(string, []);
}
var go = (string, result) => {
    if (string.length === 0) {
        return result;
    } 
    else {
        var newResult = [];
        for (var i = 0; i < string.length; i++) {
            var newString = string.substring(0, i) + string.substring(i + 1);
            newResult.push(newString);
        }
        
        return go(newResult[0], result.concat(newResult));
    }
}
console.log(getMutations('abc'));
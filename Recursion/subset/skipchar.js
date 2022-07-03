var skipChar = (str) => {
    return go(str, "")
}
var go = (str, ans) => {
    if (str.length == 0) {
        return ans;
    }
    if (str[0] == "a") {
        return go(str.substring(1, str.length), ans)
    }
    return go(str.substring(1), ans = ans + str[0])
}
console.log(skipChar("baccad"));

// create a startsWith() method

// what is prototype?
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/prototype
console.log("baccad".startsWith("bac"));
console.log("baccad".startsWith("bacd"));

var startsWith = (str, prefix) => {
    return go(str, prefix, 0)
}
var go = (str, prefix, i) => {
    if (str.length == 0) {
        return false;
    }
    if (i == prefix.length) {
        return true;
    }
    if (str[i] == prefix[i]) {
        return go(str, prefix, i + 1)
    }
    return false
}
console.log(startsWith("baccad", "bac"));
console.log(startsWith("baccad", "bacd"));
// take a element and remove element
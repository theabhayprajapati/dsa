var subseq = (p, up) => {
    if (up.length == 0) {
        var ans = []
        ans.push(p);
        return ans;
    }
    var ch = up[0];
    var left = subseq(p, up.substring(1))
    var right = subseq(p + ch, up.substring(1));
    for (var i = 0; i < right.length ; i++) {
        left.push(right[i])
    }
    return left;
}

console.log(subseq("", "car"))
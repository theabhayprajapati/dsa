// get sub set of all 
// cars by simple recursion
var getSubSets = function (arr, index, current, result) {
    result.push(current);
    for (var i = index; i < arr.length; i++) {
        getSubSets(arr, i + 1, current.concat(arr[i]), result);
    }
    return result;
}
console.log(getSubSets('cars', 0, [], []));
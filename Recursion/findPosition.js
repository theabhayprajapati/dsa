var findPosition = (i, string, char) => {
    if (i == string.length) {
        return -1;
    }
    if (string[i] == char) {
        return i;
    }
    return findPosition(i + 1, string, char);
}
console.log(findPosition(0, "string", "h"));
const Student = require("./Static");

var Abhay = new Student("John");
// count
console.log(Student.getCount());
// make a loop and 100 and generate randoem student
// let students = [];
for (let i = 0; i < 100; i++) {
    var student = new Student("Student" + i);
    // students.push(new Student("Student" + i));
}
console.log(Student.getCount());
// get names
// create own toString()

Abhay.toString();
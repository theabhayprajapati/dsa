class Student {
    static getCount() {
        return Student.count;
    }
    static count = 0;
    constructor(name) {
        this.name = name;
        Student.count++;
    }
    toString() {
        return console.log(`Student: ${this.name}`);
    }
}
let student1 = new Student("John");
let student2 = new Student("Jane");
console.log(Student.getCount());

class Person {
    constructor(name) {
        this.name = name;
        Person.Population++;
    }
    static Population = 0;
    static getPopulation() {
        return Person.Population;
    }
    // override toString()
    toString() {
        return this.name + '@overridden string';
    }

}


// make a loop and generate person
let people = [];
for (let i = 0; i < 10; i++) {
    people.push(new Person("Person" + i));
}
console.log(Person.getPopulation());
// create a singleton class
class Singleton {
    constructor() {
        if (!Singleton.instance) {
            Singleton.instance = this;
        }
        return Singleton.instance;
    }
}
let singleton = new Singleton();
let singleton2 = new Singleton();
console.log(singleton === singleton2);
module.exports = Student;
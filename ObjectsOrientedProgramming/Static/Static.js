class Student {
    static getCount() {
        return Student.count;
    }
    static count = 0;
    constructor(name) {
        this.name = name;
        Student.count++;
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

}

// make a loop and generate person
let people = [];
for (let i = 0; i < 10; i++) {
    people.push(new Person("Person" + i));
}
console.log(Person.getPopulation());

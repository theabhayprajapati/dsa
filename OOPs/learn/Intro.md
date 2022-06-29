# OOPs Lecture 1

learned about contructor's

- here is what understand about contructor is that;

- we can create object of a class

```java
class Person{
    String name;
    int age;
}
```

creating object of class Person

```java
// 
Person p = new Person();
p.name = "John";
p.age = 30;
// so here as we have not created constutor's we need to write p.name; p.age;
```

```java
class Human {
    String name;
    int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
```

```java
Human h = new Human("John", 30);

// as we have created constuctor's we need not to write h.name; h.age;
// else we add that in the parameter of constructor's/fn
// contructors is a special function that is used to initialize the object

```

pay attention to the **this** keyword;
it is nothing but the object itself;
`this.name == h.name`

under the hood the `this` keyword will be replaced by the object (`h`) itself

> If we donot provide `this` then we need to always need to write `h.name` object name;

<!-- check the code -->

<!-- https://github.com/theabhayprajapati/dsa/blob/trunk/OOPs/learn/Intro.java -->

[***repo for code🧑🏻‍💻***](https://github.com/theabhayprajapati/dsa/blob/trunk/OOPs/learn/Intro.java)

**🤝🏾Connect me on:**

**Twitter**: 🕊️[`@Abhayprajapati_`](https://twitter.com/Abhayprajapati_)
**Github**: 🐧[`@theabhayprajapati`](https://github.com/theabhayprajapati)

<!-- suggest and edit -->
---

[***suggest and edit🖋️***](https://github.com/theabhayprajapati/dsa/blob/trunk/OOPs/learn/Intro.md)

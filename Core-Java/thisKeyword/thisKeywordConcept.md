# Java Notes: Object, Instance, Instance Variable, Parameter and `this` Keyword

## 1. What is a Class?

A class is a blueprint or template used to create objects.

Example:

```java
class Student {
    String name;
    int age;
}
```

- `class` is a keyword used to declare a class.
- `Student` is the class name.
- `name` stores the student's name.
- `age` stores the student's age.

## 2. What is an Object?

An object is an instance of a class. It has its own state and can use the behavior defined by its class.

Example:

```java
class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
```

Explanation:

- `Student` is the class name and reference type.
- `s1` and `s2` are reference variables.
- `new Student()` creates a new Student object.
- `s1` and `s2` refer to two separate objects.

## 3. What is an Instance?

An instance is an individual object created from a class.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();
```

Here:

- The object referred to by `s1` is an instance of the `Student` class.
- The object referred to by `s2` is another instance of the `Student` class.

**Remember:** Object and instance are commonly used with the same meaning in Java.

## 4. What is an Instance Variable?

An instance variable is a variable declared inside a class but outside methods, constructors, and initialization blocks.

Each object has its own instance-variable values.

Example:

```java
class Student {
    String name;
    int age;
}
```

Here, `name` and `age` are instance variables.

Example of using instance variables:

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Rahul";
s1.age = 20;

s2.name = "Aman";
s2.age = 22;
```

Values:

- Object `s1`: name = "Rahul", age = 20
- Object `s2`: name = "Aman", age = 22

Changing the instance variable of one object does not directly change the corresponding variable of another object.

### Default Values of Instance Variables

If no value is explicitly assigned, instance variables receive default values.

- `int` = `0`
- `double` = `0.0`
- `boolean` = `false`
- `char` = `'\u0000'`
- Reference types, such as `String` = `null`

## 5. What is a Parameter?

A parameter is a variable declared in a method or constructor definition. It receives a value when the method or constructor is called.

Example:

```java
void display(String name) {
    System.out.println(name);
}
```

Here, `name` is a parameter.

Method call:

```java
display("Rahul");
```

Here:

- `name` is the parameter.
- `"Rahul"` is the argument passed to the method.

## 6. What is a Constructor?

A constructor is a special class member used to initialize an object.

Its name must match the class name, and it has no return type.

Example:

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Here:

- `Student` is the constructor name.
- `String name` and `int age` are constructor parameters.
- The constructor initializes the object's instance variables.

## 7. What is the `this` Keyword?

In Java, `this` is a reference to the current object.

It is commonly used to distinguish instance variables from parameters when both have the same name.

Example:

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Understanding `this.name = name;`

```java
this.name = name;
```

- `this.name` refers to the current object's instance variable.
- `name` refers to the constructor parameter.
- `=` assigns the value on the right to the variable on the left.

**Meaning:** Assign the constructor parameter's value to the current object's instance variable.

Similarly:

```java
this.age = age;
```

This assigns the constructor parameter `age` to the current object's instance variable `age`.

## 8. Complete Example of the `this` Keyword

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Aman", 22);

        s1.display();
        s2.display();
    }
}
```

Output:

```text
Name: Rahul
Age: 20
Name: Aman
Age: 22
```

Explanation:

1. `new Student("Rahul", 20)` creates a Student object.
2. The constructor receives `"Rahul"` and `20`.
3. `this` refers to the object being initialized.
4. The values are stored in that object's instance variables.
5. The second constructor call initializes a separate object.

## 9. Is `this` Always Necessary?

No. The `this` keyword is not always necessary.

When the parameter and instance variable have different names, the instance variable can be accessed without `this`.

Example:

```java
class Student {
    String name;

    Student(String studentName) {
        name = studentName;
    }
}
```

Here:

- `name` is the instance variable.
- `studentName` is the constructor parameter.
- Since the names are different, there is no naming conflict.

However, when both names are the same, use `this` to refer to the instance variable.

Correct:

```java
Student(String name) {
    this.name = name;
}
```

Incorrect for initializing the instance variable:

```java
Student(String name) {
    name = name;
}
```

In the incorrect example, both occurrences refer to the parameter. The instance variable is not initialized by this assignment and retains its default value.

## 10. Important Points to Remember

- A class is a blueprint for creating objects.
- An object is an instance of a class.
- Instance variables belong to individual objects.
- Parameters receive values through method or constructor calls.
- Arguments are the values passed during a call.
- A constructor initializes an object.
- `this` refers to the current object.
- `this.variable` refers to the current object's instance variable when applicable.
- `this.variable = parameter;` assigns a parameter's value to an instance variable.
- `this` does not create a new object.

## Quick Revision

| Expression | Meaning |
|---|---|
| `Student` | Class name |
| `s1` | Reference variable |
| `new Student()` | Creates a new object |
| `String name;` | Instance variable when declared at class level |
| `Student(String name)` | Constructor with a parameter |
| `this.name` | Current object's instance variable |
| `this.name = name;` | Assigns the parameter value to the instance variable |

------------------------------------------------------------------------------------------------

this Keyword

The this keyword in Java refers to the current object. It is used to:

1.Access instance variables when they are shadowed by method parameters.

this.variable = parameter;
 

2.Call other methods or constructors in the same class.

this.methodName();
this(); // Calls another constructor
 

3.Pass the current object as an argument.

otherMethod(this);
 

In short, this connects the current object with its variables, methods, or constructors.
 
-----------------------------------------------------------------------------------------
In Java, this keyword refers to the current object within a class. It helps distinguish instance variables from method parameters or local variables and is often used to call other constructors or methods of the same object.

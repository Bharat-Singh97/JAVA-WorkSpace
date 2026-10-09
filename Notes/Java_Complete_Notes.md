# JAVA MASTERBOOK

> **FROM ZERO TO INDUSTRY-READY JAVA DEVELOPER**
>
> Foundations · Core Java · JVM Internals · Spring Boot · Backend Development · Interviews

---

# PART 01 — BEFORE JAVA

**CHAPTER 01** · PROGRAMMING FOUNDATIONS

# 01. What Is Programming?

---

> [!IMPORTANT]
> **CORE IDEA**
>
> Programming is the process of writing instructions that a computer can execute to perform tasks or solve problems.

## 1.1 — How Does a Program Work?

Imagine using a calculator to add two numbers.

```text
        THE PROGRAMMING CYCLE

    ┌──────────────┐
    │    INPUT     │
    │   10 and 20  │
    └──────┬───────┘
           │
           ▼
    ┌──────────────┐
    │   PROCESS    │
    │   10 + 20    │
    └──────┬───────┘
           │
           ▼
    ┌──────────────┐
    │    OUTPUT    │
    │      30      │
    └──────────────┘
```

| Stage | Meaning | Example |
|---|---|---|
| **INPUT** | Data supplied | `10, 20` |
| **PROCESS** | Operation performed | `10 + 20` |
| **OUTPUT** | Result produced | `30` |

**Remember:** `INPUT → PROCESS → OUTPUT`

### Interview Question

**Q. What are input, process, and output?**

**Answer:**
- **Input:** Data supplied to a program.
- **Process:** Operations performed on the data.
- **Output:** Result produced by the program.

---

## 1.2 — Why Do We Need Programming?

Computers can perform operations very quickly, but we need to provide suitable instructions to tell them what task to perform.

Programming helps us:

- **Automate tasks:** Perform repetitive work.
- **Process data:** Calculate, sort, search, and analyze information.
- **Build applications:** Create websites, mobile apps, and desktop software.
- **Solve problems:** Convert real-world requirements into executable instructions.

> **REAL-WORLD CONNECTION**
>
> A banking application uses programs to process transactions, retrieve account information, and calculate balances.

### Interview Question

**Q. Why do we need programming?**

**Answer:** Programming allows us to give instructions to computers so they can solve problems, process data, automate tasks, and run applications.

---

## 1.3 — What Is a Programming Language?

A **programming language** is a language used to write instructions that can be translated into operations a computer can execute.

### Examples

| Language | Common areas of use |
|---|---|
| C | System programming, embedded software |
| C++ | Games, performance-intensive software |
| Java | Backend applications, enterprise software |
| Python | Automation, data analysis, AI |
| JavaScript | Web development |

These are common uses, not exclusive limits. Each language can be used in other areas too.

### Interview Question

**Q. What is a programming language?**

**Answer:** A programming language allows developers to write instructions that can be translated into operations a computer can execute.

---

## 1.4 — Your First Java Code Fragment

```java
int a = 10;
int b = 20;

int sum = a + b;

System.out.println(sum);
```

**OUTPUT**

```text
30
```

### Understand Each Line

| Code | Explanation |
|---|---|
| `int a = 10;` | Declares an integer variable and stores `10`. |
| `int b = 20;` | Declares another integer variable and stores `20`. |
| `int sum = a + b;` | Adds the two values and stores `30`. |
| `System.out.println(sum);` | Prints the value of `sum`. |

> [!NOTE]
> This is a Java **code fragment**, not a complete standalone program. We will learn the complete program structure in the Java foundations section.

### Interview Question

**Q. What is the purpose of `System.out.println()` in Java?**

**Answer:** It displays the specified value or text in the console and moves the cursor to the next line.

---

## 1.5 — Quick Revision

- Programming means writing instructions for a computer.
- A program can accept input, process data, and produce output.
- A programming language helps us express instructions.
- Java is one of several programming languages.
- Java code must follow the language's rules to compile and run successfully.

---

## 1.6 — Test Your Understanding

**Q1. Which sequence best represents the basic working of a program?**

- A. Output → Input → Process
- B. Input → Process → Output
- C. Process → Output → Input
- D. Output → Process → Input

**Your answer:** Write A, B, C, or D in your practice notes.


================================================================================================

**CHAPTER 02** · LANGUAGES BEFORE JAVA

# 02. Why Did We Need Java?

---

## 2.1 — What Languages Existed Before Java?

Programming languages developed over time to make computer programming easier and more powerful.

- **Machine Language:** Instructions represented in binary, using `0` and `1`.
- **Assembly Language:** Uses short symbolic instructions instead of writing everything in binary.
- **C:** A procedural programming language widely used in system programming.
- **C++:** Extends C with features such as classes and object-oriented programming.
- **Java:** Designed to support portable applications through the Java platform.

### Interview Question

**Q. Name some programming languages that existed before Java.**

**Answer:** C and C++ are examples of programming languages that existed before Java.

---

## 2.2 — What Is C Language?

C is a **procedural programming language** developed by Dennis Ritchie at Bell Labs in the early 1970s.

### Key Points

- Programs are organized around functions and procedures.
- It provides low-level memory access through pointers.
- It is widely used in operating systems, embedded systems, and system software.
- It is efficient and gives programmers significant control over memory.

### Simple C Example

```c
#include <stdio.h>

int main() {
    int a = 10;
    int b = 20;

    int sum = a + b;

    printf("%d", sum);

    return 0;
}
```

**Output**

```text
30
```

### Interview Question

**Q. What is C language?**

**Answer:** C is a general-purpose procedural programming language known for its efficiency and use in system programming.

---

## 2.3 — What Is the Role of C++?

C++ was developed by Bjarne Stroustrup, beginning in the late 1970s as an extension of C.

### Why Was C++ Useful?

- Supports **procedural programming** and **object-oriented programming**.
- Provides classes, objects, inheritance, and polymorphism.
- Offers fine-grained control over system resources.
- Is used in games, desktop applications, and performance-intensive software.

### C vs C++ — Quick Comparison

| Feature | C | C++ |
|---|---|---|
| Main approach | Procedural | Procedural and object-oriented |
| Classes and objects | Not built in as C++-style OOP features | Supported |
| Memory control | Manual techniques | Manual techniques and additional abstractions |
| Common uses | System software, embedded systems | Games, systems software, high-performance applications |

### Interview Question

**Q. What is one major difference between C and C++?**

**Answer:** C is primarily procedural, while C++ supports both procedural and object-oriented programming.

---

## 2.4 — Why Was Java Introduced?

Java was developed at Sun Microsystems under James Gosling's leadership. It was publicly released in 1995.

### What Problems Did Java Aim to Address?

- **Portability:** Programs could run on different supported platforms using the Java platform.
- **Simpler memory management:** Java provides automatic garbage collection.
- **Object-oriented design:** Java supports classes and objects.
- **Security features:** The Java platform includes mechanisms designed to support safer execution.
- **Networked applications:** Java was designed with network-oriented applications in mind.

> **IMPORTANT**
>
> Java did not make C or C++ obsolete. All three languages continue to be used for different purposes.

### Interview Question

**Q. Who developed Java, and when was it publicly released?**

**Answer:** Java was developed at Sun Microsystems under James Gosling's leadership and publicly released in 1995.

---

## 2.5 — What Does “Write Once, Run Anywhere” Mean?

Java is known for the phrase **Write Once, Run Anywhere (WORA)**.

The basic idea is that Java source code can be compiled into **bytecode**, which can run on any compatible Java Virtual Machine (JVM).

### How It Works

```text
       Java Source Code
          Main.java
              |
              v
       Java Compiler
           javac
              |
              v
        Java Bytecode
          Main.class
              |
        +-----+-----+
        |           |
        v           v
      JVM on      JVM on
      Windows     Linux
        |           |
        v           v
      Program     Program
       runs        runs
```

The target systems need compatible Java runtime environments. WORA does not mean every program runs everywhere without any platform-specific requirements.

### Interview Question

**Q. What does Write Once, Run Anywhere mean in Java?**

**Answer:** Java bytecode can run on different platforms that provide a compatible JVM, without needing to compile the same source code separately for each platform in the usual case.

---

## 2.6 — Quick Revision

- C is primarily a procedural language.
- C++ supports procedural and object-oriented programming.
- Java was publicly released in 1995.
- Java supports automatic garbage collection.
- Java bytecode runs on a compatible JVM.
- Java did not replace C or C++.

---

## 2.7 — Test Your Understanding

**Q1. Which component allows Java bytecode to run on different supported platforms?**

- A. `printf()`
- B. JVM
- C. HTML
- D. SQL

**Your answer:** Write A, B, C, or D.
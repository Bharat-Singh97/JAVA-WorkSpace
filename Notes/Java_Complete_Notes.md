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
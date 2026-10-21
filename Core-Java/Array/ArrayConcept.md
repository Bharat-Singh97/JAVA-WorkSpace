# Special Case: Printing a char[] Array in Java

## 1. Example

```java
public class Solution {
    public static void main(String[] args) {

        char[] str = {'A', 'B', 'C'};

        System.out.println(str);
    }
}
```

### Output

```text
ABC
```

## 2. Explanation

Normally, when we print an array directly using `System.out.println(arr)`, Java does not display the elements for most array types.

However, `char[]` is a special case.

The `PrintStream` class provides a dedicated `println(char[])` method that prints the characters directly.

Example:

```java
char[] str = {'A', 'B', 'C'};
System.out.println(str);
```

Output:

```text
ABC
```

The characters are printed one after another, without spaces or square brackets.

## 3. Difference Between int[] and char[]

Example:

```java
int[] a = {1, 2, 3};
char[] b = {'A', 'B', 'C'};

System.out.println(a);
System.out.println(b);
```

Output (example):

```text
[I@2f92e0f4
ABC
```

Note: The exact identity-style string printed for `int[]` varies.

| Array Type | Result of Direct Printing |
|---|---|
| `int[]` | Identity-style string |
| `double[]` | Identity-style string |
| `String[]` | Identity-style string |
| `char[]` | Prints characters directly |

## 4. Why Does This Happen?

Java's `PrintStream` class has an overloaded method:

```java
println(char[] x)
```

When the argument is a `char[]`, Java calls this method and prints the characters directly.

For most other array types, `println()` prints an identity-style string instead of the array elements.

## 5. How to Print Other Arrays Properly

### A. Using Arrays.toString() for a 1D Array

```java
import java.util.Arrays;

int[] arr = {1, 2, 3, 4};

System.out.println(Arrays.toString(arr));
```

Output:

```text
[1, 2, 3, 4]
```

### B. Using Arrays.deepToString() for a Multidimensional Array

```java
import java.util.Arrays;

int[][] matrix = {
    {1, 2},
    {3, 4}
};

System.out.println(Arrays.deepToString(matrix));
```

Output:

```text
[[1, 2], [3, 4]]
```

## 6. Quick Revision

- `System.out.println(intArray)` prints an identity-style string.
- `System.out.println(charArray)` prints the characters directly.
- `Arrays.toString(arr)` prints a readable representation of a 1D array.
- `Arrays.deepToString(arr)` prints nested array contents.
- The special behavior of `char[]` occurs because Java provides a dedicated `println(char[])` method.

**Interview Tip:** Remember the difference between direct array printing and using `Arrays.toString()`. It is a common Java output-based interview question.
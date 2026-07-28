# Reverse a String

## Problem Statement

Given a string `s`, reverse the string.

Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes the second last, and so on.

### Example 1

**Input**

```text
s = "GeeksforGeeks"
```

**Output**

```text
skeeGrofskeeG
```

### Example 2

**Input**

```text
s = "abdcfe"
```

**Output**

```text
efcdba
```

---

## Approach

### Using Backward Traversal

### Idea

- Create an empty `StringBuilder`.
- Traverse the string from the last character to the first.
- Append each character to the `StringBuilder`.
- Print the reversed string.

---

## Java Code

```java
class GFG {

    static void reverse(String s) {

        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        System.out.print(result);
    }

    public static void main(String[] args) {

        String s = "abdcfe";
        reverse(s);
    }
}
```

---

## Output

```text
efcdba
```

---

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Auxiliary Space:** `O(n)`

---

## Concepts Used

- Strings
- StringBuilder
- Backward Traversal

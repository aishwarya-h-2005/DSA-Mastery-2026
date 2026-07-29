# Reverse a String

## Problem Statement

Given a string `s`, reverse the string.

Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes the second last, and so on.

### Example 1

**Input:**
```
GeeksforGeeks
```

**Output:**
```
skeeGrofskeeG
```

### Example 2

**Input:**
```
abdcfe
```

**Output:**
```
efcdba
```

---

## Approach 1

### Using Backward Traversal

- Create an empty `StringBuilder`.
- Traverse the string from the last character to the first.
- Append each character to the `StringBuilder`.
- Print the reversed string.

---

## Time Complexity

- **O(n)**

## Auxiliary Space

- **O(n)**

- ## Approach 2

### Using Two Pointers

- Convert the string into a character array.
- Initialize two pointers:
  - left = 0
  - right = last index
- Swap the characters at left and right.
- Move left forward and right backward.
- Repeat until both pointers meet.
- Print the reversed character array.

---

## Time Complexity

- *O(n)*

## Auxiliary Space

- *O(1)*

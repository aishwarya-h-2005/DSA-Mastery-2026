# Check if Strings Are Rotations of Each Other

## Problem Statement

Given two strings `s1` and `s2` of equal length, determine whether `s2` is a rotation of `s1`.

A string is said to be a rotation of another if it can be obtained by shifting some leading characters of the original string to its end without changing the order of characters.

### Example 1

**Input**
```text
s1 = "abcd"
s2 = "cdab"
```

**Output**
```text
true
```

### Example 2

**Input**
```text
s1 = "aab"
s2 = "aba"
```

**Output**
```text
true
```

### Example 3

**Input**
```text
s1 = "abcd"
s2 = "acbd"
```

**Output**
```text
false
```

---

# Approaches

## 1. Naive Approach

### Idea

- Generate all possible rotations of `s1`.
- Compare every rotation with `s2`.
- If any rotation matches, return `true`.
- Otherwise return `false`.

**Time Complexity:** `O(n²)`

**Auxiliary Space:** `O(n)`

---

## 2. String Concatenation + contains()

### Idea

- Concatenate the original string with itself.
- `result = s1 + s1`
- If `result` contains `s2`, then `s2` is a rotation of `s1`.
- Otherwise, it is not a rotation.

**Time Complexity:** `O(n²)` *(Worst Case)*

**Auxiliary Space:** `O(n)`

---

## Files

- `Naive Approach.java`
- `String Concatenation + contains().java`

---

## Note

The expected optimal solution uses the **KMP (Knuth-Morris-Pratt)** algorithm with **O(n)** time complexity. This implementation will be added after studying the KMP algorithm.

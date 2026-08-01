# Approach 1 - Sorting

## Problem Statement

Given two strings `str1` and `str2`, determine whether `str1` exists as a **shuffled substring** of `str2`.

Return **"YES"** if such a substring exists, otherwise return **"NO"**.

---

## Example 1

**Input**

```text
str1 = "onetwofour"
str2 = "hellofourtwooneworld"
```

**Output**

```text
YES
```

**Explanation**

A substring `"fourtwoone"` exists inside `str2`.

After sorting,

```text
onetwofour
```

and

```text
fourtwoone
```

contain exactly the same characters.

---

## Example 2

**Input**

```text
str1 = "roseyellow"
str2 = "yellow"
```

**Output**

```text
NO
```

---

## Approach

- If the length of `str1` is greater than `str2`, return **NO**.
- Convert `str1` into a character array and sort it.
- Traverse `str2` using a sliding window of size equal to `str1.length()`.
- For each window:
  - Extract the substring.
  - Convert it into a character array.
  - Sort it.
  - Compare it with the sorted `str1`.
- If both arrays are equal, return **YES**.
- If no matching window is found, return **NO**.

---

## Time Complexity

**O(m × n log n)**

Where:

- **n** = length of `str1`
- **m** = length of `str2`

---

## Auxiliary Space

**O(n)**

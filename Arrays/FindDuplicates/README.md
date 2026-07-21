# Find Duplicates in an Array

## Problem Statement

Given an array `arr[]` of size `n`, find all the duplicate elements. Each duplicate element should be printed only once.

---

## Example

**Input**

```text
arr = [1, 6, 5, 3, 2, 2, 3]
```

**Output**

```text
2 3
```

---

# Approach

## HashMap Approach

1. Create a `HashMap` to store the frequency of each element.
2. Traverse the array and count the occurrence of every element.
3. Traverse the `HashMap`.
4. Print the elements whose frequency is greater than `1`.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(n)**

---

## Java File

`FindDuplicates_HashMap.java`

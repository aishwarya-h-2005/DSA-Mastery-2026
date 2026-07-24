# Common Elements in Three Sorted Arrays

## Problem Statement

Given three sorted arrays `a[]`, `b[]`, and `c[]` in non-decreasing order, find all the elements that are common to all three arrays.

- Return the common elements in non-decreasing order.
- If there are no common elements, return an empty array.
- If duplicate common elements exist, include each element only once.

---

## Example

### Input

```text
a = [1, 5, 10, 20, 30]
b = [5, 13, 15, 20]
c = [5, 20]
```

### Output

```text
5 20
```

### Explanation

The elements **5** and **20** are present in all three arrays.

---

# Approach (Three Pointers)

## Algorithm

1. Initialize three pointers:
   - `i` for array `a`
   - `j` for array `b`
   - `k` for array `c`
2. Compare the current elements of all three arrays.
3. If all three elements are equal:
   - Store the common element.
   - Move all three pointers forward.
4. Otherwise, move the pointer pointing to the smallest element.
5. Repeat the process until one of the arrays is completely traversed.
6. Print all the common elements.

---

## Time Complexity

**O(n₁ + n₂ + n₃)**

---

## Space Complexity

**O(1)** *(excluding the array used to store the result)*

---

## Java File

`CommonElementsInThreeSortedArrays_ThreePointers.java`

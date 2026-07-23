# Count Inversions in an Array

## Problem Statement

Given an integer array `arr[]`, count the number of inversions in the array.

An inversion is a pair of indices `(i, j)` such that:
- `i < j`
- `arr[i] > arr[j]`

If the array is already sorted, the inversion count is `0`.

---

## Example

### Input

```text
arr = [4, 3, 2, 1]
```

### Output

```text
6
```

### Explanation

The inversion pairs are:

```text
(4,3)
(4,2)
(4,1)
(3,2)
(3,1)
(2,1)
```

So, the inversion count is **6**.

---

# Approach 1 (Naive)

## Algorithm

1. Initialize `count = 0`.
2. Pick each element using the outer loop.
3. Compare it with every element after it using the inner loop.
4. If `arr[i] > arr[j]`, increment `count`.
5. Print the final inversion count.

---

## Time Complexity

**O(n²)**

---

## Space Complexity

**O(1)**

---

## Efficiency

- **Time:** O(n²) because every element is compared with all elements after it.
- **Space:** O(1) because no extra data structure is used (only the `count` variable).

---

## Java File

`CountInversions_Naive.java`

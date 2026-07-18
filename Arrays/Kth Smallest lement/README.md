# Kth Smallest Element in an Unsorted Array

## Problem Statement

Given an unsorted array of distinct integers and an integer `k`, find the `k`th smallest element in the array.

### Example

**Input:**

arr = [7, 10, 4, 3, 20, 15]

k = 3

**Output:**

7

---

## Approach Used

### Sorting

1. Sort the array in ascending order.
2. The `k`th smallest element is present at index `k - 1`.

### Time Complexity

O(n log n)

### Space Complexity

O(1)

### File

- `KthSmallest_Sorting.java`

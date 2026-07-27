
# Print Subarray with Maximum Sum (Kadane's Algorithm)

## Problem Statement

Given an integer array `arr[]`, print the contiguous subarray having the maximum possible sum.

A **subarray** is a continuous part of the array.

---

## Example 1

### Input

```text
arr = [2, 3, -8, 7, -1, 2, 3]
```

### Output

```text
7 -1 2 3
```

### Explanation

The subarray:

```text
[7, -1, 2, 3]
```

has the maximum sum:

```text
7 + (-1) + 2 + 3 = 11
```

---

## Example 2

### Input

```text
arr = [-2, -5, 6, -2, -3, 1, 5, -6]
```

### Output

```text
6 -2 -3 1 5
```

### Explanation

The subarray:

```text
[6, -2, -3, 1, 5]
```

has the maximum sum:

```text
6 + (-2) + (-3) + 1 + 5 = 7
```

---

## Approach (Kadane's Algorithm)

The solution uses **Kadane's Algorithm** along with index tracking.

### Algorithm

1. Initialize:
   - `current` = first element
   - `max_so_far` = first element
   - `start`, `end`, and `temp` indices.
2. Traverse the array from left to right.
3. For every element:
   - If starting a new subarray gives a better sum, start a new subarray.
   - Otherwise, extend the current subarray.
4. Whenever the current sum becomes greater than the maximum sum found so far:
   - Update the maximum sum.
   - Store the starting and ending indices of the subarray.
5. Print the elements from `start` to `end`.

---

## Time Complexity

```text
O(n)
```

The array is traversed only once.

---

## Space Complexity

```text
O(1)
```

Only a few extra variables are used.

---

## Java File

```text
PrintSubarrayWithMaximumSum_KadanesAlgorithm.java
```

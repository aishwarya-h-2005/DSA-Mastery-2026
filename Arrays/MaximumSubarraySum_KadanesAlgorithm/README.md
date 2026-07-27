# Maximum Subarray Sum - Kadane's Algorithm

## Problem Statement

Given an integer array `arr[]`, find the contiguous subarray (containing at least one element) that has the maximum possible sum and return that sum.

**Note:** A subarray is a continuous part of an array.

---

## Example 1

**Input**

```text
arr = [2, 3, -8, 7, -1, 2, 3]
```

**Output**

```text
11
```

**Explanation**

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

**Input**

```text
arr = [-2, -4]
```

**Output**

```text
-2
```

---

## Example 3

**Input**

```text
arr = [5, 4, 1, 7, 8]
```

**Output**

```text
25
```

---

## Approach

This solution uses **Kadane's Algorithm**.

### Algorithm

1. Initialize:
   - `current = arr[0]`
   - `max_so_far = arr[0]`
2. Traverse the array from left to right.
3. At each element:
   - Either extend the current subarray.
   - Or start a new subarray from the current element.
4. Update the maximum sum found so far.
5. Return the maximum subarray sum.

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

Only constant extra space is used.

---

## Java File

```text
MaximumSubarraySum_KadanesAlgorithm.java
```

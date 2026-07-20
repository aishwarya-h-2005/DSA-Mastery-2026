# Maximum Subarray Sum - Kadane's Algorithm

## Problem Statement

Given an integer array `arr[]`, find the **maximum sum of a contiguous subarray**.

A **subarray** is a continuous part of an array.

### Example 1

**Input**

```text
arr = [2, 3, -8, 7, -1, 2, 3]
```

**Output**

```text
11
```

**Explanation**

The subarray `[7, -1, 2, 3]` has the maximum sum of **11**.

---

### Example 2

**Input**

```text
arr = [-2, -4]
```

**Output**

```text
-2
```

**Explanation**

The subarray `[-2]` has the maximum sum.

---

### Example 3

**Input**

```text
arr = [5, 4, 1, 7, 8]
```

**Output**

```text
25
```

**Explanation**

The entire array has the maximum sum.

---

# Approach: Kadane's Algorithm

### Algorithm

1. Initialize `current` and `maxSoFar` with the first element.
2. Traverse the array from the second element.
3. At each element:
   - Start a new subarray from the current element.
   - Or extend the previous subarray.
4. Choose the larger value using `Math.max()`.
5. Update the maximum sum found so far.
6. Print the maximum subarray sum.

### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**

### File

- `MaximumSubarraySum_Kadane.java`

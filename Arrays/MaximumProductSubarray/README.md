# Maximum Product Subarray

## Problem Statement

Given an array `arr[]` consisting of positive, negative, and zero values, find the **maximum product** that can be obtained from any contiguous subarray.

A **subarray** is a continuous part of an array.

---

## Examples

### Example 1

**Input**

```text
arr = [-2, 6, -3, -10, 0, 2]
```

**Output**

```text
180
```

**Explanation**

The subarray `[6, -3, -10]` has the maximum product.

```
6 × (-3) × (-10) = 180
```

---

### Example 2

**Input**

```text
arr = [-1, -3, -10, 0, 6]
```

**Output**

```text
30
```

**Explanation**

The subarray `[-3, -10]` has the maximum product.

```
(-3) × (-10) = 30
```

---

### Example 3

**Input**

```text
arr = [2, 3, 4]
```

**Output**

```text
24
```

**Explanation**

All numbers are positive, so the product of the entire array is maximum.

```
2 × 3 × 4 = 24
```

---

# Approach

## Expected Approach (Track Minimum and Maximum Product)

### Algorithm

1. Initialize `maxProduct`, `minProduct`, and `answer` with the first element.
2. Traverse the array from the second element.
3. If the current element is negative, swap `maxProduct` and `minProduct`.
4. Update the maximum product ending at the current index.
5. Update the minimum product ending at the current index.
6. Update the overall maximum product.
7. Print the answer.

---

## Why do we track both Maximum and Minimum?

- A **negative number** can change the sign of the product.
- Multiplying two negative numbers produces a positive number.
- Therefore, today's minimum product may become tomorrow's maximum product.

Example:

```text
Current Minimum = -18

Current Element = -10

(-18) × (-10) = 180
```

So we must keep track of both the maximum and minimum products.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(1)**

---

## Java File

`MaximumProductSubarray_MinMax.java`

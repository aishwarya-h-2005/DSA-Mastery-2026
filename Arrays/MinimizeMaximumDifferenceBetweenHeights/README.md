# Minimize the Maximum Difference Between the Heights

## Problem Statement

Given an array `arr[]` of tower heights and an integer `k`, increase or decrease each tower by `k` exactly once. Find the minimum possible difference between the tallest and shortest tower after modification.

---

## Example

**Input**

```text
arr = [1, 5, 8, 10]
k = 2
```

**Output**

```text
5
```

**Explanation**

Modified array:

```text
[3, 3, 6, 8]
```

Difference:

```text
8 - 3 = 5
```

---

# Approach

## Sorting (Greedy)

### Algorithm

1. Sort the array.
2. Increase smaller towers by `k`.
3. Decrease taller towers by `k`.
4. Try every possible split.
5. Calculate the new minimum and maximum heights.
6. Update the minimum difference.

---

## Time Complexity

**O(n log n)**

---

## Space Complexity

**O(1)**

---

## Java File

`MinimizeMaximumDifferenceBetweenHeights.java`

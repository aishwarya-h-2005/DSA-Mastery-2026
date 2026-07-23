# 2 Sum - Count Pairs with Given Sum

## Problem Statement

Given an integer array `arr[]` and a target value, find the number of pairs whose sum is equal to the given target.

A pair `(arr[i], arr[j])` is considered valid if:

- `i < j`
- `arr[i] + arr[j] == target`

Return the total number of such pairs.

---

## Example

### Input

```text
arr = [1, 5, 7, -1, 5]
target = 6
```

### Output

```text
3
```

### Explanation

The pairs with sum equal to `6` are:

- (1, 5)
- (7, -1)
- (1, 5)

So, the total number of pairs is **3**.

---

# Approach 1 (Naive)

## Algorithm

1. Initialize a variable `count = 0`.
2. Use the first loop to select each element.
3. Use the second loop to compare it with every remaining element.
4. If the sum of the two elements equals the target, increment `count`.
5. After checking all possible pairs, print the value of `count`.

---

## Time Complexity

**O(n²)**

---

## Space Complexity

**O(1)**

---

## Efficiency

- **Time:** O(n²), because every pair of elements is checked.
- **Space:** O(1), because no extra data structure is used.

---

## Java File

`TwoSumCountPairs_Naive.java`

# Move All Negative Numbers to Beginning and Positive Numbers to End

## Problem Statement

Given an array containing both positive and negative numbers, rearrange the array so that all negative numbers appear before all positive numbers. The order of elements does not matter.

### Example

**Input:**
```
[-12, 11, -13, -5, 6, -7, 5, -3, -6]
```

**Output:**
```
[-13, -12, -7, -6, -5, -3, 5, 6, 11]
```

---

# Approach 1: Sorting

### Algorithm

1. Sort the array using `Arrays.sort()`.
2. Print the sorted array.

### Time Complexity

```
O(n log n)
```

### Space Complexity

```
O(1)
```

### File

- `MoveNegativeNumbers_Sorting.java`

---

# Approach 2: Quick Sort Partition (Optimal)

### Algorithm

1. Initialize `j = 0`.
2. Traverse the array using `i`.
3. If `arr[i]` is negative, swap it with `arr[j]`.
4. Increment `j` after every swap.
5. Continue until the end of the array.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

### File

- `MoveNegativeNumbers_QuickPartition.java`

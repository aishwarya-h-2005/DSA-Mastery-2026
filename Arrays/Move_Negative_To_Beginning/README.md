# Move All Negative Numbers to Beginning and Positive Numbers to End

## Problem Statement

Given an array containing both positive and negative numbers, rearrange the array so that all negative numbers appear before all positive numbers.

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

## Approach Used

### Sorting

1. Sort the array using `Arrays.sort()`.
2. After sorting, all negative numbers come before positive numbers.

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

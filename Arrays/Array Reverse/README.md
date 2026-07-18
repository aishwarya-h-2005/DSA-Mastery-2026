# Array Reverse

## Problem Statement
Reverse an array such that the first element becomes the last, the second becomes the second last, and so on.

## Example

Input:
```
[1, 4, 3, 2, 6, 5]
```

Output:
```
[5, 6, 2, 3, 4, 1]
```

## Approaches

### 1. Temporary Array
- Uses an extra array to store elements in reverse order.
- Time Complexity: **O(n)**
- Space Complexity: **O(n)**

**File:** `ArrayReverse_TempArray.java`

### 2. Two Pointers (Optimized)
- Swaps the first and last elements, then moves both pointers toward the center.
- Time Complexity: **O(n)**
- Space Complexity: **O(1)**

**File:** `ArrayReverse_TwoPointers.java`

### 3. Single Pointer

- Iterate only through the first half of the array.
- Swap each element with its corresponding element from the end.
**Time Complexity:** O(n)
**Space Complexity:** O(1)

**File:** `ArrayReverse_SinglePointer.java`

## Language
Java

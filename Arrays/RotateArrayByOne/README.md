# Rotate Array By One

## Problem Statement

Given an array, the task is to cyclically right-rotate the array by one position.

### Example 1

**Input**

```text
arr = [1, 2, 3, 4, 5]
```

**Output**

```text
[5, 1, 2, 3, 4]
```

### Example 2

**Input**

```text
arr = [2, 3, 4, 5, 1]
```

**Output**

```text
[1, 2, 3, 4, 5]
```

---

# Approach 1: Shifting Each Element

### Algorithm

1. Store the last element of the array.
2. Shift all elements one position to the right.
3. Place the stored last element at the first position.
4. Print the rotated array.

### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**

### File

- `RotateArrayByOne_Shifting.java`

---

# Approach 2: Reversal Algorithm

### Algorithm

1. Reverse the entire array.
2. Reverse the elements from index `1` to `n-1`.
3. Print the rotated array.

### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**

### File

- `RotateArrayByOne_Reversal.java`

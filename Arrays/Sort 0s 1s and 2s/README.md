# Sort an Array of 0s, 1s and 2s (Dutch National Flag Problem)

## Problem Statement

Given an array consisting only of **0s, 1s, and 2s**, sort the array so that all **0s come first**, followed by all **1s**, and then all **2s**.

### Example

**Input:**
```
arr = [0, 1, 2, 0, 1, 2]
```

**Output:**
```
0 0 1 1 2 2
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

- `Sort012_Sorting.java`

---

# Approach 2: Dutch National Flag Algorithm (Optimal)

### Algorithm

1. Initialize three pointers:
   - `low`
   - `mid`
   - `high`
2. Traverse the array once.
3. If the current element is:
   - **0** → Swap with `low`, increment `low` and `mid`.
   - **1** → Increment `mid`.
   - **2** → Swap with `high`, decrement `high`.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

### File

- `Sort012_DutchNationalFlag.java`

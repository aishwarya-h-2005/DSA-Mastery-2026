# Union of Two Arrays

## Problem Statement

Given two arrays `a[]` and `b[]`, return the union of both arrays.

The union contains all **distinct elements** that are present in either array.

### Example

**Input**

```
a = [1, 2, 3, 2, 1]
b = [3, 2, 2, 3, 3, 2]
```

**Output**

```
[1, 2, 3]
```

---

# Approach: HashSet

### Algorithm

1. Create an empty `HashSet`.
2. Add all elements of the first array into the `HashSet`.
3. Add all elements of the second array into the same `HashSet`.
4. Print the `HashSet`.

Since a `HashSet` stores only unique elements, duplicates are automatically removed.

### Time Complexity

```
O(n + m)
```

### Space Complexity

```
O(n + m)
```

### File

- `Union_HashSet.java`

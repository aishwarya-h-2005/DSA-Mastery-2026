# Intersection of Two Arrays

## Problem Statement

Given two arrays `a[]` and `b[]` with distinct elements, find the intersection (common elements) of both arrays. The output can be returned in any order.

### Example

**Input**

```
a = [5, 6, 2, 1, 4]
b = [7, 9, 4, 2]
```

**Output**

```
4 2
```

---

## Approach: HashSet

### Algorithm

1. Create an empty `HashSet`.
2. Add all elements of the first array into the `HashSet`.
3. Traverse the second array.
4. If an element exists in the `HashSet`, print it.
5. Remove the element from the `HashSet` to avoid duplicates.

### Time Complexity

```
O(n + m)
```

### Space Complexity

```
O(n)
```

### File

- `Intersection_HashSet.java`

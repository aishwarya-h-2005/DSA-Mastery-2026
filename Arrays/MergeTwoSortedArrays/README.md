# Merge Two Sorted Arrays

## Problem Statement

Given two sorted arrays `arr1[]` and `arr2[]`, merge them so that:

- `arr1[]` contains the first **n smallest** elements.
- `arr2[]` contains the remaining **m largest** elements.

Both arrays should remain sorted after merging.

---

## Example

**Input**

```text
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]
```

**Output**

```text
arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]
```

---

# Approach (Naive)

### Algorithm

1. Create a new array `merged` of size `n + m`.
2. Copy all elements of `arr1` into `merged`.
3. Copy all elements of `arr2` into `merged`.
4. Sort the `merged` array.
5. Copy the first `n` elements back to `arr1`.
6. Copy the remaining `m` elements back to `arr2`.
7. Print both arrays.

---

## Time Complexity

**O((n + m) log(n + m))**

---

## Space Complexity

**O(n + m)**

---

## Java File

`MergeTwoSortedArrays_Naive.java`

# Median of Two Sorted Arrays (Same Size)

## Problem Statement

Given two sorted arrays `a[]` and `b[]`, each of size `n`, find the median of the array obtained after merging both arrays.

**Note:**
- Both arrays are already sorted.
- Since the merged array always has an even number of elements (`2n`), the median is the average of the two middle elements.

---

## Examples

### Example 1

**Input**

```text
a = [1, 12, 15, 26, 38]
b = [2, 13, 17, 30, 45]
```

**Output**

```text
16
```

**Explanation**

Merged array:

```text
[1, 2, 12, 13, 15, 17, 26, 30, 38, 45]
```

Middle elements are `15` and `17`.

Median = `(15 + 17) / 2 = 16`

---

### Example 2

**Input**

```text
a = [10]
b = [21]
```

**Output**

```text
15.5
```

**Explanation**

Merged array:

```text
[10, 21]
```

Median = `(10 + 21) / 2 = 15.5`

---

# Approach (Naive)

## Algorithm

1. Create a new array `merge[]` of size `n1 + n2`.
2. Copy all elements of the first array into `merge[]`.
3. Copy all elements of the second array into `merge[]`.
4. Sort the merged array.
5. Find the two middle indices:
   - `mid1 = length / 2 - 1`
   - `mid2 = length / 2`
6. Calculate the median using:

   ```text
   (merge[mid1] + merge[mid2]) / 2.0
   ```

7. If the median is a whole number, print it as an integer; otherwise, print the decimal value.

---

## Time Complexity

**O(n log n)**

- Merging arrays: **O(n)**
- Sorting: **O(n log n)**
- Finding median: **O(1)**

Overall: **O(n log n)**

---

## Space Complexity

**O(n)**

A new merged array of size `2n` is used.

---

## Java File

`MedianOfTwoSortedArrays_Naive.java`

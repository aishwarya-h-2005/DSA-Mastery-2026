# Overlapping Intervals

## Problem Statement

Given an array of time intervals where `arr[i] = [starti, endi]`, merge all overlapping intervals and return only the mutually exclusive intervals.

---

## Example 1

**Input:**
```text
arr = [[1,3], [2,4], [6,8], [9,10]]
```

**Output:**
```text
1 4
6 8
9 10
```

**Explanation:**

- [1,3] and [2,4] overlap, so they are merged into [1,4].
- [6,8] and [9,10] do not overlap.

---

## Example 2

**Input:**
```text
arr = [[7,8], [1,5], [2,4], [4,6]]
```

**Output:**
```text
1 6
7 8
```

**Explanation:**

After sorting:

```text
[1,5] [2,4] [4,6] [7,8]
```

The first three intervals overlap and merge into:

```text
[1,6]
```

The last interval remains unchanged.

---

## Approach (Checking Last Merged Interval)

1. Sort all intervals based on their starting time.
2. Add the first interval to the result.
3. Traverse the remaining intervals.
4. Compare the current interval with the last merged interval.
5. If they overlap, update the ending point.
6. Otherwise, add the current interval as a new interval.

---

## Time Complexity

- Sorting: **O(n log n)**
- Traversing intervals: **O(n)**

**Overall:** `O(n log n)`

---

## Space Complexity

**O(n)**

---

## Java Solution

File:
```text
OverlappingIntervals_LastMergedInterval.java
```

---

## Output

```text
1 6
7 8
```

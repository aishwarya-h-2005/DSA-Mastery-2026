# Jump Game - Minimum Jumps to Reach End

## Problem Statement

Given an array `arr[]`, where each element represents the **maximum number of steps** you can jump from that index, find the **minimum number of jumps** required to reach the last index.

If it is not possible to reach the last index, return **-1**.

---

## Example 1

**Input**

```text
arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
```

**Output**

```text
3
```

---

## Example 2

**Input**

```text
arr = [1, 4, 3, 2, 6, 7]
```

**Output**

```text
2
```

---

## Example 3

**Input**

```text
arr = [0, 10, 20]
```

**Output**

```text
-1
```

---

# Approach

## Greedy Approach

### Algorithm

1. Initialize `jumps`, `maxReach`, and `currentReach`.
2. Traverse the array.
3. Update the farthest reachable index.
4. When the current range ends, increase the jump count.
5. Update the current range.
6. If the last index is reached, return the answer.
7. If the last index cannot be reached, return `-1`.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(1)**

---

## Java File

`JumpGame_MinimumJumps.java`

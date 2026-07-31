# Print All Duplicate Characters in a String

## Problem Statement

Given a string `s`, print all characters that appear more than once along with their frequency.

### Example 1

**Input**
```text
geeksforgeeks
```

**Output**
```text
['e',4]
['g',2]
['k',2]
['s',2]
```

### Example 2

**Input**
```text
programming
```

**Output**
```text
['g',2]
['m',2]
['r',2]
```

---

## Approach 1 - Using Sorting

### Algorithm

1. Convert the string into a character array.
2. Sort the character array.
3. Initialize `count = 1`.
4. Traverse the sorted array.
5. If the current character is the same as the previous character, increment `count`.
6. Otherwise:
   - If `count > 1`, print the previous character and its frequency.
   - Reset `count = 1`.
7. After the loop, print the last character if its count is greater than 1.

---

## Time Complexity

- **O(n log n)**

---

## Auxiliary Space

- **O(n)** (Character array created using `toCharArray()`)

---

## Java Solution

See `Using Sorting.java`.

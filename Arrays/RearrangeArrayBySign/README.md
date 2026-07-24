# Rearrange Array by Sign

## Problem Statement

Given an array `arr[]` of size `n`, rearrange the elements so that positive and negative numbers appear alternately while preserving their original relative order.

- The rearranged array should always start with a positive number.
- If there are extra positive or negative numbers, place them at the end.
- `0` is considered a positive number.

---

## Example 1

### Input

```text
arr = [1, 2, 3, -4, -1, 4]
```

### Output

```text
arr = [1, -4, 2, -1, 3, 4]
```

### Explanation

Positive numbers:

```text
[1, 2, 3, 4]
```

Negative numbers:

```text
[-4, -1]
```

Rearranging alternately:

```text
1, -4, 2, -1
```

Remaining positive numbers:

```text
3, 4
```

Final array:

```text
[1, -4, 2, -1, 3, 4]
```

---

## Example 2

### Input

```text
arr = [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
```

### Output

```text
arr = [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
```

---

# Approach (Using Separate Positive and Negative Arrays)

## Algorithm

1. Create two temporary arrays:
   - `pos[]` to store positive numbers.
   - `neg[]` to store negative numbers.
2. Traverse the original array and store positive and negative numbers separately.
3. Use three pointers:
   - `p` → reads from `pos[]`
   - `q` → reads from `neg[]`
   - `r` → writes into the original array
4. Place one positive element followed by one negative element alternately.
5. If positive elements remain, copy them to the end.
6. If negative elements remain, copy them to the end.
7. Print the rearranged array.

---

## Time Complexity

**O(n)**

---

## Space Complexity

**O(n)**

---

## Java File

`RearrangeArrayBySign.java`

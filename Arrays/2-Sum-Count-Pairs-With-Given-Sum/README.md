# Count Pairs with Given Sum

## Problem Statement

Given an integer array `arr[]` and a target value, count the number of pairs whose sum is equal to the given target.

A pair `(arr[i], arr[j])` is considered valid if:

- `i < j`
- `arr[i] + arr[j] == target`

Return the total number of such pairs.

---

## Example

### Input

```text
arr = [1, 5, 7, -1, 5]
target = 6
```

### Output

```text
3
```

### Explanation

The valid pairs are:

- (1, 5)
- (7, -1)
- (1, 5)

Therefore, the total number of pairs is **3**.

---

# Approach 1 (Naive)

## Algorithm

1. Initialize `count = 0`.
2. Use two nested loops to generate all possible pairs.
3. For every pair, check whether `arr[i] + arr[j] == target`.
4. If the condition is true, increment `count`.
5. After checking all pairs, print the final count.

### Time Complexity

**O(n²)**

### Space Complexity

**O(1)**

### Java File

`CountPairsWithGivenSum_Naive.java`

---

# Approach 2 (Optimal - HashMap)

## Algorithm

1. Create a `HashMap` to store the frequency of elements.
2. Traverse the array one element at a time.
3. Calculate the complement:
   ```
   complement = target - arr[i]
   ```
4. If the complement exists in the HashMap, add its frequency to the answer.
5. Store the current element in the HashMap by increasing its frequency.
6. Continue until all elements are processed.
7. Print the final count.

### Time Complexity

**O(n)**

### Space Complexity

**O(n)**

### Java File

`CountPairsWithGivenSum_HashMap.java`

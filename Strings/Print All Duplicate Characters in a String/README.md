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
['e',4], ['g',2], ['k',2], ['s',2]
```

### Example 2

**Input**
```text
programming
```

**Output**
```text
['r',2], ['g',2], ['m',2]
```

---

# Approach 1 - Using Sorting

## Idea

Convert the string into a character array and sort it. After sorting, duplicate characters become adjacent. Traverse the sorted array, count consecutive duplicate characters, and print those whose count is greater than one.

## Algorithm

1. Convert the string into a character array.
2. Sort the character array.
3. Traverse the sorted array.
4. Count consecutive duplicate characters.
5. Print the character and its frequency.
6. Print the last duplicate group after the loop.

### Time Complexity

**O(n log n)**

### Auxiliary Space

**O(n)**

---

# Approach 2 - Using Hashing

## Idea

Count how many times each character appears using a HashMap, which provides efficient lookups and updates. Traverse the string once to store the frequency of every character. Finally, print only those characters whose frequency is greater than one.

This approach avoids sorting and achieves linear time complexity, making it suitable for large strings.

## Algorithm

1. Create a HashMap to store character frequencies.
2. Traverse the string.
3. If the character already exists, increment its frequency.
4. Otherwise, insert it with frequency `1`.
5. Traverse the HashMap.
6. Print all characters whose frequency is greater than `1`.

### Time Complexity

**O(n)**

### Auxiliary Space

**O(k)**

Where `k` is the number of distinct characters.

> **Note:** If the input contains only lowercase English letters, the auxiliary space can be considered **O(26)**, which is constant **O(1)**.

---

## Java Solutions

- `Using Sorting.java`
- `Using Hashing.java`

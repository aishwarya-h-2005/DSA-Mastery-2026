# Array Reverse

## Problem Statement
Reverse an array such that the first element becomes the last, the second becomes the second last, and so on.

### Example

**Input**
```
[1, 4, 3, 2, 6, 5]
```

**Output**
```
[5, 6, 2, 3, 4, 1]
```

## Approach
- Create a temporary array of the same size.
- Copy the elements from the original array into the temporary array in reverse order.
- Copy the elements from the temporary array back into the original array.

## Time Complexity
**O(n)**

## Space Complexity
**O(n)**

## Language
Java

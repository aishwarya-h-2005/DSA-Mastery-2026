# Stock Buy and Sell (Maximum One Transaction)

## Problem Statement

Given an array `prices[]` where each element represents the stock price on a particular day, find the maximum profit that can be earned by performing **at most one transaction** (one buy and one sell).

**Note:**
- You must buy the stock before selling it.
- If no profit can be made, return `0`.

---

## Example

### Input

```text
prices = [7, 10, 1, 3, 6, 9, 2]
```

### Output

```text
8
```

### Explanation

Buy the stock at price **1** and sell it at price **9**.

Profit = **9 - 1 = 8**

---

# Approach 1 (Naive)

## Algorithm

1. Initialize `result = 0`.
2. Choose each day as the buying day.
3. Compare it with every following day as the selling day.
4. Calculate the profit:
   ```
   prices[j] - prices[i]
   ```
5. Update the maximum profit using `Math.max()`.
6. Print the maximum profit.

### Time Complexity

**O(n²)**

### Space Complexity

**O(1)**

### Java File

`StockBuySell_Naive.java`

---

# Approach 2 (Optimized)

## Algorithm

1. Assume the first day's price is the buying price.
2. Traverse the array from left to right.
3. If the current price is greater than the buying price, calculate the profit and update the maximum profit.
4. Otherwise, update the buying price with the current smaller price.
5. Continue until the end of the array.
6. Print the maximum profit.

### Time Complexity

**O(n)**

### Space Complexity

**O(1)**

### Java File

`StockBuySell_Optimized.java`

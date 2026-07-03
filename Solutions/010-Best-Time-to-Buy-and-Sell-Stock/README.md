# Best Time to Buy and Sell Stock

## Pattern

Two Pointers

## Problem

Given an array `prices`, where `prices[i]` represents the price of a stock on day `i`, find the maximum profit that can be achieved by buying the stock on one day and selling it on a later day.

If no profit can be made, return `0`.

## Approach

Use two pointers:

* `left` represents the buying day.
* `right` represents the selling day.

Start `left` at index `0` and `right` at index `1`.

If the selling price is greater than the buying price, calculate the current profit and update the maximum profit.

If the current price is less than or equal to the buying price, move the `left` pointer to the current position because it provides a better buying price for future transactions.

Move the `right` pointer forward until the entire array has been processed.

## Time Complexity

`O(n)`

The array is traversed once.

## Space Complexity

`O(1)`

Only a constant number of variables are used.

## Key Learning

When looking for the maximum profit from a future value, keep track of the best earlier buying position.

If a cheaper price appears, it becomes the new buying price. This allows the problem to be solved in one traversal using the Two Pointers pattern.

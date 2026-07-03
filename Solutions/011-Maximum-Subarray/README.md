# Maximum Subarray

## Pattern

Kadane's Algorithm

## Problem

Given an integer array, find the contiguous subarray with the largest sum and return that sum.

## Approach

Keep track of:

* `currentSum` — the best sum ending at the current position.
* `maxSum` — the best sum found overall.

For each number, choose whether to continue the current subarray or start a new subarray from the current number.

Then update the maximum sum found so far.

## Time Complexity

`O(n)`

The array is traversed once.

## Space Complexity

`O(1)`

Only a constant number of variables are used.

## Key Learning

At every position, choose between continuing the current subarray and starting fresh. Keep track of the best result found overall.

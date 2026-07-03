# Find Pivot Index

## Pattern

Prefix Sum

## Problem

Find the index where the sum of all elements on the left is equal to the sum of all elements on the right.

## Approach

First, calculate the total sum of the array.

Then traverse the array while maintaining a left sum.

For each index, calculate the right sum:

rightSum = totalSum - leftSum - current element

If the left sum equals the right sum, return the current index.

If no pivot index exists, return -1.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

The total sum can be used with a running left sum to calculate the right sum without creating separate prefix and suffix arrays.
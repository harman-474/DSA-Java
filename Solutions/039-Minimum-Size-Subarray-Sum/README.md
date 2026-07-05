# Minimum Size Subarray Sum

## Pattern

Sliding Window

## Problem

Given an array of positive integers and a target value, find the minimum length of a contiguous subarray whose sum is greater than or equal to the target.

Return `0` if no valid subarray exists.

## Approach

Use a variable-size sliding window.

Expand the window by moving `right` and adding each number to the current sum.

When the sum reaches or exceeds the target:

* Record the current window length
* Remove the leftmost number
* Move `left` forward
* Continue shrinking while the sum is still valid

## Time Complexity

`O(n)`

Each element enters and leaves the window at most once.

## Space Complexity

`O(1)`

Only a few variables are used.

## Key Learning

For a minimum-size window:

**Expand until valid. Shrink while valid.**

Use a `while` loop to keep shrinking the window as long as the condition remains satisfied.

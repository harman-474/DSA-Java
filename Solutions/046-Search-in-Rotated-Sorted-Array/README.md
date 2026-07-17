# Search in Rotated Sorted Array

## Pattern

Binary Search

## Problem

Given a rotated sorted array with distinct values, return the index of the target.

If the target does not exist, return `-1`.

## Approach

Use Binary Search.

At every step, one half of the array must be sorted.

* Check whether the left half is sorted.
* If the target lies inside that half, search left.
* Otherwise, search right.
* If the left half is not sorted, the right half must be sorted.
* Check whether the target lies inside it and choose the correct side.

## Time Complexity

`O(log n)`

## Space Complexity

`O(1)`

## Key Learning

In a rotated sorted array, at least one side of the middle element is always sorted.

Find the sorted half, check whether the target belongs inside it, and discard the other half.

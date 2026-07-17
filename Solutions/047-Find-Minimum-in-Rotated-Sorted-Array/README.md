# Find Minimum in Rotated Sorted Array

## Pattern

Binary Search

## Problem

Given a rotated sorted array with distinct values, return the minimum element.

## Approach

Use Binary Search.

Compare `nums[mid]` with `nums[right]`.

* If `nums[mid] > nums[right]`, the minimum must be to the right of `mid`.
* Otherwise, the minimum is at `mid` or to its left.

Keep shrinking the search area until `left == right`.

## Time Complexity

`O(log n)`

## Space Complexity

`O(1)`

## Key Learning

Compare the middle element with the rightmost element to determine which side contains the minimum.

Use `right = mid` because `mid` itself could be the minimum.

# Remove Duplicates from Sorted Array II

## Pattern

Two Pointers

## Problem

Given a sorted integer array, modify it in-place so that each number appears at most twice.

Return the number of valid elements.

## Approach

Keep the first two elements.

For every remaining element, compare it with the element two positions behind in the valid portion of the array.

If they are different, keep the current element.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

To allow at most two copies of each number, compare the current number with `nums[k - 2]`.

If they are equal, the current number would be a third copy, so skip it.
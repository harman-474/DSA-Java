# Binary Search

## Pattern

Binary Search

## Problem

Given a sorted integer array `nums` and a `target`, return the index of the target.

If the target does not exist, return `-1`.

## Approach

Keep two pointers:

* `left` at the beginning
* `right` at the end

Check the middle element.

* If it equals the target, return its index.
* If it is smaller than the target, search the right half.
* If it is larger than the target, search the left half.

Repeat until the search area becomes empty.

## Time Complexity

O(log n)

The search area is cut in half after every step.

## Space Complexity

O(1)

Only a few variables are used.

## Key Learning

Check the middle.

Discard half.

Repeat.

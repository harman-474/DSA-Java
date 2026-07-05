# Search Insert Position

## Pattern

Binary Search

## Problem

Given a sorted integer array `nums` and a `target`, return the target's index if it exists.

If it does not exist, return the index where it should be inserted.

## Approach

Use Binary Search.

* If the target is found, return `mid`.
* If the target is smaller, search the left half.
* If the target is larger, search the right half.

If the target is not found, `left` ends at the exact position where the target should be inserted.

## Time Complexity

O(log n)

The search area is cut in half after every step.

## Space Complexity

O(1)

Only a few variables are used.

## Key Learning

Normal Binary Search:

Target not found → return `-1`.

Search Insert Position:

Target not found → return `left`.

# Find All Numbers Disappeared in an Array

## Pattern

Index Marking

## Problem

Find all numbers missing from an array containing values from `1` to `n`.

## Approach

Use each number to mark its matching index as negative.

For each number:

1. Find its matching index using `Math.abs(number) - 1`.
2. Make the value at that index negative.

After marking, any index that still contains a positive value represents a missing number.

## Time Complexity

O(n)

## Space Complexity

O(1) extra space

## Key Learning

When values are in the range `1` to `n`, the input array itself can be used to track which numbers have appeared.
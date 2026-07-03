# Rotate Array

## Pattern

Array Reversal

## Problem

Rotate an array to the right by `k` positions.

## Approach

First reduce `k` using modulo so it stays within the array length.

Then:

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining elements.

This moves the last `k` elements to the front without using another array.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

An array can be rotated in-place using three reversals.
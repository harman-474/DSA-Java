# Two Sum II - Input Array Is Sorted

## Pattern

Two Pointers

## Problem

Given a sorted integer array, find two numbers whose sum equals the target.

Return their 1-based positions.

## Approach

Use two pointers at the beginning and end of the sorted array.

If the sum is too small, move the left pointer right.

If the sum is too large, move the right pointer left.

When the sum equals the target, return both positions.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

In a sorted array, two pointers can find a target sum without using extra space.
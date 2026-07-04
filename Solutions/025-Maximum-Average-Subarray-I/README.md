# Maximum Average Subarray I

## Pattern

Sliding Window

## Problem

Given an integer array and a number `k`, find the contiguous subarray of exactly `k` elements with the maximum average.

## Approach

Calculate the sum of the first window of size `k`.

Slide the window through the array by removing the element leaving the window and adding the new element entering it.

Track the maximum window sum and divide it by `k`.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

For a fixed-size window, reuse the previous sum instead of recalculating every group.

Remove what leaves and add what enters.
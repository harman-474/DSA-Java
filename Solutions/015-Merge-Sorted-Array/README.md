# Merge Sorted Array

## Pattern

Two Pointers

## Problem

Merge two sorted arrays into nums1 while keeping the final array sorted.

## Approach

Start three pointers from the end.

Compare the last remaining numbers in nums1 and nums2.

Place the bigger number at the last available position in nums1 and move backward.

Continue until all numbers from nums2 have been placed.

## Time Complexity

O(m + n)

## Space Complexity

O(1)

## Key Learning

When an array has empty space at the end, merging backward prevents existing values from being overwritten.
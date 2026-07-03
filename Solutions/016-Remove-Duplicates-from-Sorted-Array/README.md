# Remove Duplicates from Sorted Array

## Pattern

Two Pointers

## Problem

Remove duplicates from a sorted array in place and return the number of unique elements.

## Approach

Use one pointer to track the last unique element and another pointer to scan the array.

When a different value is found, move the unique pointer forward and place the new value there.

Return the number of unique elements.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

In a sorted array, duplicates are next to each other, so two pointers can keep only the unique values in place.
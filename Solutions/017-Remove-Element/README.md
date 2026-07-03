# Remove Element

## Pattern

Two Pointers

## Problem

Remove all occurrences of a given value from an array in place and return the number of remaining elements.

## Approach

Use one pointer to track where the next kept element should be placed.

Scan through the array.

If the current element is not equal to the value being removed, copy it to the next available position and move the pointer forward.

Return the number of kept elements.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

A write pointer can both track the next position for a kept element and count how many elements remain.
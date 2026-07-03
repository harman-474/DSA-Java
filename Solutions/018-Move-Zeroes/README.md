# Move Zeroes

## Pattern

Two Pointers

## Problem

Move all zeroes to the end of the array while keeping the non-zero elements in their original order.

## Approach

Use a pointer to track where the next non-zero element should be placed.

First, move all non-zero elements to the beginning of the array.

Then fill the remaining positions with zeroes.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

A write pointer can move selected elements forward, and the remaining positions can be filled afterward.
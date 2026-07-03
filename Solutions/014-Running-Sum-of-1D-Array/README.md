# Running Sum of 1D Array

## Pattern

Prefix Sum

## Problem

Return an array where each element is the sum of all elements from the start of the array up to the current index.

## Approach

Start from index 1.

Add the previous running sum to the current element.

Update the same array and return it.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

A running sum can be built by adding the previous accumulated value to the current element.
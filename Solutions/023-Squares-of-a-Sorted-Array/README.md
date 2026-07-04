# Squares of a Sorted Array

## Pattern

Two Pointers

## Problem

Given a sorted integer array, square each number and return the squares in sorted order.

## Approach

Use two pointers at the beginning and end of the array.

Compare the squares of both values. Place the larger square at the end of the result array and move the corresponding pointer inward.

Continue until all positions are filled.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Key Learning

In a sorted array containing negative numbers, the largest square can come from either end.

Compare both ends and fill the result array from right to left.
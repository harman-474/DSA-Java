# Maximum Product Subarray

## Pattern

Kadane's Algorithm Variation

## Problem

Given an integer array, find the contiguous subarray with the largest product and return that product.

## Approach

Track both:

* `currentMax` — the largest product ending at the current position.
* `currentMin` — the smallest product ending at the current position.

Both are needed because multiplying a negative number by a negative product can create a new maximum positive product.

At every position, compare:

* Starting fresh from the current number.
* Multiplying the current number by the previous maximum product.
* Multiplying the current number by the previous minimum product.

Update the maximum product found so far.

## Time Complexity

`O(n)`

The array is traversed once.

## Space Complexity

`O(1)`

Only a constant number of variables are used.

## Key Learning

When multiplication and negative numbers are involved, track both the maximum and minimum values because a negative value can become the next maximum after multiplication by another negative number.

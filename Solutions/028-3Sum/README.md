# 3Sum

## Pattern

Sorting + Two Pointers

## Problem

Given an integer array, find all unique triplets whose sum is `0`.

Duplicate triplets must not be included.

## Approach

Sort the array.

Fix one number, then use two pointers to find two more numbers whose total sum with the fixed number is `0`.

Move the pointers based on whether the sum is too small or too large.

Skip duplicate values to avoid duplicate triplets.

## Time Complexity

O(n²)

## Space Complexity

O(1) excluding the result

## Key Learning

Fix one number and reduce the remaining problem to a two-pointer search.

When duplicate answers are not allowed, skip repeated values after sorting.
# Missing Number

## Pattern

Expected Sum

## Problem

Find the one missing number from a range containing numbers from `0` to `n`.

## Approach

Calculate the expected sum of all numbers from `0` to `n`.

Then calculate the actual sum of the numbers in the array.

The difference between the expected sum and the actual sum is the missing number.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

When one number is missing from a known range, compare the expected total with the actual total.
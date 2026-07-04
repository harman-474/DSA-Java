# Sort Colors

## Pattern

Dutch National Flag Algorithm

## Problem

Given an array containing only `0`, `1`, and `2`, sort it in-place without using a built-in sorting method.

## Approach

Use three pointers:

- `low` for the next position of `0`
- `mid` for the current element
- `high` for the next position of `2`

If `mid` sees `0`, move it left.

If `mid` sees `1`, move forward.

If `mid` sees `2`, move it right.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

Use three pointers to divide the array into:

0s | 1s | unknown | 2s

When swapping a `2` with `high`, do not move `mid` because the new element at `mid` still needs to be checked.
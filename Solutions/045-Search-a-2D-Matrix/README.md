# Search a 2D Matrix

## Pattern

Binary Search

## Problem

Given a matrix where each row is sorted and the first element of each row is greater than the last element of the previous row, determine whether a target value exists in the matrix.

## Approach

Treat the entire matrix as one sorted array.

Use Binary Search with indices from `0` to `rows * cols - 1`.

Convert the middle index into a matrix position:

* `row = mid / cols`
* `col = mid % cols`

Compare `matrix[row][col]` with the target and continue Binary Search.

## Time Complexity

`O(log(m × n))`

## Space Complexity

`O(1)`

## Key Learning

A sorted 2D matrix can be treated as one sorted 1D array without actually creating a new array.

Convert a 1D index into a matrix position using division and modulo.

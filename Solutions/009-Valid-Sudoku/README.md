# Valid Sudoku

## Pattern

HashSet + Matrix Traversal

## Problem

Given a 9×9 Sudoku board, determine whether it is valid according to Sudoku rules.

A valid board must satisfy:

* Each row contains unique digits.
* Each column contains unique digits.
* Each 3×3 sub-box contains unique digits.

Empty cells are represented by `'.'`.

## Approach

* Traverse every row using a `HashSet` to detect duplicates.
* Traverse every column using another `HashSet`.
* Traverse each 3×3 box using nested loops and a fresh `HashSet`.
* Ignore empty cells (`'.'`).
* If any duplicate is found, return `false`.
* If all checks pass, return `true`.

## Time Complexity

**O(1)**

> The board size is fixed at 9×9, so the number of operations is constant. (It can also be viewed as **O(n²)** for a generalized `n × n` board.)

## Space Complexity

**O(1)**

> At most, each `HashSet` stores digits `1`–`9`.

## Key Learning

This problem combines **Matrix Traversal** with **HashSet** to efficiently validate rows, columns, and 3×3 sub-boxes without repeated comparisons.

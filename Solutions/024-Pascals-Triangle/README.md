# Pascal's Triangle

## Pattern

ArrayList / Simulation

## Problem

Given a number of rows, generate the first `numRows` of Pascal's Triangle.

## Approach

Build the triangle one row at a time.

Each row starts and ends with `1`.

Every middle number is created by adding the two numbers above it from the previous row.

## Time Complexity

O(n²)

## Space Complexity

O(n²)

## Key Learning

When building a result step by step, previously created rows can be used to create the next row.
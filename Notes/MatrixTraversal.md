# Matrix Traversal

## What is it?

Matrix Traversal is the process of visiting elements in a 2D array (matrix) using row and column indices.

## Why Use It?

Many interview problems involve grids, boards, or matrices. Efficient traversal is the foundation for solving these problems.

## Accessing Elements

For a matrix:

```java
char[][] board;
```

An element is accessed using:

```java
board[row][column]
```

Example:

```java
board[2][5]
```

This accesses the element at row 2, column 5.

## Common Traversal

```java
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[0].length; col++) {
        // Process matrix[row][col]
    }
}
```

## Common Uses

* Sudoku
* Number of Islands
* Flood Fill
* Spiral Matrix
* Word Search

## Time Complexity

Traversing an `m × n` matrix:

**O(m × n)**

## Space Complexity

**O(1)** extra space (excluding any auxiliary data structures).

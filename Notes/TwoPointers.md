# Two Pointers

## What is it?

The Two Pointers technique uses two indices to traverse the same array or string efficiently. Each pointer has a different responsibility, allowing many problems to be solved in a single pass.

## Why Use It?

* Reduces unnecessary traversals.
* Often improves time complexity from **O(n²)** to **O(n)**.
* Commonly used for arrays and strings.

## Common Types

### 1. Opposite Direction

One pointer starts from the beginning and the other from the end.

Example uses:

* Two Sum II (sorted array)
* Valid Palindrome
* Container With Most Water

### 2. Same Direction

Both pointers move from left to right, but at different speeds or with different roles.

Example uses:

* Remove Duplicates from Sorted Array
* String Compression
* Move Zeroes

## String Compression

In this problem:

* The **read pointer** scans each group of identical characters.
* The **write pointer** writes the compressed result back into the same array.

This allows the compression to be done **in-place** without using another character array.

## Time Complexity

Typically **O(n)**.

## Space Complexity

Typically **O(1)** extra space.

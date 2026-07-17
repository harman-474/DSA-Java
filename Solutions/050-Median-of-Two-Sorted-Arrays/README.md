# Median of Two Sorted Arrays

## Pattern

Binary Search + Partitioning

## Problem

Given two sorted arrays, return the median of the combined sorted elements without actually merging the arrays.

## Approach

Always perform Binary Search on the smaller array.

Partition both arrays so that:

* The left side contains half of the total elements.
* Every value on the left side is less than or equal to every value on the right side.

Check the values immediately around both partitions.

If the partition is correct:

* For an odd total length, return the largest value on the left.
* For an even total length, return the average of the largest value on the left and the smallest value on the right.

If the partition is incorrect, move the Binary Search left or right.

## Time Complexity

`O(log(min(m, n)))`

Where:

* `m` = length of the first array
* `n` = length of the second array

## Space Complexity

`O(1)`

## Key Learning

Two sorted arrays can be partitioned without merging them.

A correct partition satisfies:

`left1 <= right2`

and

`left2 <= right1`

Once the correct partition is found, the median comes directly from the values around the partition.

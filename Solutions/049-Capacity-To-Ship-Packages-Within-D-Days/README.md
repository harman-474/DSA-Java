# Capacity To Ship Packages Within D Days

## Pattern

Binary Search on Answer

## Problem

Given package weights in a fixed order and a number of days, find the minimum ship capacity needed to deliver all packages within the given days.

## Approach

Binary Search the possible ship capacities.

The minimum possible capacity is the weight of the heaviest package.

The maximum possible capacity is the total weight of all packages.

For each capacity, load packages in order and count the days needed.

* If too many days are needed, increase the capacity.
* If the packages can be shipped within the allowed days, try a smaller capacity.

## Time Complexity

`O(n log s)`

Where:

* `n` = number of packages
* `s` = range of possible capacities

## Space Complexity

`O(1)`

## Key Learning

Binary Search can find the smallest value that satisfies a condition.

Too many days → increase capacity.

Fits within the allowed days → try a smaller capacity.

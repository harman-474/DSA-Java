# Koko Eating Bananas

## Pattern

Binary Search on Answer

## Problem

Given several piles of bananas and a limited number of hours, find the minimum eating speed needed to finish all piles within the given time.

## Approach

Binary Search the possible eating speeds from `1` to the largest pile.

For each speed, calculate the total hours needed.

* If the required hours are within `h`, the speed works, so try a smaller speed.
* If the required hours exceed `h`, the speed is too slow, so try a faster speed.

Continue until the smallest working speed remains.

## Time Complexity

`O(n log m)`

Where:

* `n` = number of piles
* `m` = largest pile

## Space Complexity

`O(1)`

## Key Learning

Binary Search can be used on a range of possible answers, not only on arrays.

Too slow → search faster speeds.

Fast enough → try a smaller speed.

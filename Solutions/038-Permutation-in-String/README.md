# Permutation in String

## Pattern

Sliding Window + Character Frequency Array

## Problem

Given two strings `s1` and `s2`, determine whether `s2` contains a permutation of `s1`.

A permutation contains the same characters with the same frequencies, possibly in a different order.

## Approach

Create two frequency arrays of size 26:

* One for the characters in `s1`
* One for the current window in `s2`

The window size is always equal to the length of `s1`.

Compare both frequency arrays. If they are equal, a permutation exists.

As the window moves:

* Add the new character entering the window
* Remove the old character leaving the window

Return `true` if any window has the same character frequencies as `s1`. Otherwise, return `false`.

## Time Complexity

`O(n)`

Where `n` is the length of `s2`.

## Space Complexity

`O(1)`

The two frequency arrays always have a fixed size of 26.

## Key Learning

A permutation can be detected by comparing character frequencies instead of character order.

Convert lowercase characters to array indexes using:

`character - 'a'`

So:

* `'a'` → `0`
* `'b'` → `1`
* ...
* `'z'` → `25`

For a fixed-size sliding window:

**Add what enters. Remove what leaves.**

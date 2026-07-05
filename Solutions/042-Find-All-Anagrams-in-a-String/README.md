# Find All Anagrams in a String

## Pattern

Sliding Window + Character Frequency Array

## Problem

Given two strings `s` and `p`, return the starting indices of all substrings in `s` that are anagrams of `p`.

## Approach

Create frequency arrays for:

* The characters in `p`
* The current window in `s`

The window size is always equal to `p.length()`.

For each new character:

* Add the character entering the window.
* Remove the character leaving the window.
* Compare both frequency arrays.
* If they are equal, save the window's starting index.

## Time Complexity

O(n)

Each character is processed once. Comparing the two fixed-size arrays takes constant time because they always contain 26 positions.

## Space Complexity

O(1)

The two frequency arrays always have a fixed size of 26.

## Key Learning

For fixed-size anagram windows:

Add what enters.

Remove what leaves.

Same character counts = anagram found.

# Minimum Window Substring

## Pattern

Sliding Window + Character Frequency Array

## Problem

Given two strings `s` and `t`, find the smallest substring of `s` that contains all characters of `t`, including duplicates.

Return an empty string if no valid window exists.

## Approach

Count all required characters from `t`.

Expand the window by moving `right`.

When all required characters are present, shrink the window from the left while it remains valid.

Keep track of the smallest valid window found.

## Time Complexity

O(n)

## Space Complexity

O(1)

The frequency array has a fixed size of 128.

## Key Learning

Expand until the window contains all required characters.

Shrink while the window remains valid.

Use character counts to track what is still needed.

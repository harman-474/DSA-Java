# Longest Repeating Character Replacement

## Pattern

Sliding Window

## Problem

Given a string and an integer `k`, find the length of the longest substring that can be made of the same character using at most `k` replacements.

## Approach

Use a sliding window and count the frequency of each character.

Track the most frequent character in the current window.

The number of replacements needed is:

window size - most frequent character count

If the replacements needed exceed `k`, shrink the window from the left.

Track the longest valid window.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

The number of characters that need to be replaced is:

window size - most frequent character count

If this exceeds `k`, shrink the window.
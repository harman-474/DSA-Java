# Longest Substring Without Repeating Characters

## Pattern

Sliding Window

## Problem

Given a string, find the length of the longest substring without repeating characters.

## Approach

Use a sliding window with a HashSet.

Expand the window by moving the right pointer.

If a duplicate character appears, remove characters from the left until the duplicate is gone.

Track the maximum window length.

## Time Complexity

O(n)

## Space Complexity

O(n)

## Key Learning

When a duplicate appears, shrink the window from the left until every character is unique again.

The current window length is:

right - left + 1
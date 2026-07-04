# Merge Strings Alternately

## Pattern

String Building

## Problem

Given two strings, merge them by taking one character from each string alternately.

If one string is longer, append its remaining characters at the end.

## Approach

Use a `StringBuilder` to build the result.

Loop up to the length of the longer string.

At each index, append the character from each string if that index still exists.

## Time Complexity

O(n + m)

## Space Complexity

O(n + m)

## Key Learning

When building a string piece by piece, use `StringBuilder`.

Check each string's length separately when their sizes may be different.
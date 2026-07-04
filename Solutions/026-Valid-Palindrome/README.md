# Valid Palindrome

## Pattern

Two Pointers

## Problem

Given a string, determine whether it is a palindrome after ignoring non-alphanumeric characters and letter case.

## Approach

Use two pointers, one at the beginning and one at the end.

Skip characters that are not letters or digits.

Compare the remaining characters in lowercase. If they are different, return `false`.

Move both pointers inward until they meet.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

Two pointers can compare a string from both ends while skipping unwanted characters.
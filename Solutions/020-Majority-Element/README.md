# Majority Element

## Pattern

Boyer-Moore Voting Algorithm

## Problem

Find the element that appears more than half the time in the array.

## Approach

Track a candidate and its count.

If the count becomes zero, choose the current number as the new candidate.

Increase the count when the current number matches the candidate. Otherwise, decrease it.

Different elements cancel each other out, allowing the majority element to survive.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

When a majority element is guaranteed to exist, Boyer-Moore Voting finds it using constant extra space.
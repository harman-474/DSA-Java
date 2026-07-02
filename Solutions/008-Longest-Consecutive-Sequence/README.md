# Longest Consecutive Sequence

## Pattern

HashSet

## Problem

Given an unsorted integer array `nums`, return the length of the longest consecutive sequence.

The solution must run in **O(n)** time.

## Approach

* Store all numbers in a `HashSet` for fast lookups.
* Iterate through the set.
* Only start counting a sequence if the previous number (`num - 1`) does not exist.
* Continue checking consecutive numbers using the `HashSet`.
* Keep track of the maximum sequence length.

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

## Key Learning

This problem demonstrates how a **HashSet** can be used to achieve constant-time lookups and avoid sorting. The important optimization is to begin counting only from the start of each consecutive sequence.

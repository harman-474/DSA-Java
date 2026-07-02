# Contains Duplicate

## Pattern

Hashing (HashSet)

## Problem

Given an integer array, determine whether any value appears more than once. Return `true` if a duplicate exists; otherwise, return `false`.

## Approach

Use a `HashSet` to store the elements that have already been seen while traversing the array. If the current element already exists in the `HashSet`, return `true`. If the traversal completes without finding a duplicate, return `false`.

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

## Key Learning

Hash-based data structures allow fast lookups. When a problem asks whether you've already seen an element, consider using a `HashSet` or `HashMap`.

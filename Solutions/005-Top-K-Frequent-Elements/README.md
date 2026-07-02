# Top K Frequent Elements

## Pattern

Hashing (HashMap) + Priority Queue (Max Heap)

## Problem

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

## Approach

First, use a `HashMap` to count the frequency of each element. Then, use a `PriorityQueue` (Max Heap) to order elements by their frequencies. Finally, remove the top `k` elements from the queue and store them in the result array.

## Time Complexity

**O(n log n)**

## Space Complexity

**O(n)**

## Key Learning

Use a `HashMap` to count frequencies and a `PriorityQueue` to efficiently retrieve the most frequent elements.

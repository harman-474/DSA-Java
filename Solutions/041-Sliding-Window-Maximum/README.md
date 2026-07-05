# Sliding Window Maximum

## Pattern

Sliding Window + Monotonic Deque

## Problem

Given an integer array `nums` and a window size `k`, return the maximum value in every sliding window.

## Approach

Use a deque to store indices of useful elements.

For each element:

* Remove expired indices from the front.
* Remove smaller values from the back.
* Add the current index to the back.
* Once the first full window is formed, the front of the deque gives the maximum.

The deque keeps values in decreasing order.

## Time Complexity

O(n)

Each index is added once and removed at most once.

## Space Complexity

O(k)

The deque stores at most `k` indices.

## Key Learning

For Sliding Window Maximum:

* Front = current maximum
* Remove expired indices from the front
* Remove smaller values from the back
* Add the new index

The deque stores only useful candidates for the maximum.

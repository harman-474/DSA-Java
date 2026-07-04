# Container With Most Water

## Pattern

Two Pointers

## Problem

Given an array of heights, choose two lines that can hold the maximum amount of water.

## Approach

Use two pointers at both ends of the array.

Calculate the area using the distance between the pointers and the shorter of the two heights.

Track the maximum area.

Move the pointer with the shorter height inward because the shorter line limits the amount of water.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

The shorter line limits the container's height.

Move the shorter line inward to search for a taller line that may produce a larger area.
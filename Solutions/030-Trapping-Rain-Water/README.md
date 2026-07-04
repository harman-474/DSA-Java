# Trapping Rain Water

## Pattern

Two Pointers

## Problem

Given an array of bar heights, calculate how much rainwater can be trapped between the bars.

## Approach

Use two pointers at both ends of the array.

Track the tallest bar seen from the left and from the right.

Process the shorter side. If the current bar is shorter than the maximum seen from that side, the difference is trapped water.

Move inward until the pointers meet.

## Time Complexity

O(n)

## Space Complexity

O(1)

## Key Learning

A shorter bar can trap water when a taller boundary has already been found.

Track the tallest boundary from both sides and process the shorter side.
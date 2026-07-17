# Reverse Linked List

## Pattern

Linked List

## Problem

Given the head of a singly linked list, reverse the list and return the new head.

## Approach

Traverse the linked list using three pointers: `previous`, `current`, and `next`. For each node, save the next node, reverse the current node's pointer, move `previous` to the current node, and continue until the end of the list. Finally, return `previous` as the new head.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)**

## Key Learning

* How to reverse a linked list in-place.
* Importance of using three pointers to avoid losing the remaining list.
* Practice updating node references safely.

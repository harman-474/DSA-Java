# Merge Two Sorted Lists

## Pattern

Linked List

## Problem

Given the heads of two sorted singly linked lists, merge them into one sorted linked list and return its head.

## Approach

Create a dummy node and use a `current` pointer to build the merged list. Compare the current nodes of both lists, attach the smaller node to the merged list, and move that list forward. After one list is exhausted, attach the remaining nodes of the other list.

## Time Complexity

**O(m + n)**

## Space Complexity

**O(1)**

## Key Learning

* Merge two sorted linked lists efficiently.
* Use a dummy node to simplify pointer handling.
* Reuse existing nodes instead of creating new ones.

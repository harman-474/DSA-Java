# Two Sum

## Pattern

HashMap (Arrays & Hashing)

## Problem

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

---

## Approach

A `HashMap` is used to store each number and its index as we iterate through the array.

For every element:

1. Calculate the required complement using `target - currentNumber`.
2. Check whether the complement already exists in the `HashMap`.
3. If it exists, return the stored index and the current index.
4. Otherwise, store the current number and its index in the `HashMap`.

This avoids checking every possible pair and improves the solution from `O(n²)` to `O(n)`.

---

## Time Complexity

**O(n)**

Each element is processed once, and `HashMap` lookups are `O(1)` on average.

---

## Space Complexity

**O(n)**

In the worst case, the `HashMap` stores all elements.

---

## Key Learning

* Use a `HashMap` for fast lookups.
* Store previously seen values to avoid nested loops.
* Recognize the "complement" pattern (`target - currentValue`), which is common in coding interviews.

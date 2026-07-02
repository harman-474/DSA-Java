# Product of Array Except Self

## Pattern

Prefix & Suffix Products

## Problem

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The solution must run in **O(n)** time and must **not use division**.

## Approach

* Create an output array to store prefix products.
* Traverse from left to right to fill the prefix products.
* Traverse from right to left while maintaining a running suffix product.
* Multiply the prefix product by the suffix product for each index to obtain the final answer.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)** extra space (excluding the output array)

## Key Learning

This problem introduces the **Prefix & Suffix Product** pattern, where information from the left and right of each index is combined to produce the final result efficiently without using division.

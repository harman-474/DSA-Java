# Group Anagrams

## Pattern

Hashing (HashMap) + Sorting

## Problem

Given an array of strings, group all anagrams together and return them as a list of groups.

## Approach

For each string, sort its characters to create a common key. Use a `HashMap` where the key is the sorted string and the value is a list of all original strings that produce that key. Finally, return all the grouped lists.

## Time Complexity

**O(n × k log k)**

* `n` = number of strings
* `k` = average length of each string

## Space Complexity

**O(n × k)**

## Key Learning

Anagrams produce the same sorted string. A `HashMap` can efficiently group related items by using a common key.

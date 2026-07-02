# Valid Anagram

## Pattern

Hashing (HashMap)

## Problem

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`. Two strings are anagrams if they contain the same characters with the same frequencies.

## Approach

First, check if both strings have the same length. Then use a `HashMap` to count the frequency of each character in the first string. Traverse the second string and decrease the corresponding frequencies. If every character matches correctly, the map will be empty, indicating the strings are anagrams.

## Time Complexity

**O(n)**

## Space Complexity

**O(n)**

## Key Learning

A `HashMap` is useful for counting frequencies. Many interview problems involving counting characters or numbers can be solved efficiently using a frequency map.

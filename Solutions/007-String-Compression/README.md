# String Compression

## Pattern

Two Pointers

## Problem

Given a character array `chars`, compress it in-place by replacing consecutive repeated characters with the character followed by its count (only if the count is greater than 1). Return the new length of the compressed array.

## Approach

* Use two pointers:

  * **Read Pointer** to scan the array.
  * **Write Pointer** to overwrite the array with the compressed result.
* Count consecutive occurrences of each character.
* Write the character once.
* If the count is greater than 1, convert the count to a string and write each digit into the array.
* Return the position of the write pointer as the compressed length.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)** extra space

## Key Learning

This problem demonstrates the **Two Pointers** pattern for modifying an array in-place while maintaining constant extra space.

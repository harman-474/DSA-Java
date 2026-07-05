# Binary Search

## What is Binary Search?

Binary Search finds a target in a sorted array.

Instead of checking every number, it repeatedly removes half of the search area.

## Main Idea

Check the middle number.

- Target is smaller → search left half
- Target is bigger → search right half
- Target is equal → found

## Important Variables

`left` = start of the search area

`right` = end of the search area

`mid` = middle index

## Middle Index

```java
int mid = left + (right - left) / 2;
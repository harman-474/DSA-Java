# Prefix & Suffix Products

## What is it?

The Prefix & Suffix Product pattern is used when the answer for each index depends on the elements to its left and right.

Instead of recomputing products for every index, we build the result efficiently in linear time.

## Prefix Product

A prefix product at index `i` is the product of all elements before index `i`.

Example:

```
nums = [1, 2, 3, 4]

Prefix = [1, 1, 2, 6]
```

## Suffix Product

A suffix product at index `i` is the product of all elements after index `i`.

Example:

```
nums = [1, 2, 3, 4]

Suffix = [24, 12, 4, 1]
```

## Key Formula

```
Answer[i] = Prefix Product × Suffix Product
```

## Why Use It?

* Avoids nested loops.
* Reduces time complexity from **O(n²)** to **O(n)**.
* Commonly used when the answer depends on both the left and right sides of each element.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)** extra space when the output array is reused to store prefix products.

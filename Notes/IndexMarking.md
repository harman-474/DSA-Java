# Index Marking

## What Is It?

Index Marking uses the input array itself to remember which numbers have been seen.

It avoids using an extra HashSet or boolean array.

## Main Idea

When numbers are in the range `1` to `n`, each number can point to an index:

```text
number 1 → index 0
number 2 → index 1
number 3 → index 2
# Sliding Window

## What It Is

Sliding Window is a pattern used to process a continuous part of an array or string.

Instead of recalculating everything for every group, we update the current group as it moves.

## Core Idea

For a fixed-size window:

1. Calculate the first window.
2. Remove the element leaving the window.
3. Add the new element entering the window.

Example:

```text
[1, 2, 3, 4, 5]
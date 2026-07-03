# Kadane's Algorithm

## What Is Kadane's Algorithm?

Kadane's Algorithm is used to find the maximum sum of a contiguous subarray in an array.

A contiguous subarray contains elements that are next to each other in the original array.

Example:

```text
Array:

[-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

A valid contiguous subarray is:

```text
[4, -1, 2, 1]
```

Its sum is:

```text
4 + (-1) + 2 + 1 = 6
```

Kadane's Algorithm finds the maximum possible contiguous subarray sum in `O(n)` time.

---

## Core Idea

At every element, make one decision:

```text
Should I continue the current subarray?

OR

Should I start a new subarray from the current element?
```

Suppose:

```text
currentSum = -2
current element = 1
```

Continuing the old subarray gives:

```text
-2 + 1 = -1
```

Starting fresh gives:

```text
1
```

Since `1` is better than `-1`, start a new subarray.

This decision can be written as:

```java
currentSum = Math.max(nums[i], currentSum + nums[i]);
```

---

## Two Important Variables

Kadane's Algorithm usually uses two variables:

```text
currentSum
maxSum
```

### currentSum

Stores the maximum subarray sum that ends at the current position.

It answers:

```text
What is the best subarray I can have if it must end here?
```

### maxSum

Stores the best subarray sum found anywhere in the array so far.

It answers:

```text
What is the best answer I have seen overall?
```

---

## Algorithm

Start with the first element:

```text
currentSum = nums[0]
maxSum = nums[0]
```

Then move through the remaining elements.

For every element:

```text
currentSum = maximum of:

1. Start a new subarray from the current element.

2. Continue the previous subarray by adding the current element.
```

Then update:

```text
maxSum = maximum of:

1. Previous maximum sum.

2. Current subarray sum.
```

---

## Standard Pattern

```java
int currentSum = nums[0];
int maxSum = nums[0];

for (int i = 1; i < nums.length; i++) {

    currentSum = Math.max(nums[i], currentSum + nums[i]);
    maxSum = Math.max(maxSum, currentSum);
}
```

---

## Example

```text
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

Start:

```text
currentSum = -2
maxSum = -2
```

At `1`:

```text
Start new: 1
Continue:  -2 + 1 = -1

Choose: 1
```

So:

```text
currentSum = 1
maxSum = 1
```

At `-3`:

```text
Start new: -3
Continue:  1 + (-3) = -2

Choose: -2
```

So:

```text
currentSum = -2
maxSum = 1
```

At `4`:

```text
Start new: 4
Continue:  -2 + 4 = 2

Choose: 4
```

So:

```text
currentSum = 4
maxSum = 4
```

At `-1`:

```text
Start new: -1
Continue:  4 + (-1) = 3

Choose: 3
```

So:

```text
currentSum = 3
maxSum = 4
```

At `2`:

```text
Start new: 2
Continue:  3 + 2 = 5

Choose: 5
```

So:

```text
currentSum = 5
maxSum = 5
```

At `1`:

```text
Start new: 1
Continue:  5 + 1 = 6

Choose: 6
```

So:

```text
currentSum = 6
maxSum = 6
```

The final maximum subarray sum is:

```text
6
```

---

## Why It Works

A negative previous sum can hurt every future subarray.

If continuing the previous subarray gives a worse result than starting fresh, the previous subarray should be discarded.

Kadane's Algorithm makes this decision at every position.

It keeps only information that can help build the best future answer.

---

## Important Edge Case

Do not always initialize:

```java
int maxSum = 0;
```

Consider:

```text
[-3, -2, -5]
```

The correct answer is:

```text
-2
```

If `maxSum` starts at `0`, the algorithm may incorrectly return `0`, even though an empty subarray is not allowed.

Instead, initialize using the first array element:

```java
int currentSum = nums[0];
int maxSum = nums[0];
```

This correctly handles arrays containing only negative numbers.

---

## Time Complexity

```text
O(n)
```

Every element is processed once.

---

## Space Complexity

```text
O(1)
```

Only a constant number of variables are used.

---

## When to Recognize Kadane's Algorithm

Think about Kadane's Algorithm when the problem asks for:

* Maximum sum of a contiguous subarray.
* Best contiguous segment.
* Maximum running sum.
* Whether to continue the current sequence or restart from the current element.

The main signal is:

```text
Maximum + Contiguous Subarray
```

---

## Key Pattern

At every position:

```text
Continue the current subarray

OR

Start a new subarray
```

Then remember the best result seen anywhere.

That is the core idea behind Kadane's Algorithm.

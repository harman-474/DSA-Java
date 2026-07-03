# Array Reversal

## What Is Array Reversal?

Array reversal means swapping elements from both ends until the required part of the array is reversed.

Example:

[1, 2, 3, 4, 5]

becomes:

[5, 4, 3, 2, 1]

## How It Works

Use two pointers:

- left starts at the beginning
- right starts at the end

Swap the two elements, then move both pointers inward.

Continue while:

left < right

## Example

Start:

[1, 2, 3, 4, 5]

Swap 1 and 5:

[5, 2, 3, 4, 1]

Swap 2 and 4:

[5, 4, 3, 2, 1]

Done.

## Java Pattern

```java
while (left < right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;

    left++;
    right--;
}
# Boyer-Moore Voting Algorithm

## What Is It?

Boyer-Moore Voting finds the majority element in an array.

A majority element appears more than half the time.

## Main Idea

Track:

- `candidate` = current possible majority element
- `count` = support for that candidate

For each number:

- If `count` is `0`, choose the current number as the new candidate.
- If the number equals the candidate, increase `count`.
- Otherwise, decrease `count`.

## Why It Works

Different numbers cancel each other out.

Because the majority element appears more than all other elements combined, it survives the cancellation.

## Java Pattern

```java
int candidate = 0;
int count = 0;

for (int num : nums) {

    if (count == 0) {
        candidate = num;
    }

    if (num == candidate) {
        count++;
    } else {
        count--;
    }
}
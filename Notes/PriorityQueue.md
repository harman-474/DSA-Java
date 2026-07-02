# PriorityQueue

## What is a PriorityQueue?

A `PriorityQueue` is a data structure that always keeps elements in priority order.

By default, Java's `PriorityQueue` is a **Min Heap**, meaning the smallest element has the highest priority.

It can also be made into a **Max Heap** using a custom comparator.

## Why use a PriorityQueue?

* Quickly get the smallest or largest element.
* Frequently used for Top K, scheduling, and shortest path problems.

## Common Methods

### Add an element

```java
pq.offer(10);
```

### Remove the highest-priority element

```java
pq.poll();
```

### View the highest-priority element

```java
pq.peek();
```

### Check if empty

```java
pq.isEmpty();
```

## Time Complexity

* Offer: O(log n)
* Poll: O(log n)
* Peek: O(1)

## Key Learning

Use a `PriorityQueue` whenever you repeatedly need the smallest or largest element efficiently.

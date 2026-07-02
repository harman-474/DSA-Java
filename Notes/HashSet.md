# HashSet

## What is it?

A HashSet is a collection that stores **unique elements**.

It does not allow duplicates and does not maintain insertion order.

## Why Use It?

* Fast lookup
* Fast insertion
* Fast deletion
* Automatically ignores duplicate values

## Common Methods

### add()

Adds an element to the set.

```java
set.add(5);
```

### contains()

Checks whether an element exists.

```java
set.contains(5);
```

### remove()

Removes an element.

```java
set.remove(5);
```

## Time Complexity

* add() → O(1)
* contains() → O(1)
* remove() → O(1)

(Average case)

## Common Uses

* Removing duplicates
* Fast membership checking
* Finding sequences
* Graph and BFS/DFS problems

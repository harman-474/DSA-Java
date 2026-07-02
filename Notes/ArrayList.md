# ArrayList

## What is an ArrayList?

An `ArrayList` is a resizable array in Java. Unlike a normal array, it can grow or shrink as elements are added or removed.

## Why use ArrayList?

* Stores multiple values.
* Size changes automatically.
* Easy to add and access elements.

## Common Methods

### Add an element

```java
list.add("Apple");
```

### Get an element

```java
list.get(0);
```

### Remove an element

```java
list.remove(0);
```

### Get the size

```java
list.size();
```

## List vs ArrayList

```java
List<String> list = new ArrayList<>();
```

* `List` is an interface.
* `ArrayList` is its implementation.
* Prefer declaring variables as `List` because it provides flexibility to switch implementations later.

## Time Complexity

* Add (end): O(1) average
* Get: O(1)
* Remove: O(n)

## Key Learning

Use an `ArrayList` when you need a dynamic collection that can grow automatically.

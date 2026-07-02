# HashMap

## What is a HashMap?

A `HashMap` is a data structure in Java that stores data as **key-value pairs**.

Example:

```java
HashMap<String, Integer> map = new HashMap<>();
```

Here:

* **Key** → `String`
* **Value** → `Integer`

Example data:

```
"Apple"  -> 10
"Mango"  -> 20
"Orange" -> 15
```

---

## Why Use a HashMap?

A `HashMap` provides very fast lookup, insertion, and deletion operations.

Instead of searching through an entire array, we can directly check whether a key exists.

Average Time Complexity:

* Insert → **O(1)**
* Search → **O(1)**
* Delete → **O(1)**

---

## Common Methods

### Create

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

### Insert

```java
map.put(5, 10);
```

### Get Value

```java
map.get(5);
```

Returns the value associated with key `5`.

### Check if Key Exists

```java
map.containsKey(5);
```

Returns `true` if the key exists.

### Remove

```java
map.remove(5);
```

Deletes the key-value pair.

### Size

```java
map.size();
```

Returns the number of entries.

---

## When to Use a HashMap

Use a `HashMap` when you need:

* Fast lookups
* Frequency counting
* Store previously seen values
* Key-value mapping
* Reduce nested loops

---

## Problems Using HashMap

* 1. Two Sum

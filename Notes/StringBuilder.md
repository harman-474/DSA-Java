# StringBuilder

## What It Is

`StringBuilder` is used to build or modify a string efficiently.

## Why We Use It

Java strings cannot be changed directly.

When building a string piece by piece, `StringBuilder` is better than repeatedly joining strings with `+`.

## Create a StringBuilder

```java
StringBuilder result = new StringBuilder();
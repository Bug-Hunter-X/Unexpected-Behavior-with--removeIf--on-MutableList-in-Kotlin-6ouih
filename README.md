# Kotlin `removeIf` Bug
This repository demonstrates a common error when using the `removeIf` function on a mutable list in Kotlin.  Modifying the list while iterating using `removeIf` can lead to elements being skipped or unexpected results.
The `bug.kt` file shows the problematic code, and `bugSolution.kt` provides a solution using an iterator or creating a new list.
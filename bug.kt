fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}
This code intends to remove even numbers from the list. However, it modifies the list while iterating over it, which can lead to unexpected behavior.  The `removeIf` function removes elements in place, causing the index used to iterate to be invalidated after removing an element.
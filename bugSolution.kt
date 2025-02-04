fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    // Solution 1: Using an iterator
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println("Solution 1: $list")

    //Solution 2: Creating a new list
    val newList = list.filter { it % 2 != 0 }.toMutableList()
    println("Solution 2: $newList")
}

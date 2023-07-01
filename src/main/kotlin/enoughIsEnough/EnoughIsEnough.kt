package enoughIsEnough

fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
    val count = mutableMapOf<Int, Int>()

    return elements
        .asSequence()
        .onEach { count[it] = count.getOrDefault(it, 0) + 1 }
        .filter { count[it]!! <= maxOcurrences }
        .toList().toIntArray()
}
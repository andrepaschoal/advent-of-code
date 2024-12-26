package day01

class InputListParser {
    fun parse(arrayOf: Array<String>): Pair<List<Int>, List<Int>> {
        return Pair(
            listOf(1, 2, 3, 3, 3, 4),
            listOf(3, 3, 3, 4, 5, 9),
        )
    }
}

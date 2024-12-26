package day01

class InputListParser {
    fun parse(input: Array<String>): Pair<List<Int>, List<Int>> {
        val pairs = input.map {
            val (left, right) = it.split("   ")
            left to right
        }

        return Pair(
            pairs.map { it.first.toInt() }.sorted(),
            pairs.map { it.second.toInt() }.sorted(),
        )
    }
}

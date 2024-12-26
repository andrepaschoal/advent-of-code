package day01

class DistanceCalculator {
    fun calculate(input: Array<String>): Int {

        val parsedInput = InputListParser().parse(input)
        val left = parsedInput.first
        val right = parsedInput.second

        return left.mapIndexed{
            index, leftValue ->

            val rightValue = right[index]
            var diff = leftValue - rightValue

            if (diff < 0)
                diff *= -1

            diff
        }.sum()
    }
}

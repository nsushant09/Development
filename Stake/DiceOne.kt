package Stake

fun main() {
    dice()
}

// On Every Loss : Increase amount by 10 percent
// On Every Streak of 9 loss : Increase by 50 percent
// On Every win : Reset bet amount

fun dice() {
    var baseBet : Double = 0.1
    val multiplierOnLoss = 0.2
    val totalAmount : Double = 130.0
    var lossCount = 0
    var betSum = baseBet

    while (betSum < totalAmount) {
        println("The Count is : $lossCount")
        println("The bet amount is : $baseBet")
        println("The total cost till now is $betSum")
        println("The gross win is : ${baseBet * 4.9}")
        println("The net win is : ${(baseBet * 4.9) - betSum}")
        println()
        baseBet += (baseBet * multiplierOnLoss)
        betSum += baseBet
        lossCount++
    }
    println("The total times to bet is : $lossCount")
}
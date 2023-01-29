import kotlin.random.Random

fun main() {
    var tries = 0
    val randomNum = Random.nextInt(0, 100)

    while (true) {
        print("Enter guess or (q) to quit: ")
        val guess = readlnOrNull()
        if (guess == "q" || guess == null) {
            break
        }

        val guessInt = try {
            guess.toInt()
        } catch (e: NumberFormatException) {
            println("Please input a number")
            continue
        }

        if (guessInt < 0 || guessInt > 100) {
            println("Input must be between 0 and 100")
            continue
        } else {
            tries += 1
        }

        when {
            guessInt > randomNum -> {
                println("Try a smaller number")
            }

            guessInt < randomNum -> {
                println("Try a larger number")
            }

            else -> {
                println("Correct! You got it in $tries tries! 🎉")
                break
            }
        }
    }
}

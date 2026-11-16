
fun main() {

    var wybor = 0

    while (wybor != 3) {

        pokazMenu()

        wybor = readLine()?.toIntOrNull() ?: 0

        when (wybor) {
            1 -> pokazUcznia()
            2 -> pokazGodziny()
            3 -> println("Koniec programu")
            else -> println("Nie ma takiej opcji")
        }
    }
}

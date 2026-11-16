
fun obliczGodziny(godziny: Int, tygodnie: Int): Int {
    return godziny * tygodnie
}

fun pokazGodziny() {
    val wynik1 = obliczGodziny(30, 4)
    val wynik2 = obliczGodziny(25, 6)

    println("===== GODZINY ZAJEC =====")
    println("30 godzin przez 4 tygodnie: $wynik1")
    println("25 godzin przez 6 tygodni: $wynik2")
}

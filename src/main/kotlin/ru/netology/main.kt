package ru.netology

fun main() {

    val likes = 360101;
    val message = if (likes % 10 == 1 && likes % 100 !== 11) "человеку" else "людям"

    println("\n Понравилось $likes $message \n")
}
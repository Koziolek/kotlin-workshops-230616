package com.luxoft.collections

/**
 *
 * Write application that:
 *
 * # write all names (???)
 * # transform each name to uppercase
 * # transform each name backwards
 * # filter reverted names started by A
 *
 */

val names = listOf<String>("Ala", "Edek", "Bonawentura", "Helmut", "Mirosława");

fun playWithNames() {
    names.map {
        s: String ->
        println(s)
        s.toUpperCase()
    }.map {
        s: String ->
        s.reversed()
    }.filter {
        s: String ->
        s.first() != 'A'
    }.forEach {
        s: String ->
        println(s)
    }

}
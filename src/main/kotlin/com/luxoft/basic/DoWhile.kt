package com.luxoft.basic

/**
 * Created by BKuczynski on 2016-06-20.
 */

fun main(args: Array<String>) {
    val max: Int = 10
    val txt = "some"
    var name = ""

    do {
        name += txt
    } while (name.length < max)

    println(name)
}

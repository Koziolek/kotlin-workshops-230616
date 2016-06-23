package com.luxoft.funs

/**
 *
 * Write recursive version of factorial.
 *
 */

fun fact(i: Long): Long {

    tailrec fun fact(acc: Long, n: Long): Long {
        return when (n) {
            0L -> acc
            else -> fact(acc * n, n - 1)
        }
    }

    return fact(1, i)
}

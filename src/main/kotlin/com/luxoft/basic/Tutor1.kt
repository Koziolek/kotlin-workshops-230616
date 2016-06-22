package com.luxoft.basic

/**
 * Euclidean algorithm
 *
 * Find greatest common divisor (GCD) for two numbers a and b
 *
 * # while a not equal b
 * ## if a great than b then
 * ### a is a minus b
 * ## else
 * ### b is b minus a
 * # return a
 */

fun gcd(a: Int, b: Int): Int {
    var ax = a;
    var bx = b;
    while (ax != bx) {
        if (ax > bx)
            ax -= bx
        else
            bx -= ax
    }
    return a
}
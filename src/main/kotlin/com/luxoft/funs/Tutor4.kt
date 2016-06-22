package com.luxoft.funs

/**
 * Write program that will be calculate integral of function f(Double):Double using quadrature interpolation.
 *
 * # range [a, b) is split to N equal parts
 * # for each part we calculate mean value between F(xn) & F(xn+1), where n is number of part.
 * # for each part we calculate area using mean
 * # we sum up areas
 */

fun integral(parts: Int, start: Double, end: Double, f: (Double) -> Double): Double {
    val eps = (end - start) / parts

    var sum = 0.0

    for (i in 0..(parts - 1)) {
        sum += eps * (f(start + eps * i) + f(start + eps * (i + 1))) / 2
    }

    return sum
}
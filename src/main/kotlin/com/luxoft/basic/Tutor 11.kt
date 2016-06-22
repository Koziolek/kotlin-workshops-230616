package com.luxoft.basic

/* Determination of the day of the week

Jan 1st 1 AD is a Monday in Gregorian calendar.
So Jan 0th 1 AD is a Sunday [It does not exist technically].

Every 4 years we have a leap year. But xy00 cannot be a leap unless xy divides 4 with remainder 0.
y/4 - y/100 + y/400 : this gives the number of leap years from 1AD to the given year. As each year has 365 days (divides 7 with remainder 1), unless it is a leap year or the date is in Jan or Feb, the day of a given date changes by 1 each year. In other cases it increases by 2.
y -= m<3 : If the month is not Jan or Feb, we do not count the 29th Feb (if it exists) of the given year.
So y + y/4 - y/100 + y/400  gives the day of Jan 0th (Dec 31st of prev year) of the year. (This gives the remainder with 7 of  the number of days passed before the given year began.)

Array t:  Number of days passed before the month 'm+1' begins.

So t[m-1]+d is the number of days passed in year 'y' up to the given date.
(y + y/4 - y/100 + y/400 + t[m-1] + d) % 7 is remainder of the number of days from Jan 0 1AD to the given date which will be the day (0=Sunday,6=Saturday).

Description credits: Sai Teja Pratap (quora.com/How-does-Tomohiko-Sakamotos-Algorithm-work).
Hola Pasku

int dow(int y, int m, int d) {
    static int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
    y -= m < 3;
    return (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
}

int main(void) {
    const char *days[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday"};
    printf("%s\n", days[dow(2013, 5, 13)]);
    return 0;
}
*/


val t: Array<Int> = arrayOf(0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4);
val days: Array<String> = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")

fun ts(y: Int, m: Int, d: Int): Int {
    var ly = y;
    when (m) {
        1, 2 -> ly--
        else -> ly
    }
    return (ly + ly / 4 - ly / 100 + ly / 400 + t[m - 1] + d) % 7;
}

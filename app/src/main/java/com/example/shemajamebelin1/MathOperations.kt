package com.example.shemajamebelin1

import java.util.Locale

class MathOperations {
    fun largestCommonDivider(a: Int, b: Int): Int {
        var num1 = a
        var num2 = b

        if (num1 < 0) num1 = -num1
        if (num2 < 0) num2 = -num2

        while (num2 != 0) {
            val temp = num2
            num2 = num1 % num2
            num1 = temp
        }
        return num1
    }

    fun leastCommonMultiple(a: Int, b: Int): Int {
        if (a == 0 || b == 0) {
            return 0
        }

        val gcdValue = largestCommonDivider(a, b)
        return (a / gcdValue) * b
    }

    fun containsDollarSign(input: String): Boolean {
        return '$' in input
    }

    fun sumOfEvenNumbers(n: Int): Int {
        if (n <= 0) {
            return 0
        }
        return if (n % 2 == 0) n + sumOfEvenNumbers(n - 2) else sumOfEvenNumbers(n - 1)
    }

    fun reverseNumber(number: Int): Int {
        var originalNumber = number
        var reversedNumber = 0

        while (originalNumber != 0) {
            val lastDigit = originalNumber % 10
            reversedNumber = reversedNumber * 10 + lastDigit
            originalNumber /= 10
        }

        return reversedNumber
    }

    fun isPalindrome(input: String): Boolean {
        val cleanInput = input.replace(Regex("[^A-Za-z0-9]"), "").lowercase(Locale.getDefault())
        return cleanInput == cleanInput.reversed()
    }

}
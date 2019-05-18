package io.ctomp.hackerrank

import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

/*
 * Complete the halloweenParty function below.
 */
fun halloweenParty(k: Int): Long {
	val newK  = k.toLong()
	val half = newK / 2;
	return (newK - half) * half
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val t = scan.nextLine().trim().toInt()

	for (tItr in 1..t) {
		val k = scan.nextLine().trim().toInt()

		val result = halloweenParty(k)

		println(result)
	}
}
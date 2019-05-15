package io.ctomp.hackerrank

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
	var elevation = 0
	var valleys = 0
	for (i in s) {
		when (i) {
			'U' -> {
				if (elevation + 1 == 0) {
					valleys++
				}

				elevation++
			}
			'D' -> {
				elevation--
			}
		}
	}

	return valleys
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val s = scan.nextLine()

	val result = countingValleys(n, s)

	println(result)
}
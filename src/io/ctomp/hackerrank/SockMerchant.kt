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

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
	var paired = 0
	val unpaired = HashSet<Int>()
	for (i in 0 until n) {
		when (unpaired.contains(ar[i])) {
			true -> {
				paired++
				unpaired.remove(ar[i])
			}
			false -> unpaired.add(ar[i])
		}
	}

	return paired
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val n = scan.nextLine().trim().toInt()

	val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

	val result = sockMerchant(n, ar)

	println(result)
}

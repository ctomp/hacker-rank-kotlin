package io.ctomp.hackerrank

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.time.Duration
import java.time.LocalDate
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

// Complete the libraryFine function below.
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {
	val dueDate = LocalDate.of(y2, m2, d2)
	val returnedDate = LocalDate.of(y1, m1, d1)

	return when {
		returnedDate.isBefore(dueDate) || returnedDate == dueDate -> {
			0
		}
		returnedDate.year == dueDate.year && returnedDate.monthValue == dueDate.monthValue -> {
			(returnedDate.dayOfMonth - dueDate.dayOfMonth) * 15
		}
		returnedDate.year == dueDate.year && returnedDate.monthValue > dueDate.monthValue -> {
			(returnedDate.monthValue - dueDate.monthValue) * 500
		}
		else -> 10000
	}
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val d1M1Y1 = scan.nextLine().split(" ")

	val d1 = d1M1Y1[0].trim().toInt()

	val m1 = d1M1Y1[1].trim().toInt()

	val y1 = d1M1Y1[2].trim().toInt()

	val d2M2Y2 = scan.nextLine().split(" ")

	val d2 = d2M2Y2[0].trim().toInt()

	val m2 = d2M2Y2[1].trim().toInt()

	val y2 = d2M2Y2[2].trim().toInt()

	val result = libraryFine(d1, m1, y1, d2, m2, y2)

	println(result)
}
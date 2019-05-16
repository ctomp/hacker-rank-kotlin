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

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
	val numAInS = s.filter { it == 'a' }.length
	val numAInNS = n / s.length * numAInS
	val numAInPartial = s.substring(0, (n % s.length).toInt()).filter { it == 'a'}.length

	return numAInNS + numAInPartial
}

fun main(args: Array<String>) {
	val scan = Scanner(System.`in`)

	val s = scan.nextLine()

	val n = scan.nextLine().trim().toLong()

	val result = repeatedString(s, n)

	println(result)
}
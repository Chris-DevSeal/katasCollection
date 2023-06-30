package printerError

import kotlin.text.RegexOption.IGNORE_CASE

fun printerError(s: String): String {
    val regexPattern = Regex("[a-m]", IGNORE_CASE)
    val countValid = s.count {
        regexPattern.matches(it.toString())
    }
    return "${s.length.minus(countValid)}/${s.length}"
}

fun printError2(s: String) = "${s.count { !"[a-m]".toRegex(IGNORE_CASE).matches(it.toString()) }}/${s.length}"
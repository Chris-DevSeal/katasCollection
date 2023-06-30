package mumbling

fun accum(s: String): String {
    val result = StringBuilder()
    for (i in s.indices) {
        val timesToAppend = repeatTimes(i)
        val tmpResult = StringBuilder()
        tmpResult.append(s[i].uppercase())
        val repeated = s[i].lowercase().repeat(timesToAppend)
        tmpResult.append(repeated)
        result.append("${tmpResult}-")
    }
    result.deleteCharAt(result.lastIndex)
    return result.toString()
}

fun accum2(s: String) = s.mapIndexed { i, c -> c.uppercase() + c.lowercase().repeat(i) }.joinToString("-")


fun repeatTimes(timesToAppend: Int) = if (timesToAppend - 1 < 0) 0 else timesToAppend
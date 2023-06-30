package stringToCamelCase


fun convert(input: String) = input.split("[-_]".toRegex()).mapIndexed { index, s ->
    if (index == 0) s
    else s.substring(0, 1).uppercase() + s.substring(1)
}.joinToString("")
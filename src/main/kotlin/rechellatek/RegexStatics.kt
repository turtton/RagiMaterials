package rechellatek

/**
 * @author RechellaTek!
 * @see <a href = https://play.kotlinlang.org/embed?short=56r8wKERc&theme=darcula&readOnly=true>Source Code </a>
 */

class RegexStatics {
    companion object {
        val CAMEL_CASE = "(?<=[a-zA-Z])[A-Z]".toRegex()
        val SNAKE_CASE = "_[a-zA-Z]".toRegex()
    }
}

// String extensions
fun String.camelToSnakeCase(): String {
    return RegexStatics.CAMEL_CASE.replace(this) {
        "_${it.value}"
    }.toLowerCase()
}

fun String.snakeToLowerCamelCase(): String {
    return RegexStatics.SNAKE_CASE.replace(this) {
        it.value.replace("_", "").toUpperCase()
    }
}

fun String.snakeToUpperCamelCase(): String {
    return this.snakeToLowerCamelCase().capitalize()
}
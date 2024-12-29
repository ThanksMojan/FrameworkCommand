package git.thanksmojan.arguments

abstract class CommandArgument(val name: String) {
    abstract fun validate(value: String): Boolean
}
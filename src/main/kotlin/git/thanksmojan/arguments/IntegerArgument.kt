package git.thanksmojan.arguments

class IntegerArgument(name: String) : CommandArgument(name) {
    override fun validate(value: String): Boolean {
        return value.toIntOrNull() != null
    }
}
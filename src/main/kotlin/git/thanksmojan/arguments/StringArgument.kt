package git.thanksmojan.arguments

class StringArgument(name: String) : CommandArgument(name) {
    override fun validate(value: String): Boolean {
        return value.isNotEmpty()
    }
}
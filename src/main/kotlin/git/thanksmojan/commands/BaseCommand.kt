package git.thanksmojan.commands

import git.thanksmojan.arguments.CommandArgument

abstract class BaseCommand(val name: String, val description: String) {
    private val arguments = mutableListOf<CommandArgument>()

    fun registerArgument(argument: CommandArgument) {
        arguments.add(argument)
    }

    abstract fun execute(args: Array<out String>): Boolean

    open fun tabComplete(args: Array<out String>): List<String> {
        return if (args.size < arguments.size) {
            arguments.map { it.name }
        } else {
            emptyList()
        }
    }

    fun validateArguments(args: Array<out String>): Boolean {
        return args.size == arguments.size && arguments.zip(args).all { (arg, value) -> arg.validate(value) }
    }
}
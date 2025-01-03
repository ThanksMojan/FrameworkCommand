package git.thanksmojan.commands

import git.thanksmojan.arguments.IntegerArgument
import git.thanksmojan.arguments.StringArgument
import git.thanksmojan.utils.CC

class ExampleCommand : BaseCommand("example", "An example command") {
    init {
        registerArgument(StringArgument("arg"))
        registerArgument(IntegerArgument("number"))
    }

    override fun execute(args: Array<out String>): Boolean {
        if (args.size != 2 || !validateArguments(args)) {
            println(CC.translate("&cUsage: example <arg> <number>"))
            return false
        }
        val arg = args[0]
        val number: Int

        try {
            number = args[1].toInt()
        } catch (e: NumberFormatException) {
            println(CC.translate("&cThe second argument must be a valid number."))
            return false
        }

        println(CC.translate("&aYou executed the example command with argument: &b$arg &aand number: &b$number"))
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return super.tabComplete(args)
    }
}
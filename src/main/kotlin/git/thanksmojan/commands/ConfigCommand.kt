package git.thanksmojan.commands

class ConfigCommand : BaseCommand("config", "Displays or modifies application configuration") {
    override fun execute(args: Array<out String>): Boolean {
        if (args.isEmpty()) {
            println("Current configuration:")
        } else {
            println("Setting configuration for: ${args.joinToString(", ")}")
        }
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return listOf("show", "set")
    }
}
package git.thanksmojan.commands

class ExitCommand : BaseCommand("exit", "Exits the application") {
    override fun execute(args: Array<out String>): Boolean {
        println("Exiting the application...")
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return emptyList()
    }
}
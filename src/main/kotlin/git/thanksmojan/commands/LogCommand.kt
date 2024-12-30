package git.thanksmojan.commands

class LogCommand : BaseCommand("log", "Displays the application logs") {
    override fun execute(args: Array<out String>): Boolean {
        println("Displaying application logs...")
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return emptyList()
    }
}
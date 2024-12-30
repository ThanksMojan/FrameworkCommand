package git.thanksmojan.commands

class InfoCommand : BaseCommand("info", "Displays information about the application") {
    override fun execute(args: Array<out String>): Boolean {
        println("Library: FrameworkCommand")
        println("Version: 1.0.")
        println("Developed by: ThanksMojan")
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return emptyList()
    }
}
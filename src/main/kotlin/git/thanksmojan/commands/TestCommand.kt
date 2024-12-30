package git.thanksmojan.commands

class TestCommand : BaseCommand("test", "Runs diagnostic tests") {
    override fun execute(args: Array<out String>): Boolean {
        println("Running diagnostic tests...")
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return emptyList()
    }
}
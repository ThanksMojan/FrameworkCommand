package git.thanksmojan.commands

import git.thanksmojan.CommandManager

class HelpCommand(private val commandManager: CommandManager) : BaseCommand("help", "Displays a list of available commands") {
    override fun execute(args: Array<out String>): Boolean {
        println(commandManager.helpCommand())
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return emptyList()
    }
}
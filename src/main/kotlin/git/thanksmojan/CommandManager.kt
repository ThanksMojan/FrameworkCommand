package git.thanksmojan

import git.thanksmojan.commands.BaseCommand
import git.thanksmojan.exceptions.CommandNotFoundException

class CommandManager {
    private val commands = mutableMapOf<String, BaseCommand>()

    fun registerCommand(command: BaseCommand) {
        commands[command.name.toLowerCase()] = command
    }

    fun executeCommand(commandName: String, args: Array<out String>): Boolean {
        val command = commands[commandName.toLowerCase()]
        return command?.execute(args) ?: throw CommandNotFoundException("Command '$commandName' not found.")
    }

    fun tabComplete(commandName: String, args: Array<out String>): List<String> {
        val command = commands[commandName.toLowerCase()]
        return command?.tabComplete(args) ?: emptyList()
    }
}
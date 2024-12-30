package git.thanksmojan

import git.thanksmojan.commands.BaseCommand

class CommandManager {
    private val commands = mutableMapOf<String, BaseCommand>()

    fun registerCommand(command: BaseCommand, aliases: List<String> = emptyList()) {
        commands[command.name.lowercase()] = command
        aliases.forEach { alias ->
            commands[alias.lowercase()] = command
        }
    }
    fun unregisterCommand(commandName: String) {
        commands.remove(commandName.lowercase())
    }


    fun executeCommand(commandName: String, args: Array<out String>): Boolean {
        val command = commands[commandName.lowercase()]
        return if (command != null) {
            if (!command.validateArguments(args)) {
                println("Error: Invalid arguments for command '$commandName'.")
                false
            } else {
                command.execute(args)
            }
        } else {
            println("Error: Command '$commandName' not found.")
            false
        }
    }

    fun tabComplete(commandName: String, args: Array<out String>): List<String> {
        val command = commands[commandName.lowercase()]
        return command?.tabComplete(args) ?: emptyList()
    }

    fun helpCommand(): String {
        return commands.values.joinToString("\n") { "${it.name}: ${it.description}" }
    }
}
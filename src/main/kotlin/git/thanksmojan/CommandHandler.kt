package git.thanksmojan

import git.thanksmojan.commands.ExampleCommand

class CommandHandler(private val commandManager: CommandManager) {
    fun registerCommands() {
        commandManager.registerCommand(ExampleCommand())
    }
}
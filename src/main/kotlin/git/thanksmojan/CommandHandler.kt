package git.thanksmojan

import git.thanksmojan.commands.ConfigCommand
import git.thanksmojan.commands.ExampleCommand
import git.thanksmojan.commands.ExitCommand
import git.thanksmojan.commands.HelpCommand
import git.thanksmojan.commands.InfoCommand
import git.thanksmojan.commands.LogCommand
import git.thanksmojan.commands.TestCommand

class CommandHandler(private val commandManager: CommandManager) {

    fun registerCommands() {
        fun registerCommands() {
            commandManager.registerCommand(ExampleCommand())
            commandManager.registerCommand(HelpCommand(commandManager))
            commandManager.registerCommand(ExitCommand())
            commandManager.registerCommand(InfoCommand())
            commandManager.registerCommand(ConfigCommand())
            commandManager.registerCommand(LogCommand())
            commandManager.registerCommand(TestCommand())
        }
    }
}
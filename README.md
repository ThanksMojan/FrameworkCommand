# FrameworkCommand

**FrameworkCommand** is a lightweight annotation-based command system for Bukkit/Spigot plugins. It simplifies command creation and management by eliminating the need to register commands in "ExampleCommand.kt".

## Features

- **Automatic Command Registration**: Use annotations to register commands directly in your code.
- **Descriptions and Usages**: Set descriptions and usage examples for each command.
- **Aliases**: Define aliases for your commands, allowing multiple ways to invoke them.
- **Subcommands**: Organize your commands with subcommands for better structure.
- **Easy Integration**: Seamlessly integrates into any Bukkit/Spigot plugin.

## Usage Example

### Plugin Setup

```java
package git.thanksmojan.commands

import git.thanksmojan.arguments.IntegerArgument
import git.thanksmojan.arguments.StringArgument
import git.thanksmojan.utils.CC

class ExampleCommand : BaseCommand("example", "An example command") {
    init {
        registerArgument(StringArgument("arg"))
        registerArgument(IntegerArgument("number"))
    }

    override fun execute(args: Array<out String>): Boolean {
        if (!validateArguments(args)) {
            println(CC.translate("&cUsage: example <arg> <number>"))
            return false
        }

        val arg = args[0]
        val number = args[1].toInt()

        println(CC.translate("&aYou executed the example command with argument: &b$arg &aand number: &b$number"))
        return true
    }

    override fun tabComplete(args: Array<out String>): List<String> {
        return super.tabComplete(args)
    }
}

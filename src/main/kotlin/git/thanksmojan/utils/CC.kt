package git.thanksmojan.utils

object CC {
    fun translate(input: String): String {
        return input.replace("&", "§") 
    }
}

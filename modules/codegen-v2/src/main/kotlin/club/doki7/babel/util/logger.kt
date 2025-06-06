package club.doki7.babel.util

import java.util.logging.Level
import java.util.logging.LogManager

fun setupLog() {
    System.setProperty("java.util.logging.SimpleFormatter.format", "[%1\$tFT%1\$tT] [%4\$s] %3\$s : %5\$s%n")

    val rootLogger = LogManager.getLogManager().getLogger("")
    for (h in rootLogger.handlers) {
        h.setLevel(Level.INFO)
    }
}

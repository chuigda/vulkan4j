package club.doki7.babel.drv

import club.doki7.babel.util.setupLog
import java.util.logging.Logger

internal val log = Logger.getLogger("c.d.b.drv")

fun main() {
    setupLog()

    vulkanMain()
    // gles2Main()
}

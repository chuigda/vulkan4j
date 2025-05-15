package cc.design7.babel.drv

import cc.design7.babel.util.setupLog
import java.util.logging.Logger

internal val log = Logger.getLogger("c.d.b.drv")

fun main() {
    setupLog()

    vulkanMain()
    // gles2Main()
}

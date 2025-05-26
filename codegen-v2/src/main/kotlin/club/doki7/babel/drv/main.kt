package club.doki7.babel.drv

import club.doki7.babel.extract.vulkan.extractVulkanRegistry
import club.doki7.babel.util.setupLog
import java.util.logging.Logger

internal val log = Logger.getLogger("c.d.b.drv")

/** *(Genesis 11:1-9)*
 *
 * ¹ And the whole earth was of one language, and of one speech.
 *
 * ² And it came to pass, as they journeyed from the east, that they found a plain in the land of
 * Shinar; and they dwelt there.
 *
 * ³ And they said one to another, Go to, let us make brick, and burn them thoroughly. And they had
 * brick for stone, and slime had they for morter.
 *
 * ⁴ And they said, Go to, let us build us a city and a tower, whose top may reach unto heaven; and
 * let us make us a name, lest we be scattered abroad upon the face of the whole earth.
 *
 * ⁵ And the `Lord` came down to see the city and the tower, which the children of men builded.
 *
 * ⁶ And the `Lord` said, Behold, the people is one, and they have all one language; and this they
 * begin to do: and now nothing will be restrained from them, which they have imagined to do.
 *
 * ⁷ Go to, let us go down, and there confound their language, that they may not understand one
 * other's speech.
 *
 * ⁸ So the `Lord` scattered them abroad from thence upon the face of all the earth: and they left
 * off to build the city.
 *
 * ⁹ Therefore is the name of it called Babel; because the `Lord` did there confound the language of
 * all the earth: and from thence did the `Lord` scatter them abroad upon the face of all the earth.
 * */
fun main() {
    setupLog()

    // val vulkanRegistry = vulkanMain()
    // gles2Main()
    val vulkanRegistry = extractVulkanRegistry()
    // vmaMain(vulkanRegistry)
    glfw3Main(vulkanRegistry)
}

import club.doki7.babel.extract.shaderc.extractShadercRegistry
import club.doki7.babel.util.setupLog

private const val packageDir = "shaderc/src/main/java/club/doki7/shaderc"

fun main() {
    setupLog()

    val registry = extractShadercRegistry()
    println(registry)
}

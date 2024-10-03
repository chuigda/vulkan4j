import extract.addGLFWStructures
import extract.extractGLFWHeader
import java.io.File

fun main() {
    val registry = addGLFWStructures(mergeRegistry(
        extractGLFWHeader(File("input/glfw3.h").readText()),
        extractGLFWHeader(File("input/glfw3native.h").readText())
    ))

    println(registry)
}

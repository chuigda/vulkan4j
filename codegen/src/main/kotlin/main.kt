import codegen.generateStructure
import extract.addGLFWStructures
import extract.extractGLFWHeader
import java.io.File

fun main() {
    val registry = addGLFWStructures(mergeRegistry(
        extractGLFWHeader(File("input/glfw3.h").readText()),
        extractGLFWHeader(File("input/glfw3native.h").readText())
    ))
    registry.constantClassName = "GLFWConstants"

    for (struct in registry.structs) {
        println("------")
        print(generateStructure(registry, "tech.icey.glfw", struct.value))
    }
}

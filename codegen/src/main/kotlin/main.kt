import codegen.generateConstants
import codegen.generateHandle
import codegen.generateStructure
import extract.addGLFWStructures
import extract.extractGLFWHeader
import java.io.File

fun main() {
    val registry = addGLFWStructures(mergeRegistry(
        extractGLFWHeader(File("codegen/input/glfw3.h").readText()),
        extractGLFWHeader(File("codegen/input/glfw3native.h").readText())
    ))
    registry.constantClassName = "GLFWConstants"

    for (struct in registry.structs) {
        val generated = generateStructure(registry, "tech.icey.glfw", struct.value)
        File("glfw/src/main/java/tech/icey/glfw/datatype/${struct.key}.java").writeText(generated)
    }

    for (opaqueTypedef in registry.opaqueTypedefs) {
        val generated = generateHandle("tech.icey.glfw", opaqueTypedef.key)
        File("glfw/src/main/java/tech/icey/glfw/handle/${opaqueTypedef.key}.java").writeText(generated)
    }

    val constants = generateConstants("tech.icey.glfw", registry.constantClassName, registry.constants.values.toList())
    File("glfw/src/main/java/tech/icey/glfw/${registry.constantClassName}.java").writeText(constants)
}

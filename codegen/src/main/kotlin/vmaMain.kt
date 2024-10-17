import extract.extractVMAHeader
import java.io.File

fun main() {
    val registry = extractVMAHeader(File("codegen/input/vk_mem_alloc.h").readText())
    registry.constantClassName = "VMAConstants"
}

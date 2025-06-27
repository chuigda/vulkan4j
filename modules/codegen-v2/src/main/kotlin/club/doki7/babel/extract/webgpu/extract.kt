package club.doki7.babel.extract.webgpu

import java.util.logging.Logger
import kotlin.io.path.Path
import kotlinx.serialization.json.*

private val inputDir = Path("codegen-v2/input")
private val log = Logger.getLogger("c.d.b.extract.webgpu")

fun main() {
    val jsonString = inputDir.resolve("webgpu.json").toFile().readText()
    val idl = Json.decodeFromString<IDL>(jsonString)

    println(idl)
}

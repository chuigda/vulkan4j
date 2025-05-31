package club.doki7.babel.extract.sdl3

import club.doki7.babel.cdecl.*
import club.doki7.babel.extract.*
import club.doki7.babel.extract.glfw3.renameEntities
import club.doki7.babel.registry.*
import java.util.logging.Logger
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")
internal val log = Logger.getLogger("c.d.b.extract.sdl3")

fun main() {
    val indexFileContent = inputDir.resolve("SDL3-3.2.14/include/SDL3/SDL.h")
        .toFile()
        .readText()
        .splitToSequence('\n')
        .map(String::trim)

    val filesToParse = indexFileContent.filter { it.startsWith("#include") }
        .map { it.removePrefix("#include <SDL3/").removeSuffix(">") }
        .toMutableSet()

    filesToParse.remove("SDL_stdinc.h")
    filesToParse.remove("SDL_assert.h")
    filesToParse.remove("SDL_atomic.h")
    filesToParse.remove("SDL_bits.h")
    filesToParse.remove("SDL_config.h")
    filesToParse.remove("SDL_oldnames.h")

    println(filesToParse)
}

fun extractSDL3Headers(): Registry<EmptyMergeable> {
    val fileContent = inputDir.resolve("SDL3-3.2.14/include/SDL3/SDL.h").toFile().readText()
    val lines = fileContent
        .splitToSequence('\n')
        .map(String::trim)
        .toList()
    TODO()
}

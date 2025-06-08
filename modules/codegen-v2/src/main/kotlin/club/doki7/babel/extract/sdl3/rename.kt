package club.doki7.babel.extract.sdl3

import club.doki7.babel.extract.ensureLowerCamelCase
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Registry
import club.doki7.babel.util.Either
import club.doki7.babel.util.commonPrefix
import java.io.File

private const val renamedEntitiesFile = "codegen-v2/output/sdl-renamed-entities.csv"

internal fun Registry<EmptyMergeable>.renameEntities() {
    val renamed = mutableMapOf<String, String>()

    fun putEntityIfNameReplaced(entity: Entity) {
        if (entity.name.original != entity.name.value) {
            renamed.putIfAbsent(entity.name.original, entity.name.value)
        }
    }

    constants.forEach { it.value.rename(::renameConstant); putEntityIfNameReplaced(it.value) }
    commands.forEach { it.value.rename(::renameCommand); putEntityIfNameReplaced(it.value) }

    enumerations.values.forEach {
        if (it.variants.size <= 1) {
            return
        }

        val commonPrefix = commonPrefix(it.variants.map { variant -> variant.name.value })
            .substringBeforeLast('_')

        it.variants.forEach { variant ->
            val renamed = variant.name.value.removePrefix(commonPrefix)
            variant.rename(renamed)
            putEntityIfNameReplaced(variant)
        }
    }

    bitmasks.values.forEach {
        if (it.bitflags.size <= 1) {
            return
        }

        val commonPrefix = commonPrefix(it.bitflags.map { bitflag -> bitflag.name.value })
            .substringBeforeLast('_')

        it.bitflags.forEach { bitflag ->
            val renamed = bitflag.name.value.removePrefix(commonPrefix)
            bitflag.rename(renamed)
            putEntityIfNameReplaced(bitflag)

            if (bitflag.value is Either.Right) {
                for ((idx, value) in bitflag.value.value.withIndex()) {
                    bitflag.value.value[idx] = value.removePrefix(commonPrefix)
                }
            }
        }
    }

    log.info(" - 重命名完成，重命名了 ${renamed.size} 个项目，完整列表可参见 $renamedEntitiesFile")
    File(renamedEntitiesFile).writeText(buildString {
        appendLine("original,new")
        for ((original, renamed) in renamed) {
            appendLine("$original,$renamed")
        }
    })
}

private fun renameConstant(name: String) = name.removePrefix("SDL_")

private fun renameCommand(name: String) = name.removePrefix("SDL_").ensureLowerCamelCase()

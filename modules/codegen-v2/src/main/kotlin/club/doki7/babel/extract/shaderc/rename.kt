package club.doki7.babel.extract.shaderc

import club.doki7.babel.extract.renameVariantOrBitflag
import club.doki7.babel.extract.vma.log
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Registry
import java.io.File

private const val renamedEntitiesFile = "codegen-v2/output/shaderc-renamed-entities.csv"

internal fun Registry<EmptyMergeable>.renameEntities() {
    val renamed = mutableMapOf<String, String>()

    fun putEntityIfNameReplaced(entity: Entity) {
        if (entity.name.original != entity.name.value) {
            renamed.putIfAbsent(entity.name.original, entity.name.value)
        }
    }

    commands.forEach { it.value.rename(::renameCommand); putEntityIfNameReplaced(it.value) }

    for (enum in enumerations.values) {
        putEntityIfNameReplaced(enum)
        for (value in enum.variants) {
            value.rename { renameVariantOrBitflag(this, enum.name.value) }
            putEntityIfNameReplaced(value)
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

private val knownShorthands = setOf(
    "spirv", "spv", "hlsl", "nan"
)

private fun renameCommand(name: String) = buildString {
    val parts = name.removePrefix("shaderc_").splitToSequence("_")
    parts.forEachIndexed { index, part ->
        if (part.isEmpty()) return@forEachIndexed
        if (index == 0) {
            append(part)
            return@forEachIndexed
        }

        if (part in knownShorthands) {
            append(part.uppercase())
        } else {
            append(part.replaceFirstChar { it.uppercase() })
        }
    }
}

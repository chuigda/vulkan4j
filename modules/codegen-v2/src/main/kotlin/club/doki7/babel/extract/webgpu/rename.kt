package club.doki7.babel.extract.webgpu

import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Registry
import java.io.File

private const val renamedEntitiesFile = "codegen-v2/output/webgpu-renamed-entities.csv"

internal fun Registry<EmptyMergeable>.renameEntities() {
    val renamed = mutableMapOf<String, String>()

    fun putEntityIfNameReplaced(entity: Entity) {
        if (entity.name.original != entity.name.value) {
            renamed.putIfAbsent(entity.name.original, entity.name.value)
        }
    }

    structures.forEach { it.value.rename(::addWGPUPrefix); putEntityIfNameReplaced(it.value) }
    enumerations.forEach { it.value.rename(::addWGPUPrefix); putEntityIfNameReplaced(it.value) }
    bitmasks.forEach { it.value.rename(::addWGPUPrefix); putEntityIfNameReplaced(it.value) }
    opaqueHandleTypedefs.forEach { it.value.rename(::addWGPUPrefix); putEntityIfNameReplaced(it.value) }
    opaqueTypedefs.forEach { it.value.rename(::addWGPUPrefix); putEntityIfNameReplaced(it.value) }

    constants.forEach { it.value.rename(::renameConstant); putEntityIfNameReplaced(it.value) }
    commands.forEach { it.value.rename(::renameCommand); putEntityIfNameReplaced(it.value) }

    File(renamedEntitiesFile).writeText(buildString {
        appendLine("original,new")
        for ((original, renamed) in renamed) {
            appendLine("$original,$renamed")
        }
    })
}

private fun renameConstant(name: String) = name.uppercase()

private fun renameCommand(name: String) = name

private fun addWGPUPrefix(name: String) =
    if (name.startsWith("WGPU")) name
    else "WGPU${name}"

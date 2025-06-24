package club.doki7.babel.extract.openxr

import club.doki7.babel.extract.ensureLowerCamelCase
import club.doki7.babel.extract.renameVariantOrBitflag
import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.intern
import java.io.File

private const val renamedEntitiesFile = "codegen-v2/output/openxr-renamed-entities.csv"

internal fun Registry<OpenXRRegistryExt>.renameEntities() {
    val renamed = mutableMapOf<String, String>()

    fun putEntityIfNameReplaced(entity: Entity) {
        if (entity.name.original != entity.name.value) {
            renamed.putIfAbsent(entity.name.original, entity.name.value)
        }
    }

    commands.forEach { (_, cmd) ->
        cmd.rename { removePrefix("xr"); ensureLowerCamelCase() }
        putEntityIfNameReplaced(cmd)
    }

    constants.forEach { (_, con) ->
        con.rename { removePrefix("XR_") }
        putEntityIfNameReplaced(con)
    }

    for (enum in enumerations.values) {
        putEntityIfNameReplaced(enum)
        for (variant in enum.variants) {
            variant.rename { renameVariantOrBitflag(this, enum.name.value) }
            putEntityIfNameReplaced(variant)
        }
    }
    enumerations["XrStructureType".intern()]!!.variants.forEach { variant ->
        variant.rename { removePrefix("XR_TYPE_") }
        putEntityIfNameReplaced(variant)
    }

    for (bitmask in bitmasks.values) {
        putEntityIfNameReplaced(bitmask)
        for (bitflag in bitmask.bitflags) {
            bitflag.rename { renameVariantOrBitflag(this, bitmask.name.value, true) }
            putEntityIfNameReplaced(bitflag)
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

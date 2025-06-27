package club.doki7.babel.extract.webgpu

import club.doki7.babel.extract.toPascalCase

internal fun renameWGPUType(name: String) = "WGPU" + name.toPascalCase()

internal fun renameWGPUFunction(name: String) =
    "wgpu" + name.split('_').joinToString("") {
        it.lowercase().replaceFirstChar { c -> c.uppercase() }
    }

internal fun renameWGPUFunctionPointer(name: String) = "PFN_" + renameWGPUFunction(name)

internal fun renameWGPUVar(name: String) = buildString {
    name.split('_').forEachIndexed { index, part ->
        if (index == 0) {
            append(part.lowercase())
        } else {
            append(part.lowercase().replaceFirstChar { it.uppercase() })
        }
    }
}

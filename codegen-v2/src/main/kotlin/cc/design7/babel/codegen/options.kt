package cc.design7.babel.codegen

import cc.design7.babel.registry.RegistryBase

data class CodegenOptions(
    val packageName: String,
    val extraImport: MutableList<String>,
    val constantClassName: String,

    val refRegistries: List<RegistryBase>
)

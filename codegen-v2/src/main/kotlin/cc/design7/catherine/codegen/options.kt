package cc.design7.catherine.codegen

import cc.design7.catherine.registry.RegistryBase

data class CodegenOptions(
    val packageName: String,
    val extraImport: MutableList<String>,
    val constantClassName: String,

    val refRegistries: List<RegistryBase>
)

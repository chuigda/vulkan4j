package cc.design7.babel.codegen

import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.RegistryBase

data class CodegenOptions(
    val packageName: String,
    val extraImport: MutableList<String>,
    val constantClassName: String,
    val functionTypeClassName: String,

    val refRegistries: List<RegistryBase>,

    val seeLinkProvider: Function1<Entity, String?> = ::dummyLinkProvider
)

private fun dummyLinkProvider(entity: Entity): String? = null

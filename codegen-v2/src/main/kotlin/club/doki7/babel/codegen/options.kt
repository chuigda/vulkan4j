package club.doki7.babel.codegen

import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.RegistryBase

data class CodegenOptions(
    val packageName: String,
    val extraImport: List<String>,
    val constantClassName: String,
    val functionTypeClassName: String,

    val refRegistries: List<RegistryBase>,

    val seeLinkProvider: Function1<Entity, String?> = ::dummyLinkProvider
)

private fun dummyLinkProvider(entity: Entity): String? = null

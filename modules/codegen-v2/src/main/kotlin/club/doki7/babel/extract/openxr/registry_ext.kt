package club.doki7.babel.extract.openxr

import club.doki7.babel.registry.Entity
import club.doki7.babel.registry.IMergeable
import club.doki7.babel.registry.Identifier

sealed interface XrMetadata

data class XrParamMetadata(val externsync: String?) : XrMetadata

data class XrStructMetadata(
    val structextends: String?,
    val parentstruct: String?,
    val protect: String?,
    val returnonly: Boolean,
    val mayalias: Boolean,
) : XrMetadata

data class Require(
    val comment: String?,
    val extend: String?,
    val types: List<String>,
    val enums: List<Identifier>,
    val commands: List<Identifier>
)

class OpenXRVersion(
    name: String,
    val number: Float,
    val require: List<Require>
) : Entity(name) {
    override fun toStringImpl(): String = """OpenXRVersion(name="$name", number=$number, require=$require"""
}

data class OpenXRRegistryExt(
    val versions: Map<Identifier, OpenXRVersion>
) : IMergeable<OpenXRRegistryExt> {
    override fun merge(other: OpenXRRegistryExt): OpenXRRegistryExt {
        return OpenXRRegistryExt(
            versions + other.versions
        )
    }

}
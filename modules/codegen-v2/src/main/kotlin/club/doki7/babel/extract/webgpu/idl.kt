@file:Suppress("PropertyName")

package club.doki7.babel.extract.webgpu

import kotlinx.serialization.Serializable

@Serializable
internal data class IDL(
    val copyright: String,
    val name: String,
    val enum_prefix: String,
    val constants: List<IDLConstant>,
    // empty till WebGPU-Native 24.0, use String to detect potential future changes
    val typedefs: List<String>,
    val enums: List<IDLEnumeration>,
    val bitflags: List<IDLBitmask>,
    val structs: List<IDLStructure>,
    val callbacks: List<IDLCallback>,
    val functions: List<IDLFunction>,
    val objects: List<IDLObject>
)

@Serializable
internal data class IDLConstant(
    val name: String,
    val value: String,
    val doc: String
)

@Serializable
internal data class IDLEnumeration(
    val name: String,
    val doc: String,
    val entries: List<IDLEnumVariant?>
)

@Serializable
internal data class IDLEnumVariant(
    val name: String,
    val doc: String
)

@Serializable
internal data class IDLBitmask(
    val name: String,
    val doc: String,
    val entries: List<IDLBitflag>
)

@Serializable
internal data class IDLBitflag(
    val name: String,
    val doc: String,
    val value_combination: List<String>? = null
)

@Serializable
internal data class IDLStructure(
    val name: String,
    val doc: String,
    val type: String,
    val members: List<IDLStructureMember>,
    val free_members: Boolean = false,
    val extends: List<String>? = null
)

@Serializable
internal data class IDLStructureMember(
    val name: String,
    val type: String,
    val doc: String,
    val optional: Boolean = false,
    val pointer: String? = null
)

@Serializable
internal data class IDLCallback(
    val name: String,
    val doc: String,
    val style: String,
    val args: List<IDLCallbackArg>
)

@Serializable
internal data class IDLCallbackArg(
    val name: String,
    val type: String,
    val doc: String,
    val pointer: String? = null,
    val passed_with_ownership: Boolean? = null,
)

@Serializable
internal data class IDLFunction(
    val name: String,
    val doc: String,
    val args: List<IDLFunctionArg>? = null,
    val callback: String? = null,
    val returns: IDLFunctionReturns? = null,
)

@Serializable
internal data class IDLFunctionReturns(
    val doc: String,
    val type: String,
    val pointer: String? = null,
    val passed_with_ownership: Boolean? = null
)

@Serializable
internal data class IDLFunctionArg(
    val name: String,
    val type: String,
    val doc: String,
    val optional: Boolean = false,
    val pointer: String? = null,
    val passed_with_ownership: Boolean? = null
)

@Serializable
internal data class IDLObject(
    val name: String,
    val doc: String,
    val methods: List<IDLFunction>
)

internal fun isIDLTypeArray(type: String) = type.startsWith("array<") && type.endsWith(">")

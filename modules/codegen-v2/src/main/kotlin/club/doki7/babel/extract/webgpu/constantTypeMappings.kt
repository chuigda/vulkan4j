package club.doki7.babel.extract.webgpu

import club.doki7.babel.registry.IdentifierType

data class ConstantTypeMapping(val identType: IdentifierType, val javaExpression: String)

val constantTypeMappings = mapOf(
    "uint32_max" to ConstantTypeMapping(IdentifierType("uint32_t"), "NativeLayout.UINT32_MAX"),
    "uint64_max" to ConstantTypeMapping(IdentifierType("uint64_t"), "NativeLayout.UINT64_MAX"),
    "usize_max" to ConstantTypeMapping(IdentifierType("size_t"), "NativeLayout.UINT64_MAX"),
)

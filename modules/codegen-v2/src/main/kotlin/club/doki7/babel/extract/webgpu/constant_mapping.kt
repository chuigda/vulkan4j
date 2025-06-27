package club.doki7.babel.extract.webgpu

import club.doki7.babel.registry.IdentifierType

data class ConstantTypeMapping(val identType: IdentifierType, val javaExpression: String)

val constantTypeMappings = mapOf(
    "uint32_max" to ConstantTypeMapping(IdentifierType("uint32_t"), "0xFFFFFFFF"),
    "uint64_max" to ConstantTypeMapping(IdentifierType("uint64_t"), "0xFFFFFFFF_FFFFFFFFL"),
    "usize_max" to ConstantTypeMapping(IdentifierType("size_t"), "0xFFFFFFFF_FFFFFFFFL"),
)

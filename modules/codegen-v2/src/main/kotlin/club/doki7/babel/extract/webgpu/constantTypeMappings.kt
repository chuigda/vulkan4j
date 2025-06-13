package club.doki7.babel.extract.webgpu

import club.doki7.babel.registry.IdentifierType


data class ConstantTypeMapping(
    val cType: String,
    val cValue: String,
    val javaType: IdentifierType,
    val javaExpression: String
)

val constantTypeMappings = mapOf(
    "UINT8_MAX" to ConstantTypeMapping("uint8_t", "0xFF", IdentifierType("short"), "(short)0xFF"),
    "UINT16_MAX" to ConstantTypeMapping("uint16_t", "0xFFFF", IdentifierType("int"), "0xFFFF"),
    "UINT32_MAX" to ConstantTypeMapping("uint32_t", "0xFFFFFFFF", IdentifierType("long"), "0xFFFFFFFFL"),
    "UINT64_MAX" to ConstantTypeMapping("uint64_t", "0xFFFFFFFFFFFFFFFF", IdentifierType("long long"), "new BigInteger(\"FFFFFFFFFFFFFFFF\", 16)"),

    "INT8_MAX" to ConstantTypeMapping("int8_t", "0x7F", IdentifierType("byte"), "127"),
    "INT8_MIN" to ConstantTypeMapping("int8_t", "-0x80", IdentifierType("byte"), "-128"),
    "INT16_MAX" to ConstantTypeMapping("int16_t", "0x7FFF", IdentifierType("short"), "32767"),
    "INT16_MIN" to ConstantTypeMapping("int16_t", "-0x8000", IdentifierType("short"), "-32768"),
    "INT32_MAX" to ConstantTypeMapping("int32_t", "0x7FFFFFFF", IdentifierType("int"), "Integer.MAX_VALUE"),
    "INT32_MIN" to ConstantTypeMapping("int32_t", "-0x80000000", IdentifierType("int"), "Integer.MIN_VALUE"),
    "INT64_MAX" to ConstantTypeMapping("int64_t", "0x7FFFFFFFFFFFFFFF", IdentifierType("long"), "Long.MAX_VALUE"),
    "INT64_MIN" to ConstantTypeMapping("int64_t", "-0x8000000000000000", IdentifierType("long"), "Long.MIN_VALUE"),

    "SIZE_MAX" to ConstantTypeMapping("size_t", "0xFFFFFFFF", IdentifierType("long"), "0xFFFFFFFFL"),
    "USIZE_MAX" to ConstantTypeMapping("usize_t", "0xFFFFFFFFFFFFFFFF", IdentifierType("long long"), "new BigInteger(\"FFFFFFFFFFFFFFFF\", 16)"),

    "NAN" to ConstantTypeMapping("float", "NaN", IdentifierType("float"), "Float.NaN")
)

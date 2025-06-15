package club.doki7.babel.extract.webgpu

import club.doki7.babel.extract.toPascalCase
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.Type
import club.doki7.babel.registry.PointerType

val primitiveTypeMap = mapOf(
    // Unsigned integers
    "uint64" to IdentifierType("uint64_t"),
    "uint32" to IdentifierType("uint32_t"),
    "uint16" to IdentifierType("uint16_t"),
    "uint8"  to IdentifierType("uint8_t"),

    // Signed integers
    "int64" to IdentifierType("int64_t"),
    "int32" to IdentifierType("int32_t"),
    "int16" to IdentifierType("int16_t"),
    "int8"  to IdentifierType("int8_t"),

    // Floating-point numbers
    "float64" to IdentifierType("double"),
    "float32" to IdentifierType("float"),

    // Booleans and characters
    "bool" to IdentifierType("bool"),
    "char" to IdentifierType("char"),

    // Platform-dependent types
    "usize" to IdentifierType("size_t"),
)

val specialTypeMap = mapOf(

    "string_with_default_empty" to IdentifierType("StringView"),
    "out_string" to IdentifierType("StringView"),
    "nullable_string" to IdentifierType("StringView"),

    "float64_supertype" to IdentifierType("double"),
    "nullable_float32" to IdentifierType("float"),

    "c_void" to PointerType(IdentifierType("void")),

)

fun classifyType(type: String): Type {
    return when {
        // primitive
        primitiveTypeMap.containsKey(type) ->{
            primitiveTypeMap[type]!!
        }
        // object.*
        type.startsWith("object.") -> {
            val innerType = type.removePrefix("object.")
            IdentifierType(innerType.toPascalCase())
        }
        // bitflag.*
        type.startsWith("bitflag.") ->{
            val innerType = type.removePrefix("bitflag.")
            IdentifierType(innerType.toPascalCase())
        }
        // struct.*
        type.startsWith("struct.") ->{
            val innerType = type.removePrefix("struct.")
            IdentifierType(innerType.toPascalCase())
        }
        // enum.*
        type.startsWith("enum.") ->{
            val innerType = type.removePrefix("enum.")
            IdentifierType(innerType.toPascalCase())
        }
        // array<...>
        type.startsWith("array<") && type.endsWith(">") -> {
            val innerType = type.removePrefix("array<").removeSuffix(">")
            PointerType(classifyType(innerType), const = true)
        }
        // callback.
        type.startsWith("callback.") ->{
            val innerType = type.removePrefix("callback.")
            PointerType(IdentifierType(innerType.toPascalCase()+"CallbackInfo"))
        }
        // specialTypes
        specialTypeMap.containsKey(type) ->{
            specialTypeMap[type]!!
        }
        else -> {
            println("unknown/**/"+type)
            IdentifierType("char")
        }
    }
}


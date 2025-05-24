package club.doki7.babel.cdecl

import club.doki7.babel.registry.ArrayType
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.PointerType
import club.doki7.babel.registry.Type
import club.doki7.babel.registry.intern

sealed interface Decl { val trivia: List<String> }

data class VarDecl(
    val name: String,
    val type: RawType,
    override val trivia: List<String>
) : Decl

data class FunctionDecl(
    val name: String,
    val returnType: RawType,
    val params: List<VarDecl>,
    override val trivia: List<String>
) : Decl

data class TypedefDecl(
    val name: String,
    val aliasedType: RawType,
    override val trivia: List<String>
) : Decl

data class EnumeratorDecl(
    val name: String,
    val value: String,
    override val trivia: List<String>
) : Decl

sealed interface RawType { val trivia: MutableList<String> }

data class RawIdentifierType(
    val ident: String,
    val unsigned: Boolean,
    override val trivia: MutableList<String>
) : RawType

data class RawPointerType(
    var pointee: RawType,
    var const: Boolean,
    override val trivia: MutableList<String>
) : RawType

data class RawArrayType(
    var element: RawType,
    val size: String,
    override val trivia: MutableList<String>
) : RawType

data class RawFunctionType(
    var returnType: RawType,
    val params: List<Pair<String, RawType>>,
    override val trivia: MutableList<String>
) : RawType

fun parseType(s: String): RawType {
    val tokenizer = Tokenizer(s.split("\n"), 0)
    return parseType(tokenizer)
}

/// Only call this function when you're sure that you DO NOT need to retain trivia
fun RawType.toType(): Type = when (this) {
    is RawIdentifierType -> IdentifierType(ident)
    is RawArrayType -> ArrayType(
        element = element.toType(),
        length = size.intern()
    )
    is RawPointerType -> PointerType(
        pointee = pointee.toType(),
        const = const
    )
    is RawFunctionType -> error("function type cannot be converted to Type")
}

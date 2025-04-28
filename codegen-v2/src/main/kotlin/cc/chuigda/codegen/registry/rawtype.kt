package cc.chuigda.codegen.registry

sealed interface Type

data class IdentifierType(val ident: String) : Type

data class ArrayType(val element: Type, val length: String) : Type

data class PointerType(val pointee: Type, val const: Boolean = false) : Type

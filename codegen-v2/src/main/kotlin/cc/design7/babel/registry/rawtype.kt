package cc.design7.babel.registry

sealed interface Type

data class IdentifierType(val ident: Identifier) : Type {
    constructor(ident: String) : this(ident.intern())
}

data class ArrayType(val element: Type, val length: Identifier) : Type

data class PointerType(val pointee: Type, val const: Boolean = false) : Type

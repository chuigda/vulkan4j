package cc.design7.babel.registry

sealed interface Type {
    val cDisplay: String
}

data class IdentifierType(val ident: Identifier) : Type {
    constructor(ident: String) : this(ident.intern())

    override val cDisplay = ident.original
}

data class ArrayType(val element: Type, val length: Identifier) : Type {
    override val cDisplay = "${element.cDisplay}[$length]"
}

data class PointerType(val pointee: Type, val const: Boolean = false) : Type {
    override val cDisplay = "${pointee.cDisplay}${if (const) " const" else ""}*"
}

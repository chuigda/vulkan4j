package club.doki7.babel.cdecl

sealed interface Decl {
    val syntaxTrivia: List<String>
}

data class StructFieldDecl(
    val fieldType: RawType,
    val fieldName: String,
    override val syntaxTrivia: List<String>
) : Decl

data class FunctionDecl(
    val functionName: String,
    val returnType: RawType,
    val params: List<FunctionParamDecl>,
    override val syntaxTrivia: List<String>
) : Decl

data class FunctionParamDecl(
    val paramType: RawType,
    val paramName: String,
    override val syntaxTrivia: List<String>
) : Decl

data class TypedefDecl(
    val typeName: String,
    val aliasedType: RawType,
    override val syntaxTrivia: List<String>
) : Decl

data class EnumeratorDecl(
    val name: String,
    val value: String,
    override val syntaxTrivia: List<String>
) : Decl

sealed interface RawType {
    val syntaxTrivia: List<String>
}

data class RawIdentifierType(
    val ident: String,
    val modifiers: List<String>,
    override val syntaxTrivia: List<String>
) : RawType

data class RawPointerType(
    var pointee: RawType,
    var const: Boolean,
    var volatile: Boolean,
    override val syntaxTrivia: List<String>
) : RawType

data class RawArrayType(
    var element: RawType,
    val size: String,
    override val syntaxTrivia: List<String>
) : RawType

data class RawFunctionType(
    val functionName: String,
    var returnType: RawType,
    val params: List<Pair<String, RawType>>,
    override val syntaxTrivia: List<String>
) : RawType

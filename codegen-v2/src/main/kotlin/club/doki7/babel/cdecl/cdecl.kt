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
    val params: FunctionParamDecl,
    override val syntaxTrivia: List<String>
) : Decl

data class FunctionParamDecl(
    val paramType: RawType,
    val paramName: String,
    override val syntaxTrivia: List<String>
) : Decl

data class FunctionTypedefDecl(
    val functionName: String,
    val returnType: RawType,
    val params: List<FunctionParamDecl>,
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

sealed interface RawType

data class RawIdentifierType(
    val ident: String
) : RawType

data class RawPointerType(
    val pointee: RawType,
    val const: Boolean,
    val volatile: Boolean,
    val syntaxTrivia: List<String>
) : RawType

data class RawArrayType(
    val element: RawType,
    val size: String,
    val syntaxTrivia: List<String>
) : RawType

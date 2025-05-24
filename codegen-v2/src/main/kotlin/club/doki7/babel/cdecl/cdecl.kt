package club.doki7.babel.cdecl

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
    val functionName: String,
    var returnType: RawType,
    val params: List<Pair<String, RawType>>,
    override val trivia: MutableList<String>
) : RawType

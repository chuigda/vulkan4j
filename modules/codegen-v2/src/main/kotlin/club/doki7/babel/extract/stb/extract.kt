@file:Suppress("UNCHECKED_CAST")

package club.doki7.babel.extract.stb

import club.doki7.babel.cdecl.*
import club.doki7.babel.hparse.*
import club.doki7.babel.registry.*
import java.util.logging.Logger
import kotlin.io.path.Path
import kotlin.io.path.useLines

private val inputDir = Path("codegen-v2/input/stb_formatted")
internal val log = Logger.getLogger("c.d.b.extract.stb")

private fun extractSTBHeader(
    fileName: String,
    startDefn: String,
    fndefMacro: String,
    hardStop: String
): Registry<EmptyMergeable> {
    val header = inputDir.resolve(fileName)
        .useLines { it.map(String::trim).toList() }

    val registry = Registry(ext = EmptyMergeable())

    fun detectFuncDecl(line: String): ControlFlow =
        if (line.startsWith(fndefMacro)) {
            ControlFlow.ACCEPT
        } else {
            ControlFlow.NEXT
        }

    fun detectHardStop(line: String): ControlFlow =
        if (line.startsWith(hardStop)) {
            ControlFlow.RETURN
        } else {
            ControlFlow.NEXT
        }

    val headerParseConfig = ParseConfig<EmptyMergeable>().apply {
        addRule(0, ::detectHardStop, ::dummyAction)

        addRule(10, ::detectBlockComment, ::nextLine)
        addRule(10, ::detectLineComment, ::skipBlockComment)

        addRule(20, ::detectFuncDecl, ::parseAndSaveFuncDecl)
        addRule(20, ::detectCallbackTypedef, ::parseAndSaveCallbackTypedef)
        addRule(20, ::detectStructTypedef, ::parseAndSaveStructure)
        addRule(20, ::detectEnumDecl, ::parseAndSaveEnumConstants)
        addRule(30, ::detectTypeAlias, ::parseTypeAlias)
    }

    hparse(
        headerParseConfig,
        registry,
        mutableMapOf(),
        header,
        header.indexOfFirst { it.startsWith("#define") && it.contains(startDefn) }
    )

    return registry
}

// region function decl
private fun <E : IMergeable<E>> parseAndSaveFuncDecl(
    registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (typedef, nextIndex) = parseFunctionDecl(lines, index)
    registry.commands.putEntityIfAbsent(morphFunctionDecl(typedef))
    return nextIndex
}

private fun morphFunctionDecl(functionDecl: FunctionDecl) = Command(
    name = functionDecl.name,
    params = functionDecl.params.map {
        Param(
            name = it.name,
            type = it.type.toType(),
            len = null,
            argLen = null,
            optional = true,
        )
    },
    result = functionDecl.returnType.toType(),
    successCodes = null,
    errorCodes = null
)
// endregion

// region callback typedef
private fun detectCallbackTypedef(line: String): ControlFlow =
    if (line.startsWith("typedef") && line.contains("_callback(") && line.endsWith(';')) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun <E : IMergeable<E>> parseAndSaveCallbackTypedef(
    registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (typedef, nextIndex) = parseNonPointerFunctionTypedefDecl(lines, index)
    val callback = morphCallbackTypedef(typedef)
    registry.functionTypedefs.putEntityIfAbsent(callback)
    return nextIndex
}

private fun morphCallbackTypedef(typedef: TypedefDecl) = FunctionTypedef(
    name = typedef.name,
    params = (typedef.aliasedType as RawFunctionType).params.map { it.second.toType() },
    result = typedef.aliasedType.returnType.toType(),
    isPointer = false
)
// endregion

// region structure
private fun detectStructTypedef(line: String): ControlFlow =
    if (line.startsWith("typedef") && line.contains("struct") && !line.endsWith(";")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun parseAndSaveStructure(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val next = hparse(
        structureParseConfig,
        registry,
        cx,
        lines,
        if (lines[index].endsWith("{")) index + 1 else index + 2
    )
    assert(lines[next].startsWith("}") && lines[next].endsWith(";"))
    val structureName = lines[next]
        .removePrefix("}")
        .removeSuffix(";")
        .trim()

    val fieldVarDecls = cx["fields"] as MutableList<VarDecl>
    cx.remove("fields")

    val members = mutableListOf<Member>()
    for (varDecl in fieldVarDecls) {
        members.add(if (varDecl.type is RawFunctionType) {
            val typeName = "PFN_${structureName}_${varDecl.name}"
            registry.functionTypedefs.putEntityIfAbsent(FunctionTypedef(
                name = typeName,
                params = varDecl.type.params.map { it.second.toType() },
                result = varDecl.type.returnType.toType()
            ))

            Member(
                name = varDecl.name,
                type = IdentifierType(typeName),
                values = null,
                len = null,
                altLen = null,
                optional = false,
                bits = null
            )
        } else {
            Member(
                name = varDecl.name,
                type = varDecl.type.toType(),
                values = null,
                len = null,
                altLen = null,
                optional = false,
                bits = null
            )
        })
    }

    registry.structures.putEntityIfAbsent(Structure(
        name = structureName,
        members = members
    ))

    return next + 1
}

private val structureParseConfig = ParseConfig<EmptyMergeable>().apply {
    addInit {
        it["fields"] = mutableListOf<VarDecl>()
    }
    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectPreprocessor, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)
    addRule(50, ::detectFunctionPointerMember, ::parseFunctionPointerStructField)
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseStructField)
}

private fun detectFunctionPointerMember(line: String): ControlFlow =
    if (line.matches(Regex("\\(\\*[A-Za-z0-9_]+\\)\\("))) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun parseFunctionPointerStructField(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (varDecl, nextIndex) = parseInlineFunctionPointerField(lines, index)
    (cx["fields"] as MutableList<VarDecl>).add(varDecl)
    return nextIndex
}

private fun parseStructField(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (declList, nextIndex) = parseStructFieldDecl(lines, index)
    assert(declList.size == 1)
    val decl = declList[0]
    (cx["fields"] as MutableList<VarDecl>).add(decl)
    return nextIndex
}
// endregion

// region enum (global constants)
private fun detectEnumDecl(line: String): ControlFlow =
    if (line.startsWith("enum") && line.endsWith("{")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun parseAndSaveEnumConstants(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val next = hparse(
        enumerationParseConfig,
        registry,
        cx,
        lines,
        index + 1
    )
    assert(lines[next].startsWith("}"))
    return next + 1
}

val enumerationParseConfig = ParseConfig<EmptyMergeable>().apply {
    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectPreprocessor, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseEnumerator)
}

fun parseEnumerator(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseEnumeratorDecl(lines, index)
    val enumDecl = parseResult.first
    val nextIndex = parseResult.second

    registry.constants.putEntityIfAbsent(Constant(
        name = enumDecl.name,
        expr = enumDecl.value,
        type = IdentifierType("int")
    ))

    return nextIndex
}
// endregion

private fun detectTypeAlias(line: String): ControlFlow =
    if (line.startsWith("typedef") && "struct" !in line && line matches Regex("""^typedef\s+([_a-zA-Z][_a-zA-Z0-9]*\*?\s+)+\w+;$""")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun <E : IMergeable<E>> parseTypeAlias(
    registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseTypedefDecl(lines, index)
    val (typedef, nextIndex) = parseResult
    val alias = morphTypedefAlias(typedef)
    registry.aliases.putEntityIfAbsent(alias)

    return nextIndex
}

private fun morphTypedefAlias(typedef: TypedefDecl) = Typedef(
    name = typedef.name,
    type = (typedef.aliasedType.toType() as IdentifierType),
)

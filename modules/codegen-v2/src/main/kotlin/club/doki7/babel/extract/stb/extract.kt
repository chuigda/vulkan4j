@file:Suppress("UNCHECKED_CAST")

package club.doki7.babel.extract.stb

import club.doki7.babel.cdecl.*
import club.doki7.babel.hparse.*
import club.doki7.babel.registry.*
import club.doki7.babel.util.parseDecOrHex
import java.util.logging.Logger
import kotlin.io.path.Path
import kotlin.io.path.useLines

private val inputDir = Path("codegen-v2/input/stb_formatted")
internal val log = Logger.getLogger("c.d.b.extract.stb")

fun extractSTBImageHeader() = extractSTBHeader(
    fileName = "stb_image.h",
    startDefn = "STBI_INCLUDE_STB_IMAGE_H",
    fndefMacro = "STBIDEF",
    hardStop = "#ifdef STB_IMAGE_IMPLEMENTATION"
).renameEntities("image", "stbi_", true)

fun extractSTBTrueTypeHeader() = extractSTBHeader(
    fileName = "stb_truetype.h",
    startDefn = "__STB_INCLUDE_STB_TRUETYPE_H__",
    fndefMacro = "STBTT_DEF",
    hardStop = "#ifdef STB_TRUETYPE_IMPLEMENTATION"
).renameEntities("truetype", "stbtt_", false)

fun extractSTBImageResizeHeader() = extractSTBHeader(
    fileName = "stb_image_resize2.h",
    startDefn = "STBIR_INCLUDE_STB_IMAGE_RESIZE2_H",
    fndefMacro = "STBIRDEF",
    hardStop = "#if defined(STB_IMAGE_RESIZE_IMPLEMENTATION) || defined(STB_IMAGE_RESIZE2_IMPLEMENTATION)"
).renameEntities("image_resize", "stbir_", true)

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

        addRule(10, ::detectLineComment, ::nextLine)
        addRule(10, ::detectBlockComment, ::skipBlockComment)
        addRule(10, ::detectIfdefCplusplus, ::skipIfdefCplusplusExternC)

        addRule(20, ::detectPreprocessor, ::skipPreprocessor)

        addRule(30, ::detectFuncDecl, ::parseAndSaveFuncDecl)
        addRule(30, ::detectCallbackTypedef, ::parseAndSaveCallbackTypedef)
        addRule(30, ::detectStructTypedef, ::parseAndSaveStructure)
        addRule(30, ::detectNonTypedefStruct, ::parseAndSaveStructure2)
        addRule(30, ::detectEnumTypedef, ::parseAndSaveEnumeration)
        addRule(30, ::detectEnumDecl, ::parseAndSaveEnumConstants)

        addRule(40, ::detectOpaqueHandle, ::parseOpaqueHandle)

        addRule(50, ::detectTypeAlias, ::parseTypeAlias)
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
    if (line.startsWith("typedef") && line.contains("_callback(")) {
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

// region struct
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

    val members = fieldVarDecls.map(::morphStructFieldDecl).toMutableList()

    registry.structures.putEntityIfAbsent(Structure(
        name = structureName,
        members = members
    ))

    return next + 1
}

private fun detectNonTypedefStruct(line: String): ControlFlow =
    if (line.startsWith("struct") && !line.endsWith(";")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun parseAndSaveStructure2(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val structureName = lines[index].removePrefix("struct").removeSuffix("{").trim()
    registry.opaqueTypedefs.remove(structureName.intern())

    val next = hparse(
        structureParseConfig,
        registry,
        cx,
        lines,
        if (lines[index].endsWith("{")) index + 1 else index + 2
    )
    assert(lines[next].startsWith("}") && lines[next].endsWith(";"))

    val fieldVarDecls = cx["fields"] as MutableList<VarDecl>
    cx.remove("fields")

    val members = fieldVarDecls.map(::morphStructFieldDecl).toMutableList()
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
    if (Regex("\\(\\*[A-Za-z0-9_]+\\)\\(").containsMatchIn(line)) {
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
    for (decl in declList) {
        (cx["fields"] as MutableList<VarDecl>).add(decl)
    }
    return nextIndex
}

private fun morphStructFieldDecl(decl: VarDecl): Member =
    if (decl.type is RawFunctionType) {
        val typeName = "PFN_${decl.name}"
        Member(
            name = decl.name,
            type = IdentifierType(typeName),
            values = null,
            len = null,
            altLen = null,
            optional = false,
            bits = null
        )
    } else {
        Member(
            name = decl.name,
            type = decl.type.toType(),
            values = null,
            len = null,
            altLen = null,
            optional = false,
            bits = null
        )
    }
// endregion

// region enum (typedef)
private fun detectEnumTypedef(line: String): ControlFlow =
    if (line.startsWith("typedef") && line.contains("enum")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun parseAndSaveEnumeration(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val nextIndex = hparse(
        enumParseConfig,
        registry,
        cx,
        lines,
        if (lines[index].endsWith("{")) index + 1 else index + 2
    )
    assert(lines[nextIndex].startsWith("}") && lines[nextIndex].endsWith(";"))

    val enumName = lines[nextIndex]
        .removePrefix("}")
        .removeSuffix(";")
        .trim()
    val variants = cx["variants"] as MutableList<EnumVariant>
    cx.remove("variants")
    cx.remove("enumValues")

    registry.enumerations.putEntityIfAbsent(Enumeration(
        name = enumName,
        variants = variants
    ))
    return nextIndex + 1
}

private val enumParseConfig = ParseConfig<EmptyMergeable>().apply {
    addInit {
        it.put("enumValues", mutableSetOf<Long>())
        it.put("variants", mutableListOf<EnumVariant>())
    }

    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectPreprocessor, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseEnumerator)
}

private fun parseEnumerator(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (enumDecl, nextIndex) = parseEnumeratorDecl(lines, index)
    val enumValues = cx["enumValues"] as MutableSet<Long>
    val variants = cx["variants"] as MutableList<EnumVariant>

    val value = enumDecl.value.parseDecOrHex()

    variants.add(
        if (enumValues.contains(value)) {
            EnumVariant(name = enumDecl.name, value = listOf("0x${value.toString(16)}"))
        } else {
            EnumVariant(name = enumDecl.name, value = value)
        }
    )

    return nextIndex
}
// endregion

// region enum (global constants)
private fun detectEnumDecl(line: String): ControlFlow =
    if (line.startsWith("enum {")) {
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
        enumConstantParseConfig,
        registry,
        cx,
        lines,
        index + 1
    )
    assert(lines[next].startsWith("}"))
    return next + 1
}

private val enumConstantParseConfig = ParseConfig<EmptyMergeable>().apply {
    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectPreprocessor, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseEnumeratorAsConstant)
}

private fun parseEnumeratorAsConstant(
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

// region opaque handle
private fun detectOpaqueHandle(line: String): ControlFlow =
    if (line.startsWith("typedef") && line.contains("struct") && line.endsWith(";")) {
        ControlFlow.ACCEPT
    } else {
        ControlFlow.NEXT
    }

private fun <E : IMergeable<E>> parseOpaqueHandle(
    registry: Registry<E>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val twoParts = lines[index]
        .removePrefix("typedef struct")
        .removeSuffix(";")
        .trim()
        .split(" ", limit = 2)
    assert(twoParts.size == 2 && twoParts[0] == twoParts[1])

    registry.opaqueTypedefs.putEntityIfAbsent(OpaqueTypedef(
        name = twoParts[0],
        isHandle = true
    ))
    return index + 1
}

// region type alias
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
// endregion

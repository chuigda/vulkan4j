@file:Suppress("UNCHECKED_CAST")

package club.doki7.babel.extract.sdl3

import club.doki7.babel.cdecl.*
import club.doki7.babel.hparse.ControlFlow
import club.doki7.babel.hparse.ParseConfig
import club.doki7.babel.hparse.detectBlockComment
import club.doki7.babel.hparse.detectBlockDoxygen
import club.doki7.babel.hparse.detectFunctionAlikeMacro
import club.doki7.babel.hparse.detectIfdefCplusplus
import club.doki7.babel.hparse.detectLineComment
import club.doki7.babel.hparse.detectPreprocessor
import club.doki7.babel.hparse.detectTriSlashDoxygen
import club.doki7.babel.hparse.dummyAction
import club.doki7.babel.hparse.hparse
import club.doki7.babel.hparse.nextLine
import club.doki7.babel.hparse.parseAndSaveBlockDoxygen
import club.doki7.babel.hparse.parseAndSaveTriSlashDoxygen
import club.doki7.babel.hparse.skipBlockComment
import club.doki7.babel.hparse.skipIfdefCplusplusExternC
import club.doki7.babel.hparse.skipPreprocessor
import club.doki7.babel.registry.*
import club.doki7.babel.util.isDecOrHexNumber
import club.doki7.babel.util.parseDecOrHex
import club.doki7.babel.util.setupLog
import java.util.logging.Logger
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")
internal val log = Logger.getLogger("c.d.b.extract.sdl3")

fun main() {
    setupLog()

    val indexFileContent = inputDir.resolve("SDL3-3.2.14/include/SDL3/SDL.h")
        .toFile()
        .readText()
        .splitToSequence('\n')
        .map(String::trim)

    val filesToParse = indexFileContent.filter { it.startsWith("#include") }
        .map { it.removePrefix("#include <SDL3/").removeSuffix(">") }
        .toMutableSet()

    filesToParse.remove("SDL_stdinc.h")
    filesToParse.remove("SDL_assert.h")
    filesToParse.remove("SDL_atomic.h")
    filesToParse.remove("SDL_bits.h")
    filesToParse.remove("SDL_config.h")
    filesToParse.remove("SDL_oldnames.h")

    for (fileName in filesToParse) {
        log.info("Extracting SDL3 header: $fileName")
        extractSDL3Header(fileName)
    }
}

fun extractSDL3Header(fileName: String): Registry<EmptyMergeable> {
    val lines = inputDir.resolve("SDL3-3.2.14/include/SDL3/$fileName")
        .toFile()
        .readText()
        .splitToSequence('\n')
        .map(String::trim)
        .toList()

    val registry = Registry<EmptyMergeable>(
        aliases = mutableMapOf(),
        bitmasks = mutableMapOf(),
        constants = mutableMapOf(),
        commands = mutableMapOf(),
        enumerations = mutableMapOf(),
        functionTypedefs = mutableMapOf(),
        opaqueHandleTypedefs = mutableMapOf(),
        opaqueTypedefs = mutableMapOf(),
        structures = mutableMapOf(),
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )

    hparse(
        config = headerParseConfig,
        registry = registry,
        cx = mutableMapOf("doxygen" to mutableListOf<String>()),
        lines = lines,
        index = 0
    )

    return registry
}

private val headerParseConfig = ParseConfig<EmptyMergeable>().apply {
    addRule(0, ::detectBlockDoxygen, ::parseAndSaveBlockDoxygen)
    addRule(0, ::detectTriSlashDoxygen, ::parseAndSaveTriSlashDoxygen)

    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)
    addRule(10, ::detectFunctionAlikeMacro, ::skipPreprocessor)

    addRule(
        20,
        { if (it.startsWith("#define")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::parseConstDef
    )
    addRule(
        20,
        { if (it.startsWith("typedef struct") && it.endsWith(";")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::parseOpaqueTypedef
    )
    addRule(
        20,
        { if (it.startsWith("SDL_FORCE_INLINE")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::skipInlineFunction
    )
    addRule(
        20,
        { if (it.startsWith("typedef") && it.contains("SDLCALL")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::parseCallbackTypedef
    )
    addRule(
        20,
        { if (it.startsWith("extern SDL_DECLSPEC")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::parseAndSaveFunctionDecl
    )
    addRule(
        20,
        { if (it == "typedef union _XEvent XEvent;") ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::nextLine
    )

    addRule(
        30,
        { if (it.startsWith("typedef struct")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        { registry, cx, lines, index -> parseAndSaveStructure(registry, cx, lines, index, isUnion = false) }
    )
    addRule(
        30,
        { if (it.startsWith("typedef union")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        { registry, cx, lines, index -> parseAndSaveStructure(registry, cx, lines, index, isUnion = true) }
    )
    addRule(
        30,
        { if (it.startsWith("typedef enum")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::parseAndSaveEnumeration
    )

    addRule(
        40,
        { if (it.startsWith("typedef") && it.endsWith(";")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        ::parseAndSaveTypedef
    )

    addRule(50, ::detectIfdefCplusplus, ::skipIfdefCplusplusExternC)
    addRule(99, ::detectPreprocessor, ::skipPreprocessor)
}

private fun parseConstDef(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val doc = cx["doxygen"] as? List<String>
    cx.remove("doxygen")

    val line = lines[index]
    val (constantName: String, constantValue: String, nextLine: Int) = if (line.endsWith("\\")) {
        val name = line.removePrefix("#define").removeSuffix("\\").trim()
        Triple(name, lines[index + 1], index + 2)
    } else {
        val parts = line.removePrefix("#define").trim().split(" ", limit = 2)
        if (parts.size < 2) {
            if (!parts[0].lowercase().endsWith("_h") && !parts[0].lowercase().endsWith("_h_")) {
                log.warning("skipping empty constant definition at line ${index + 1}: $line")
            }
            return index + 1
        }
        Triple(parts[0].trim(), parts[1].trim(), index + 1)
    }

    if (constantName in skippedMacroConstants) {
        return nextLine
    }

    val actualConstValue = maybeExpandConstValue(constantValue)

    val enumTypeName = tryFindKnownEnumType(constantName)
    if (enumTypeName != null) {
        val enumType = registry.enumerations[enumTypeName.intern()]!!
        val variant = EnumVariant(
            name = constantName,
            value = listOf(actualConstValue)
        )
        variant.doc = doc
        enumType.variants.add(variant)
        return nextLine
    }

    val bitmaskTypeName = tryFindKnownBitmaskType(constantName)
    if (bitmaskTypeName != null) {
        val bitmask = registry.bitmasks[bitmaskTypeName.intern()]!!
        val bitflag = Bitflag(
            name = constantName,
            value = mutableListOf(actualConstValue)
        )
        bitmask.doc = doc
        bitmask.bitflags.add(bitflag)
        registry.bitmasks[bitmaskTypeName.intern()] = bitmask
        return nextLine
    }

    val constant = Constant(
        name = constantName,
        type = if (constantValue.startsWith('"') && constantValue.endsWith('"')) {
            IdentifierType("CONSTANTS_JavaString")
        } else {
            IdentifierType("uint32_t")
        },
        expr = actualConstValue,
    )
    constant.doc = doc
    registry.constants.putEntityIfAbsent(constant)
    return nextLine
}

private fun parseOpaqueTypedef(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    assert(lines[index].startsWith("typedef struct") && lines[index].endsWith(";")) {
        "Expected opaque typedef at line $index"
    }

    val doc = cx["doxygen"] as? List<String>
    cx.remove("doxygen")

    val parts = lines[index].removePrefix("typedef struct").removeSuffix(";").trim().split(" ", limit = 2)
    val structureName = parts[0].trim()
    val aliasName = parts[1].trim()
    assert(structureName == aliasName)

    val typedef = OpaqueTypedef(structureName, isHandle=true)
    typedef.doc = doc
    registry.opaqueTypedefs.putEntityIfAbsent(typedef)
    return index + 1
}

private fun skipInlineFunction(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    assert(lines[index].startsWith("SDL_FORCE_INLINE")) { "Expected inline function at line $index" }

    var index1 = index + 2
    while (index1 < lines.size && lines[index1] != "}") {
        index1++
    }
    if (index1 >= lines.size) {
        error("Unterminated inline function at line $index")
    }
    return index1 + 1
}

private fun parseCallbackTypedef(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseTypedefDecl(lines, index)
    val typedef = parseResult.first
    val nextIndex = parseResult.second

    val functionTypedef = morphFunctionTypedef(typedef)
    if ("doxygen" in cx) {
        functionTypedef.doc = cx["doxygen"] as List<String>
        cx.remove("doxygen")
    }
    registry.functionTypedefs.putEntityIfAbsent(functionTypedef)
    return nextIndex
}

private fun parseAndSaveFunctionDecl(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseFunctionDecl(lines, index)
    val functionDecl = parseResult.first
    val nextIndex = parseResult.second

    val command = morphFunctionDecl(functionDecl)
    if ("doxygen" in cx) {
        command.doc = cx["doxygen"] as List<String>
        cx.remove("doxygen")
    }
    registry.commands.putEntityIfAbsent(command)

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
            optional = it.type.trivia.any { trivia -> trivia.startsWith("VMA_NULLABLE") },
        )
    },
    result = functionDecl.returnType.toType(),
    successCodes = null,
    errorCodes = null
)

private fun morphFunctionTypedef(typedef: TypedefDecl) = FunctionTypedef(
    name = typedef.name,
    params = (typedef.aliasedType as RawFunctionType).params.map { it.second.toType() },
    result = typedef.aliasedType.returnType.toType()
)

private val structureParseConfig = ParseConfig<EmptyMergeable>().apply {
    addInit { it["fields"] = mutableListOf<Member>() }

    addRule(
        -5,
        { if (it.startsWith("#else")) ControlFlow.ACCEPT else ControlFlow.NEXT },
        { _, _, _, index -> index + 3 }
    )
    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(0, ::detectBlockDoxygen, ::parseAndSaveBlockDoxygen)
    addRule(0, ::detectTriSlashDoxygen, ::parseAndSaveTriSlashDoxygen)
    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectPreprocessor, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseStructField)
}

private fun parseAndSaveStructure(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int,
    isUnion: Boolean
): Int {
    if ("doxygen" in cx) {
        cx["structureDoc"] = cx["doxygen"]!!
        cx.remove("doxygen")
    }

    val structureName = lines[index].removePrefix("typedef struct").trim()
    if (structureName in knownTroublesomeStructures) {
        // directly skip to the `}` + ';' line
        var index1 = index + 1
        while (index1 < lines.size
            && !(lines[index1].startsWith("}")
                    && lines[index1].endsWith(";")
                    && lines[index1].contains(structureName))
        ) {
            index1++
        }
        return index1 + 1
    }

    val next = hparse(structureParseConfig, registry, cx, lines, index + 2)
    val fields = cx["fields"] as MutableList<Member>
    cx.remove("fields")

    val structure = Structure(name = structureName, members = fields)
    if ("structureDoc" in cx) {
        structure.doc = cx["structureDoc"] as List<String>
        cx.remove("structureDoc")
    }
    if (isUnion) {
        registry.unions.putEntityIfAbsent(structure)
    } else {
        registry.structures.putEntityIfAbsent(structure)
    }

    assert(lines[next].startsWith("}") && lines[next].endsWith(";"))
    return next + 1
}

private fun parseStructField(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseStructFieldDecl(lines, index)
    val fieldDecl = parseResult.first
    val nextIndex = parseResult.second

    val member = Member(
        name = fieldDecl.name,
        type = fieldDecl.type.toType(),
        values = null,
        len = null,
        altLen = null,
        optional = fieldDecl.type.trivia.any { trivia -> trivia.startsWith("VMA_NULLABLE") },
        bits = null
    )
    if ("doxygen" in cx) {
        member.doc = cx["doxygen"] as List<String>
        cx.remove("doxygen")
    }

    (cx["fields"] as MutableList<Member>).add(member)
    return nextIndex
}

private fun parseAndSaveEnumeration(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    if ("doxygen" in cx) {
        cx["enumerationDoxygen"] = cx["doxygen"]!!
        cx.remove("doxygen")
    }

    val enumName = lines[index].removePrefix("typedef enum").trim()
    val next = hparse(enumerationParseConfig, registry, cx, lines, index + 2)
    val enumerators = cx["enumerators"] as MutableList<Pair<EnumeratorDecl, List<String>?>>
    cx.remove("enumerators")

    val entity = if (enumName.endsWith("FlagBits")) {
        val actualName = enumName.replace("FlagBits", "Flags")
        val bitmask = Bitmask(
            name = actualName,
            bitwidth = 32,
            bitflags = enumerators.map { (enumDecl, doc) ->
                val bitflag = if (enumDecl.value.isDecOrHexNumber()) {
                    Bitflag(
                        name = enumDecl.name,
                        value = enumDecl.value.parseDecOrHex().toBigInteger()
                    )
                } else {
                    Bitflag(
                        name = enumDecl.name,
                        value = enumDecl.value.split("|").map(String::trim).toMutableList()
                    )
                }
                bitflag.doc = doc
                bitflag
            }.toMutableList()
        )
        registry.bitmasks.putEntityIfAbsent(bitmask)
        bitmask
    } else {
        val enumeration = Enumeration(
            name = enumName,
            variants = enumerators.map { (enumDecl, doc) ->
                val variant = EnumVariant(
                    name = enumDecl.name,
                    value = enumDecl.value.split("|").map(String::trim)
                )
                variant.doc = doc
                variant
            }.toMutableList()
        )
        registry.enumerations.putEntityIfAbsent(enumeration)
        enumeration
    }

    if ("enumerationDoxygen" in cx) {
        entity.doc = cx["enumerationDoxygen"] as List<String>
        cx.remove("enumerationDoxygen")
    }

    assert(lines[next].startsWith("}") && lines[next].endsWith(";"))
    return next + 1
}

private val enumerationParseConfig = ParseConfig<EmptyMergeable>().apply {
    addInit { it["enumerators"] = mutableListOf<Pair<EnumeratorDecl, List<String>?>>() }

    addRule(10, {
        if (it.startsWith("#if") && it.contains("SDL_BYTEORDER")) ControlFlow.ACCEPT else ControlFlow.NEXT
    }, ::skipEndiannessSpecific)
    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(0, ::detectBlockDoxygen, ::parseAndSaveBlockDoxygen)
    addRule(0, ::detectTriSlashDoxygen, ::parseAndSaveTriSlashDoxygen)
    addRule(20, ::detectLineComment, ::nextLine)
    addRule(20, ::detectPreprocessor, ::nextLine)
    addRule(20, ::detectBlockComment, ::skipBlockComment)
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseEnumerator)
}

private fun parseEnumerator(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseEnumeratorDecl(lines, index)
    val enumDecl = parseResult.first
    val nextIndex = parseResult.second

    var enumeratorDoc: List<String>? = null
    if ("doxygen" in cx) {
        enumeratorDoc = cx["doxygen"] as List<String>
        cx.remove("doxygen")
    }

    (cx["enumerators"] as MutableList<Pair<EnumeratorDecl, List<String>?>>).add(Pair(enumDecl, enumeratorDoc))
    return nextIndex
}

private fun skipEndiannessSpecific(
    @Suppress("unused") registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    var index1 = index + 1
    while (index1 < lines.size && !lines[index1].startsWith("#endif")) {
        index1++
    }
    return index1 + 1
}

private fun parseAndSaveTypedef(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val parseResult = parseTypedefDecl(lines, index)
    val typedef = parseResult.first
    val nextIndex = parseResult.second

    val entity = when (typedef.name) {
        in knownEnumTypes -> {
            val enumeration = Enumeration(
                name = typedef.name,
                variants = mutableListOf()
            )
            registry.enumerations.putEntityIfAbsent(enumeration)
            enumeration
        }
        in knownBitmaskTypes -> {
            val bitmask = Bitmask(
                name = typedef.name,
                bitwidth = when ((typedef.aliasedType as RawIdentifierType).ident.lowercase()) {
                    "uint8" -> 8
                    "uint16" -> 16
                    "uint32" -> 32
                    "uint64" -> 64
                    else -> error("Unknown bitmask type: ${typedef.aliasedType}")
                },
                bitflags = mutableListOf()
            )
            registry.bitmasks.putEntityIfAbsent(bitmask)
            bitmask
        }
        else -> {
            val typedef = Typedef(
                name = typedef.name,
                type = typedef.aliasedType.toType()
            )
            registry.aliases.putEntityIfAbsent(typedef)
            typedef
        }
    }

    if ("doxygen" in cx) {
        entity.doc = cx["doxygen"] as List<String>
        cx.remove("doxygen")
    }

    return nextIndex
}

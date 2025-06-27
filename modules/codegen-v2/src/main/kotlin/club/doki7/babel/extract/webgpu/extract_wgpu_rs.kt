@file:Suppress("UNCHECKED_CAST")

package club.doki7.babel.extract.webgpu

import club.doki7.babel.cdecl.RawFunctionType
import club.doki7.babel.cdecl.TypedefDecl
import club.doki7.babel.cdecl.VarDecl
import club.doki7.babel.cdecl.parseEnumeratorDecl
import club.doki7.babel.cdecl.parseStructFieldDecl
import club.doki7.babel.cdecl.parseTypedefDecl
import club.doki7.babel.cdecl.toType
import club.doki7.babel.extract.ensureLowerCamelCase
import club.doki7.babel.extract.vma.inputDir
import club.doki7.babel.hparse.ControlFlow
import club.doki7.babel.hparse.ParseConfig
import club.doki7.babel.hparse.detectBlockComment
import club.doki7.babel.hparse.detectEnumTypedef
import club.doki7.babel.hparse.detectIfdefCplusplus
import club.doki7.babel.hparse.detectLineComment
import club.doki7.babel.hparse.detectNonOpaqueStructTypedef
import club.doki7.babel.hparse.detectPreprocessor
import club.doki7.babel.hparse.dummyAction
import club.doki7.babel.hparse.hparse
import club.doki7.babel.hparse.nextLine
import club.doki7.babel.hparse.parseAndSaveSimpleFuncDecl
import club.doki7.babel.hparse.parseAndSaveSimpleTypeAlias
import club.doki7.babel.hparse.skipBlockComment
import club.doki7.babel.hparse.skipIfdefCplusplusExternC
import club.doki7.babel.hparse.skipPreprocessor
import club.doki7.babel.registry.Bitflag
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.EnumVariant
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.Param
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.intern
import club.doki7.babel.registry.putEntityIfAbsent
import club.doki7.babel.util.parseDecOrHex
import java.math.BigInteger
import kotlin.io.path.useLines

internal fun extractRustWGPURegistry(): Registry<EmptyMergeable> {
    val headerFile = inputDir.resolve("wgpu.h").useLines { it.map(String::trim).toList() }
    val registry = Registry(ext = EmptyMergeable())

    hparse(parseConfig, registry, mutableMapOf(), headerFile, 0)

    registry.commands.values.forEach { command -> command.rename2 {
        name: String -> name.removePrefix("wgpu").ensureLowerCamelCase()
    } }

    return registry
}

private val parseConfig = ParseConfig<EmptyMergeable>().apply {
    addRule(0, ::detectIfdefCplusplus, ::skipIfdefCplusplusExternC)

    addRule(10, ::detectPreprocessor, ::skipPreprocessor)
    addRule(10, ::detectLineComment, ::nextLine)
    addRule(10, ::detectBlockComment, ::skipBlockComment)

    addRule(20, ::detectEnumTypedef, ::parseAndSaveEnumeration)
    addRule(20, ::detectNonOpaqueStructTypedef, ::parseAndSaveStructure)
    addRule(20, ::detectTypedefFlag, ::parseAndSaveTypedefFlag)
    addRule(20, ::detectStaticConstFlag, ::parseAndSaveStaticConstFlag)

    addRule(30, ::detectCallbackTypedef, ::parseAndSaveCallbackTypedef)

    addRule(40, ::detectTypedef, ::parseAndSaveSimpleTypeAlias)

    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseAndSaveSimpleFuncDecl)
}

// region enum
private fun parseAndSaveEnumeration(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val enumName = lines[index].removeSurrounding("typedef enum", "{").trim()
    cx["enumName"] = enumName
    val nextIndex = hparse(
        enumParseConfig,
        registry,
        cx,
        lines,
        if (lines[index].endsWith("{")) index + 1 else index + 2
    )
    assert(lines[nextIndex].startsWith("}") && lines[nextIndex].endsWith(";"))

    val variants = cx["variants"] as MutableList<EnumVariant>
    cx.remove("variants")
    cx.remove("enumName")

    registry.enumerations.putEntityIfAbsent(Enumeration(
        name = enumName,
        variants = variants
    ))
    return nextIndex + 1
}

private val enumParseConfig = ParseConfig<EmptyMergeable>().apply {
    addInit { it.put("variants", mutableListOf<EnumVariant>()) }

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
    val enumName = cx["enumName"] as String
    val variants = cx["variants"] as MutableList<EnumVariant>

    val value = enumDecl.value.parseDecOrHex()
    variants.add(EnumVariant(name = enumDecl.name.removePrefix("${enumName}_"), value = value))

    return nextIndex
}
// endregion

// region typedef flag
private fun detectTypedefFlag(line: String) =
    if (line.startsWith("typedef WGPUFlags")) ControlFlow.ACCEPT
    else ControlFlow.NEXT

private fun parseAndSaveTypedefFlag(
    registry: Registry<EmptyMergeable>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val bitmaskTypeName = lines[index].removeSurrounding("typedef WGPUFlags", ";").trim()
    registry.bitmasks.putEntityIfAbsent(Bitmask(
        name = bitmaskTypeName,
        bitwidth = 64,
        bitflags = mutableListOf()
    ))
    return index + 1
}
// endregion

// region static const flag
private fun detectStaticConstFlag(line: String) =
    if (line.startsWith("static const")) ControlFlow.ACCEPT
    else ControlFlow.NEXT

private fun parseAndSaveStaticConstFlag(
    registry: Registry<EmptyMergeable>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val usefulContent = lines[index].removeSurrounding("static const", ";").trim()
    val (typeName, assignExpr) = usefulContent.split(' ', limit = 2).map(String::trim)
    val bitmaskType = registry.bitmasks[typeName.intern()]
    if (bitmaskType == null) {
        error("cannot define bitflag for bitmask type '$typeName' because the bitmask type itself has not been defined")
    }

    val (bitflagName, valueExpr) = assignExpr.split('=', limit = 2).map(String::trim)

    val bitflag = if (valueExpr.contains("|")) {
        val flagValues = valueExpr.split('|')
            .map { it.trim().replace("1 <<", "1L <<") }
            .toMutableList()
        Bitflag(
            name = bitflagName.removePrefix("${typeName}_"),
            value = flagValues
        )
    } else if (valueExpr.contains("1 <<")) {
        val (_, shiftBits) = valueExpr.split("<<", limit = 2).map(String::trim)
        val shiftBitsNum = shiftBits.toInt()
        Bitflag(
            name = bitflagName.removePrefix("${typeName}_"),
            value = BigInteger.ONE.shiftLeft(shiftBitsNum)
        )
    } else {
        val value = valueExpr.parseDecOrHex()
        Bitflag(
            name = bitflagName.removePrefix("${typeName}_"),
            value = BigInteger.valueOf(value)
        )
    }
    bitmaskType.bitflags.add(bitflag)
    return index + 1
}
// endregion

// region structure
private fun parseAndSaveStructure(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val structureName = lines[index].removeSurrounding("typedef struct", "{").trim()
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

    val members = fieldVarDecls.map(::morphStructFieldDecl)
        .toMutableList()

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
    addRule(99, { _ -> ControlFlow.ACCEPT }, ::parseStructField)
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

private fun morphStructFieldDecl(decl: VarDecl) = Member(
    name = decl.name,
    type = decl.type.toType(),
    values = null,
    len = null,
    altLen = null,
    optional = false,
    bits = null
)
// endregion

// region callback
private fun detectCallbackTypedef(line: String) =
    if (line.startsWith("typedef") && line.contains("(*WGPU")) ControlFlow.ACCEPT
    else ControlFlow.NEXT

private fun parseAndSaveCallbackTypedef(
    registry: Registry<EmptyMergeable>,
    @Suppress("unused") cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val (typedefDecl, nextLine) = parseTypedefDecl(lines, index)
    registry.functionTypedefs.putEntityIfAbsent(morphFunctionTypedef(typedefDecl))
    return nextLine
}

private fun morphFunctionTypedef(typedef: TypedefDecl) = FunctionTypedef(
    name = typedef.name,
    params = (typedef.aliasedType as RawFunctionType).params.map { it.second.toType() },
    result = typedef.aliasedType.returnType.toType()
)
// endregion

// region type alias
private fun detectTypedef(line: String) =
    if (line.startsWith("typedef ") && line.endsWith(";")) ControlFlow.ACCEPT
    else ControlFlow.NEXT
// endregion

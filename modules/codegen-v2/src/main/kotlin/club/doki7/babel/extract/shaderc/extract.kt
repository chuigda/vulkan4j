@file:Suppress("UNCHECKED_CAST")

package club.doki7.babel.extract.shaderc

import club.doki7.babel.cdecl.parseStructFieldDecl
import club.doki7.babel.cdecl.toType
import club.doki7.babel.extract.vma.enumerationParseConfig
import club.doki7.babel.hparse.ControlFlow
import club.doki7.babel.hparse.ParseConfig
import club.doki7.babel.hparse.detectBlockComment
import club.doki7.babel.hparse.detectBlockDoxygen
import club.doki7.babel.hparse.detectLineComment
import club.doki7.babel.hparse.detectPreprocessor
import club.doki7.babel.hparse.detectTriSlashDoxygen
import club.doki7.babel.hparse.dummyAction
import club.doki7.babel.hparse.hparse
import club.doki7.babel.hparse.nextLine
import club.doki7.babel.hparse.parseAndSaveBlockDoxygen
import club.doki7.babel.hparse.parseAndSaveTriSlashDoxygen
import club.doki7.babel.hparse.skipBlockComment
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.EnumVariant
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.OpaqueTypedef
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.putEntityIfAbsent
import club.doki7.babel.util.parseDecOrHex

fun extractShadercRegistry(): Registry<EmptyMergeable> {
    ParseConfig<EmptyMergeable>().apply {
        addRule(20, {
            if (it.startsWith("typedef enum")) {
                ControlFlow.ACCEPT
            } else ControlFlow.NEXT
        }, ::parseAndSaveEnumeration)

        addRule(20, {
            if (it.startsWith("typedef struct") && it.endsWith(";")) {
                ControlFlow.ACCEPT
            } else ControlFlow.NEXT
        }, ::parseOpaqueStructure)

        addRule(20, {
            if (it.startsWith("typedef struct") && it.endsWith("{")) {
                ControlFlow.ACCEPT
            } else ControlFlow.NEXT
        }, ::parseAndSaveStructure)
    }

    TODO()
}

private fun parseOpaqueStructure(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    val line = lines[index]
    val headless = line.substring(15, line.length - 1).trim()
    val names = headless.split(' ')
    assert(names.size == 2)

    val name = names[1]
    val typedef = OpaqueTypedef(name)
    typedef.isHandle = true
    typedef.doc = cx.steal(Doxygen)
    registry.opaqueTypedefs.putEntityIfAbsent(typedef)
    return index + 1
}

// TODO: copy from vma, unify them
private val structureParseConfig = ParseConfig<EmptyMergeable>().apply {
    addInit { it[Fields] = mutableListOf() }
    addRule(0, { line -> if (line.startsWith("}")) ControlFlow.RETURN else ControlFlow.NEXT }, ::dummyAction)
    addRule(0, ::detectBlockDoxygen, ::parseAndSaveBlockDoxygen)
    addRule(0, ::detectTriSlashDoxygen, ::parseAndSaveTriSlashDoxygen)
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
    assert(declList.size == 1)
    val decl = declList[0]

    val member = Member(
        name = decl.name,
        type = decl.type.toType(),
        values = null,
        len = null,
        altLen = null,
        optional = false,
        bits = null
    )

    member.doc = cx.steal(Doxygen)
    cx[Fields]!!.add(member)
    return nextIndex
}

private fun parseAndSaveStructure(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int
): Int {
    cx.steal(Doxygen)?.let {
        cx[StructureDoc] = it
    }

    val structureName = lines[index].removePrefix("typedef struct").trim()
    val next = hparse(structureParseConfig, registry, cx, lines, index + 2)
    val fields = cx.rob(Fields)

    val structure = Structure(
        name = structureName,
        members = fields
    )

    cx.steal(StructureDoc)?.let {
        structure.doc = it
    }

    registry.structures.putEntityIfAbsent(structure)

    assert(lines[next].startsWith("}") && lines[next].endsWith(";"))
    return next + 1
}

private fun parseAndSaveEnumeration(
    registry: Registry<EmptyMergeable>,
    cx: MutableMap<String, Any>,
    lines: List<String>,
    index: Int,
): Int {
    cx.steal(Doxygen)?.let {
        cx[EnumerationDoxygen] = it
    }

    val next = hparse(enumerationParseConfig, registry, cx, lines, index + 2)
    // next is at the line `} ENUM_NAME;`
    val enumName = lines[next].removeSurrounding("}", ";").trim()
    val enumerators = cx.rob(Enumerator)

    val enumeration = Enumeration(
        name = enumName,
        variants = enumerators.map { (enumDecl, doc) ->
            val variant = EnumVariant(
                name = enumDecl.name,
                value = enumDecl.value.parseDecOrHex()
            )
            variant.doc = doc
            variant
        }.toMutableList()
    )

    registry.enumerations.putEntityIfAbsent(enumeration)
    enumeration.doc = cx.steal(EnumerationDoxygen)

    assert(lines[next].startsWith("}") && lines[next].endsWith(";"))
    return next + 1
}
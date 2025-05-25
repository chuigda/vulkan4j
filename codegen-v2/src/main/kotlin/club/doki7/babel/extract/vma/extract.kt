package club.doki7.babel.extract.vma

import club.doki7.babel.cdecl.EnumeratorDecl
import club.doki7.babel.cdecl.FunctionDecl
import club.doki7.babel.cdecl.RawFunctionType
import club.doki7.babel.cdecl.RawIdentifierType
import club.doki7.babel.cdecl.TypedefDecl
import club.doki7.babel.cdecl.parseBlockDoxygen
import club.doki7.babel.cdecl.parseEnumeratorDecl
import club.doki7.babel.cdecl.parseFunctionDecl
import club.doki7.babel.cdecl.parseStructFieldDecl
import club.doki7.babel.cdecl.parseTriSlashDoxygen
import club.doki7.babel.cdecl.parseTypedefDecl
import club.doki7.babel.cdecl.toType
import club.doki7.babel.registry.*
import java.util.logging.Logger
import kotlin.io.path.Path

private val inputDir = Path("codegen-v2/input")
internal val log = Logger.getLogger("c.d.b.extract.vma")

fun extractVMAHeader(): Registry<EmptyMergeable> {
    val headerFile = inputDir.resolve("vk_mem_alloc.h")
        .toFile()
        .readText()

    val r = parseVMAHeader(headerFile)
    r.renameEntities()
    return r
}

private fun parseVMAHeader(fileContent: String): Registry<EmptyMergeable> {
    val constants = mutableMapOf<Identifier, Constant>()
    val commands = mutableMapOf<Identifier, Command>()
    val opaqueHandleTypedefs = mutableMapOf<Identifier, OpaqueHandleTypedef>()
    val structures = mutableMapOf<Identifier, Structure>()
    val functionTypedefs = mutableMapOf<Identifier, FunctionTypedef>()
    val bitmasks = mutableMapOf<Identifier, Bitmask>()
    val enumerations = mutableMapOf<Identifier, Enumeration>()

    val lines = fileContent.split("\n").map(String::trim)

    var index = 0
    var previousIndex: Int? = null

    var savedDoc: List<String>? = null
    while (index < lines.size) {
        if (previousIndex != null && previousIndex == index) {
            log.warning("vma.h: infinite loop detected at line $index: ${lines[index]}, forcing process")
            index++
        }
        previousIndex = index

        val curLine = lines[index]
        if (curLine == "#ifdef VMA_IMPLEMENTATION") {
            break
        }

        if (curLine.isBlank() || curLine.startsWith("#") || curLine.startsWith("//")) {
            index++
            continue
        }

        if (curLine.startsWith("/**")) {
            val result = parseBlockDoxygen(lines, index)
            savedDoc = result.first
            index = result.second
            continue
        }

        if (curLine.startsWith("///")) {
            val result = parseTriSlashDoxygen(lines, index)
            savedDoc = result.first
            index = result.second
            continue
        }

        if (curLine.startsWith("VK_DEFINE_HANDLE(") && curLine.endsWith(")")) {
            val handleName = curLine.removePrefix("VK_DEFINE_HANDLE(").removeSuffix(")").trim()
            val handle = OpaqueHandleTypedef(name = handleName)
            handle.originalDoc = savedDoc
            opaqueHandleTypedefs[handle.name] = handle
            savedDoc = null
            index++
        }
        else if (curLine.startsWith("VK_DEFINE_NON_DISPATCHABLE_HANDLE(") && curLine.endsWith(")")) {
            val handleName = curLine.removePrefix("VK_DEFINE_NON_DISPATCHABLE_HANDLE(").removeSuffix(")").trim()
            val handle = OpaqueHandleTypedef(name = handleName)
            handle.originalDoc = savedDoc
            opaqueHandleTypedefs[handle.name] = handle
            savedDoc = null
            index++
        }
        else if (curLine.startsWith("typedef") && curLine.contains("VKAPI_PTR") && curLine.contains("PFN_")) {
            val parseResult = parseTypedefDecl(lines, index)
            val typedef = parseResult.first
            index = parseResult.second

            val functionTypedef = morphFunctionTypedef(typedef)
            functionTypedef.originalDoc = savedDoc
            savedDoc = null
            functionTypedefs[functionTypedef.name] = functionTypedef
        }
        else if (curLine.startsWith("typedef struct")) {
            assert(lines[index + 1].startsWith("{"))
            val parseResult = parseStructFields(lines, index + 2)
            val structMembers = parseResult.first
            index = parseResult.second

            assert(lines[index].startsWith("}") && lines[index].endsWith(";"))
            val structName = lines[index].removePrefix("}").removeSuffix(";").trim()
            index += 1

            val struct = Structure(name = structName, members = structMembers)
            struct.originalDoc = savedDoc
            savedDoc = null
            structures[struct.name] = struct
        }
        else if (curLine.startsWith("typedef enum")) {
            assert(lines[index + 1].startsWith("{"))
            val parseResult = parseEnumerators(lines, index + 2)
            val enumerators = parseResult.first
            index = parseResult.second

            assert(lines[index].startsWith("}") && lines[index].endsWith(";"))
            val enumName = lines[index].removePrefix("}").removeSuffix(";").trim()
            index += 1

            val entity = if (enumName.endsWith("FlagBits")) {
                val actualName = enumName.replace("FlagBits", "Flags")
                val bitmask = Bitmask(
                    name = actualName,
                    bitwidth = 32,
                    bitflags = enumerators.map { (enumDecl, doc) ->
                        val bitflag = Bitflag(
                            name = enumDecl.name,
                            value = enumDecl.value.split("|").map(String::trim)
                        )
                        bitflag.originalDoc = doc
                        bitflag
                    }.toMutableList()
                )
                bitmasks[bitmask.name] = bitmask
                bitmask
            } else {
                val enum = Enumeration(
                    name = enumName,
                    variants = enumerators.map { (enumDecl, doc) ->
                        val variant = EnumVariant(
                            name = enumDecl.name,
                            value = enumDecl.value.split("|").map(String::trim)
                        )
                        variant.originalDoc = doc
                        variant
                    }.toMutableList()
                )
                enumerations[enum.name] = enum
                enum
            }

            entity.originalDoc = savedDoc
            savedDoc = null
        }
        else if (curLine.startsWith("VMA_CALL_PRE") && curLine.contains("VMA_CALL_POST")) {
            val parseResult = parseFunctionDecl(lines, index)
            val functionDecl = parseResult.first
            index = parseResult.second

            val command = morphFunctionDecl(functionDecl)
            command.originalDoc = savedDoc
            savedDoc = null
            commands[command.name] = command
        }
        else {
            log.warning("vma.h: unknown line: $curLine")
            index++
        }
    }

    val r = Registry(
        aliases = mutableMapOf(),
        bitmasks = bitmasks,
        constants = constants,
        commands = commands,
        enumerations = enumerations,
        functionTypedefs = functionTypedefs,
        opaqueHandleTypedefs = opaqueHandleTypedefs,
        opaqueTypedefs = mutableMapOf(),
        structures = structures,
        unions = mutableMapOf(),
        ext = EmptyMergeable()
    )

    return r
}

private fun parseStructFields(lines: List<String>, i: Int): Pair<List<Member>, Int> {
    var index = i
    val members = mutableListOf<Member>()
    var savedDoc: List<String>? = null

    while (index < lines.size && !lines[index].startsWith("}")) {
        if (lines[index].isBlank()) {
            index++
            continue
        }

        if (lines[index].startsWith("#if") || lines[index].startsWith("#endif")) {
            index++
            continue
        }

        if (lines[index].startsWith("/**")) {
            val result = parseBlockDoxygen(lines, index)
            savedDoc = result.first
            index = result.second
            continue
        }

        if (lines[index].startsWith("///")) {
            val result = parseTriSlashDoxygen(lines, index)
            savedDoc = result.first
            index = result.second
            continue
        }

        val parseResult = parseStructFieldDecl(lines, index)
        val fieldDecl = parseResult.first
        index = parseResult.second

        val member = Member(
            name = fieldDecl.name,
            type = fieldDecl.type.toType(),
            values = null,
            len = null,
            altLen = null,
            optional = fieldDecl.type.trivia.any { trivia -> trivia.startsWith("VMA_NULLABLE") },
            bits = null
        )
        member.originalDoc = savedDoc
        members.add(member)
        savedDoc = null
    }

    return Pair(members, index)
}

private fun parseEnumerators(lines: List<String>, i: Int): Pair<List<Pair<EnumeratorDecl, List<String>?>>, Int> {
    var index = i
    val enumerators = mutableListOf<Pair<EnumeratorDecl, List<String>?>>()
    var savedDoc: List<String>? = null

    while (index < lines.size && !lines[index].startsWith("}")) {
        if (lines[index].isBlank()) {
            index++
            continue
        }

        if (lines[index].startsWith("#if") || lines[index].startsWith("#endif")) {
            index++
            continue
        }

        if (lines[index].startsWith("/**")) {
            val result = parseBlockDoxygen(lines, index)
            savedDoc = result.first
            index = result.second
            continue
        }

        if (lines[index].startsWith("///")) {
            val result = parseTriSlashDoxygen(lines, index)
            savedDoc = result.first
            index = result.second
            continue
        }

        val parseResult = parseEnumeratorDecl(lines, index)
        val enumDecl = parseResult.first
        index = parseResult.second

        enumerators.add(Pair(enumDecl, savedDoc))
    }

    return Pair(enumerators, index)
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
    result =
        if (typedef.aliasedType.returnType is RawIdentifierType &&
            (typedef.aliasedType.returnType as RawIdentifierType).ident == "void") {
            null
        } else {
            typedef.aliasedType.returnType.toType()
        },
)

package extract

import ArrayType
import Bitflag
import Bitmask
import Constant
import Registry
import Function
import FunctionTypedef
import Handle
import IdentifierType
import Member
import OpaqueTypedef
import Param
import PointerType
import Structure
import Type
import Enum
import Variant

fun extractVMAHeader(fileContent: String): Registry {
    var lines = fileContent.split('\n').map(String::trim)

    val constants = mutableMapOf<String, Constant>()
    val functions = mutableMapOf<String, Function>()
    val opaqueTypedefs = mutableMapOf<String, OpaqueTypedef>()
    val handles = mutableMapOf<String, Handle>()
    val functionTypedefs = mutableMapOf<String, FunctionTypedef>()
    val bitmasks = mutableMapOf<String, Bitmask>()
    val enums = mutableMapOf<String, Enum>()

    var i = 0
    while (i < lines.size) {
        if (lines[i] == "#ifdef VMA_IMPLEMENTATION") {
            break
        }

        if (lines[i].startsWith("/*")) {
            while (!lines[i].endsWith("*/")) {
                i++
            }
        }

        if (lines[i].startsWith("VK_DEFINE_HANDLE(") && lines[i].endsWith(")")) {
            val name = lines[i].substring(16, lines[i].length - 1)
            handles[name] = Handle(name, dispatchable=true)
            i++
        }
        else if (lines[i].startsWith("VK_DEFINE_NON_DISPATCHABLE_HANDLE(") && lines[i].endsWith(")")) {
            val name = lines[i].substring(34, lines[i].length - 1)
            handles[name] = Handle(name, dispatchable=false)
            i++
        }
        else if (lines[i].startsWith("typedef") && lines[i].contains("VKAPI_PTR") && lines[i].contains("PFN_")) {
            var j = i
            while (!lines[j].endsWith(");")) {
                j++
            }

            val functionTypedefString = lines.subList(i, j + 1).joinToString("")
            val functionTypedef = parseFunctionTypedef(functionTypedefString)
            functionTypedefs[functionTypedef.name] = functionTypedef

            i = j + 1
        }
        else if (lines[i].startsWith("VMA_CALL_PRE") && lines[i].contains("VMA_CALL_POST")) {
            var j = i
            while (!lines[j].endsWith(");")) {
                j++
            }
            val functionString = lines.subList(i, j + 1).joinToString("")
            System.err.println("functionString=$functionString")
            val function = parseFunction(functionString)
            functions[function.name] = function

            i = j + 1
        }
        else if (lines[i].startsWith("typedef enum")) {
            val typedefLine = lines[i]
            assert(lines[i + 1].startsWith("{"))

            val (enumerators, nextLineId) = parseEnum(lines, i + 2)
            assert(lines[nextLineId].startsWith("}") && lines[nextLineId].endsWith(";"))

            val enumName = typedefLine.split(' ')[2]
            if (typedefLine.contains("FlagBits")) {
                bitmasks.put(enumName, Bitmask(
                    name=enumName.replace("FlagBits", "Flags"),
                    bitflags=enumerators.map { Bitflag(name=it.first, value=it.second) }
                ))
            }
            else {
                enums.put(enumName, Enum(
                    name=enumName,
                    variants=enumerators.map { Variant(name=it.first, value=it.second) }
                ))
            }

            i = nextLineId + 1
        }
        else {
            i++
        }
    }

    println(bitmasks)
    println(enums)

    return Registry(
        constants=constants,
        functions=functions,
        opaqueTypedefs=opaqueTypedefs,
        handles=handles,
        structs=mapOf(),
        functionTypedefs=functionTypedefs,
        bitmasks=bitmasks,
        enums=enums
    )
}

private fun parseFunctionTypedef(line: String): FunctionTypedef {
    val tokens = tokenize(line)
    assert(tokens[0] == "typedef")

    var (retType, position) = parseType(tokens, 1)
    assert(tokens[position] == "(")
    position++

    assert(tokens[position] == "VKAPI_PTR")
    position++

    assert(tokens[position] == "*")
    position++

    val functionName = tokens[position]
    assert(functionName.isValidIdent())
    position++

    assert(tokens[position] == ")")
    position++

    assert(tokens[position] == "(")
    position++

    val params = mutableListOf<Param>()
    while (tokens[position] != ")") {
        var (paramType, positionNext) = parseType(tokens, position)
        position = positionNext

        if (tokens[position] == ")" && paramType is IdentifierType && paramType.ident == "void") {
            break
        }

        var optional = false
        if (tokens[position].startsWith("VMA_") && tokens[position].isAllCapital()) {
            if (tokens[position].contains("NULLABLE")) {
                optional = true
            }
            position += 1
        }

        val paramName = tokens[position]
        assert(paramName.isValidIdent())
        position += 1

        if (tokens.getOrNull(position) == "[") {
            if (tokens.getOrNull(position + 1) == "]") {
                paramType = PointerType(paramType, false)
                position += 2
            }
            else {
                val arraySize = tokens[position + 1]
                if (tokens.getOrNull(position + 2) != "]") {
                    throw RuntimeException("Expected ']'")
                }
                paramType = ArrayType(paramType, arraySize)
                position += 3
            }
        }

        params.add(Param(paramName, optional=optional, type=paramType))
        if (tokens[position] == ",") {
            position++
        }
    }

    if (tokens[position] != ")") {
        throw RuntimeException("Expected ')'")
    }

    return FunctionTypedef(functionName, params=params, result=retType)
}

private fun parseFunction(line: String): Function {
    val tokens = tokenize(line)
    System.err.println("tokens=$tokens")
    assert(tokens[0] == "VMA_CALL_PRE")

    var (retType, position) = parseType(tokens, 1)

    assert(tokens[position] == "VMA_CALL_POST")
    position += 1

    var fName = tokens[position]
    assert(fName.isValidIdent())
    position += 1

    assert(tokens[position] == "(")
    position += 1

    val params = mutableListOf<Param>()
    while (tokens[position] != ")") {
        var (paramType, positionNext) = parseType(tokens, position)
        position = positionNext

        if (tokens[position] == ")" && paramType is IdentifierType && paramType.ident == "void") {
            break
        }

        var optional = false
        while (tokens[position].startsWith("VMA_") && tokens[position].isLikelyMacro()) {
            if (tokens[position].contains("NULLABLE")) {
                optional = true
            }
            position += 1

            // VMA function-call alike macro, usually used to indicate length metadata
            // skip if we get one
            if (tokens[position] == "(") {
                position += 1
                while (tokens[position] != ")") {
                    position += 1
                }
                position += 1
            }
        }

        val paramName = tokens[position]
        assert(paramName.isValidIdent())
        assert(!paramName.isLikelyMacro())
        position += 1

        if (tokens.getOrNull(position) == "[") {
            if (tokens.getOrNull(position + 1) == "]") {
                paramType = PointerType(paramType, false)
                position += 2
            }
            else {
                val arraySize = tokens[position + 1]
                assert(tokens[position + 2] == "]")
                paramType = ArrayType(paramType, arraySize)
                position += 3
            }
        }

        params.add(Param(paramName, optional=optional, type=paramType))
        if (tokens[position] == ",") {
            position++
        }
        System.err.println("params=$params")
    }

    return Function(fName, params=params, result=retType)
}

private fun parseEnum(lines: List<String>, i: Int): Pair<List<Pair<String, String>>, Int> {
    var j = i
    val enumerators = mutableListOf<Pair<String, String>>()

    while (j < lines.size && !lines[j].startsWith("}")) {
        if (lines[j].startsWith("/*")) {
            while (!lines[j].endsWith("*/")) {
                j++
            }
            j++
        }
        else if (lines[j].startsWith("//") || lines[j].startsWith("#") || lines[j].isBlank()) {
            j++
        }
        else if (lines[j].contains("=")) {
            val parts = lines[j].split('=')
            val name = parts[0].trim()
            val values = mutableListOf<String>()
            if (parts.size > 1) {
                values.add(parts[1].trim().replace(",", ""))
            }

            if (lines[j].endsWith(",")) {
                j++
                enumerators.add(Pair(name, values.joinToString(" ")))
                continue
            }

            j++
            while (!lines[j].startsWith("}") && !lines[j].endsWith(",")) {
                values.add(lines[j].trim())
                j++
            }
            if (lines[j].endsWith(",")) {
                if (!lines[j].contains("=")) {
                    values.add(lines[j].substring(0, lines[j].length - 1).trim())
                    j++
                }
            }

            enumerators.add(Pair(name, values.joinToString(" ")))
        }
        else {
            throw RuntimeException("Unexpected line (${j + 1}): ${lines[j]}")
        }
    }

    return Pair(enumerators, j)
}

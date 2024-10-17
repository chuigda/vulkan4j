package extract

import ArrayType
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

fun extractVMAHeader(fileContent: String): Registry {
    var lines = fileContent.split('\n').map(String::trim)

    val constants = mutableMapOf<String, Constant>()
    val functions = mutableMapOf<String, Function>()
    val opaqueTypedefs = mutableMapOf<String, OpaqueTypedef>()
    val handles = mutableMapOf<String, Handle>()
    val functionTypedefs = mutableMapOf<String, FunctionTypedef>()

    var i = 0
    while (i < lines.size) {
        if (lines[i] == "#ifdef VMA_IMPLEMENTATION") {
            break
        }

        if (lines[i].startsWith("VK_DEFINE_HANDLE(") && lines[i].endsWith(")")) {
            val name = lines[i].substring(16, lines[i].length - 1)
            handles[name] = Handle(name, dispatchable=true)
        }

        if (lines[i].startsWith("VK_DEFINE_NON_DISPATCHABLE_HANDLE(") && lines[i].endsWith(")")) {
            val name = lines[i].substring(34, lines[i].length - 1)
            handles[name] = Handle(name, dispatchable=false)
        }

        if (lines[i].startsWith("typedef") && lines[i].contains("VKAPI_PTR") && lines[i].contains("PFN_")) {
            var j = i
            while (!lines[j].endsWith(");")) {
                j++
            }

            val functionTypedefString = lines.subList(i, j + 1).joinToString("")
            val functionTypedef = parseFunctionTypedef(functionTypedefString)
            functionTypedefs[functionTypedef.name] = functionTypedef

            i = j + 1
        }

        i++
    }

    return Registry(
        constants=constants,
        functions=functions,
        opaqueTypedefs=opaqueTypedefs,
        handles=handles,
        structs=mapOf(),
        functionTypedefs=functionTypedefs
    )
}

private fun parseFunctionTypedef(line: String): FunctionTypedef {
    val tokens = tokenize(line)
    if (tokens[0] != "typedef") {
        throw RuntimeException("Expected 'typedef'")
    }

    var (retType, position) = parseType(tokens, 1)
    if (tokens[position] != "(") {
        throw RuntimeException("Expected '('")
    }
    position++

    if (tokens[position] != "VKAPI_PTR") {
        throw RuntimeException("Expected 'VKAPI_PTR'")
    }
    position++

    if (tokens[position] != "*") {
        throw RuntimeException("Expected '*'")
    }
    position++

    val functionName = tokens[position]
    position++

    if (tokens[position] != ")") {
        throw RuntimeException("Expected ')'")
    }
    position++

    if (tokens[position] != "(") {
        throw RuntimeException("Expected '('")
    }
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

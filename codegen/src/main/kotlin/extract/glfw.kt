package extract

import ArrayType
import Constant
import Registry
import Function
import FunctionTypedef
import IdentifierType
import Member
import OpaqueTypedef
import Param
import PointerType
import Structure
import Type

fun extractGLFWHeader(fileContent: String): Registry {
    val lines = fileContent.split('\n').map(String::trim)

    val constants = mutableListOf<Constant>()
    val functions = mutableListOf<Function>()
    val opaqueTypedefs = mutableListOf<OpaqueTypedef>()
    val functionTypedefs = mutableListOf<FunctionTypedef>()
    for (line in lines) {
        if (line.startsWith("#define GLFW_")) {
            val parts = line.split(' ', limit = 3)
            if (parts.size < 3) {
                continue
            }

            val name = parts[1].trim()
            val value = parts[2].trim()
            constants.add(Constant(name, expr=value))
        }
        else if (line.startsWith("GLFWAPI")) {
            functions.add(parseCDecl(line.slice(8 until line.length)))
        }
        else if (line.startsWith("typedef struct") && line.endsWith(";")) {
            val tokens = tokenize(line)
            val aliasName = tokens[2]
            opaqueTypedefs.add(OpaqueTypedef(aliasName))
        }
        else if (line.startsWith("typedef" )
                 && (line.contains("proc") || line.contains("fun"))) {
            functionTypedefs.add(parseFunctionTypedef(line))
        }
    }

    return Registry(
        functions,
        opaqueTypedefs,
        handles=listOf(),
        structures=mutableListOf(),
        functionTypedefs
    )
}

fun addGLFWStructures(registry: Registry): Registry {
    val intType = IdentifierType("int")
    val ushortType = IdentifierType("unsigned short")
    val pushortType = PointerType(ushortType, const=false)
    val floatType = IdentifierType("float")
    val ucharType = IdentifierType("unsigned char")
    val byteArrayType = PointerType(ucharType, const=false)
    val structures = listOf(Structure(
        "GLFWvidmode",
        members=listOf(
            Member("width", type=intType),
            Member("height", type=intType),
            Member("redBits", type=intType),
            Member("greenBits", type=intType),
            Member("blueBits", type=intType),
            Member("refreshRate", type=intType)
        )
    ), Structure(
        "GLFWgammaramp",
        members=listOf(
            Member("red", type=pushortType),
            Member("green", type=pushortType),
            Member("blue", type=pushortType),
            Member("size", type=intType)
        )
    ), Structure(
        "GLFWimage",
        members=listOf(
            Member("width", type=intType),
            Member("height", type=intType),
            Member("pixels", type=byteArrayType)
        )
    ), Structure(
        "GLFWgamepadstate",
        members=listOf(
            Member("buttons", type=ArrayType(ucharType, "15")),
            Member("axes", type=ArrayType(floatType, "6"))
        )
    ), Structure(
        "GLFWallocator",
        members=listOf(
            Member("allocate", type=IdentifierType("GLFWallocatefun")),
            Member("reallocate", type=IdentifierType("GLFWreallocatefun")),
            Member("deallocate", type=IdentifierType("GLFWdeallocatefun")),
            Member("user", type=PointerType(IdentifierType("void")))
        )
    ))

    return Registry(
        registry.functions,
        registry.opaqueTypedefs,
        registry.handles,
        structures,
        registry.functionTypedefs
    )
}

private fun parseCDecl(line: String): Function {
    val tokens = tokenize(line)

    var (retType, position) = parseType(tokens, 0)
    val functionName = tokens[position]
    position++

    if (tokens[position] != "(") {
        println(tokens)
        println(position)
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

        params.add(Param(paramName, type=paramType))
        if (tokens[position] == ",") {
            position++
        }
    }

    if (tokens[position] != ")") {
        throw RuntimeException("Expected ')'")
    }

    return Function(functionName, params=params, result=retType)
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

        params.add(Param(paramName, type=paramType))
        if (tokens[position] == ",") {
            position++
        }
    }

    if (tokens[position] != ")") {
        throw RuntimeException("Expected ')'")
    }

    return FunctionTypedef(functionName, params=params, result=retType)
}

private fun parseType(tokens: List<String>, position: Int): Pair<Type, Int> {
    if (tokens[position] == "const") {
        val (pointerType, positionNext) = parseType(tokens, position + 1)
        return if (pointerType is PointerType) {
            Pair(PointerType(pointerType.pointee, true), positionNext)
        } else {
            Pair(pointerType, positionNext)
        }
    }
    else if (tokens[position] == "unsigned") {
        return parseType(tokens, position + 1)
    }
    else if (tokens[position] == "struct") {
        return parseType(tokens, position + 1)
    }
    else {
        var type: Type = IdentifierType(tokens[position])
        var positionNext = position + 1
        while (tokens.getOrNull(positionNext) == "*") {
            type = PointerType(type, false)
            positionNext++
        }
        return Pair(type, positionNext)
    }
}

private fun tokenize(line: String): List<String> {
    var position = 0
    val tokens = mutableListOf<String>()
    while (position < line.length) {
        position = skipWhitespace(line, position)
        if (position >= line.length) {
            break
        }

        val c = line[position]
        if (c == '(' || c == ')' || c == ',' || c == '*' || c == '[' || c == ']' || c == ';' || c == '=') {
            tokens.add(c.toString())
            position++
        }
        else {
            val start = position
            while (position < line.length && line[position].isIdentChar()) {
                position++
            }
            tokens.add(line.slice(start until position))
        }
    }

    return tokens
}

private fun skipWhitespace(line: String, position: Int): Int {
    var i = position
    while (i < line.length && line[i].isWhitespace()) {
        i++
    }
    return i
}

private fun Char.isIdentChar(): Boolean {
    return this.isLetterOrDigit() || this == '_'
}

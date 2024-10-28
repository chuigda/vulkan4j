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

    val constants = mutableMapOf<String, Constant>()
    val functions = mutableMapOf<String, Function>()
    val opaqueTypedefs = mutableMapOf<String, OpaqueTypedef>()
    val functionTypedefs = mutableMapOf<String, FunctionTypedef>()
    for (line in lines) {
        if (line.startsWith("#define GLFW_")) {
            val parts = line.split(' ', limit = 3)
            if (parts.size < 3) {
                continue
            }

            val name = parts[1].trim()
            val value = parts[2].trim()
            constants[name] = Constant(name, expr=value)
        }
        else if (line.startsWith("GLFWAPI")) {
            val function = parseCDecl(line.slice(8 until line.length))
            functions[function.name] = function
        }
        else if (line.startsWith("typedef struct") && line.endsWith(";")) {
            val tokens = tokenize(line)
            val aliasName = tokens[2]
            opaqueTypedefs[aliasName] = OpaqueTypedef(aliasName)
        }
        else if (line.startsWith("typedef" )
                 && (line.contains("proc") || line.contains("fun"))) {
            val functionTypedef = parseFunctionTypedef(line)
            functionTypedefs[functionTypedef.name] = functionTypedef
        }
    }

    return Registry(
        constants=constants,
        functions=functions,
        opaqueTypedefs=opaqueTypedefs,
        handles=mapOf(),
        structs=mapOf(),
        functionTypedefs=functionTypedefs,
        bitmasks=mapOf(),
        enums=mapOf(),
    )
}

fun addGLFWStructures(registry: Registry): Registry {
    val intType = IdentifierType("int")
    val ushortType = IdentifierType("unsigned short")
    val pushortType = PointerType(ushortType, const=false)
    val floatType = IdentifierType("float")
    val ucharType = IdentifierType("unsigned char")
    val byteArrayType = PointerType(ucharType, const=false)
    val structures = mapOf(
        "GLFWvidmode" to Structure(
            "GLFWvidmode",
            members=listOf(
                Member("width", type=intType),
                Member("height", type=intType),
                Member("redBits", type=intType),
                Member("greenBits", type=intType),
                Member("blueBits", type=intType),
                Member("refreshRate", type=intType)
            )
        ),
        "GLFWgammaramp" to Structure(
            "GLFWgammaramp",
            members=listOf(
                Member("red", type=pushortType),
                Member("green", type=pushortType),
                Member("blue", type=pushortType),
                Member("size", type=intType)
            )
        ),
        "GLFWimage" to Structure(
            "GLFWimage",
            members=listOf(
                Member("width", type=intType),
                Member("height", type=intType),
                Member("pixels", type=byteArrayType)
            )
        ),
        "GLFWgamepadstate" to Structure(
            "GLFWgamepadstate",
            members=listOf(
                Member("buttons", type=ArrayType(ucharType, "15")),
                Member("axes", type=ArrayType(floatType, "6"))
            )
        ),
        "GLFWallocator" to Structure(
            "GLFWallocator",
            members=listOf(
                Member("allocate", type=IdentifierType("GLFWallocatefun")),
                Member("reallocate", type=IdentifierType("GLFWreallocatefun")),
                Member("deallocate", type=IdentifierType("GLFWdeallocatefun")),
                Member("user", type=PointerType(IdentifierType("void")))
            )
        )
    )

    return Registry(
        constants=registry.constants,
        functions=registry.functions,
        opaqueTypedefs=registry.opaqueTypedefs,
        handles=registry.handles,
        structs=structures,
        functionTypedefs=registry.functionTypedefs,
        bitmasks=registry.bitmasks,
        enums=registry.enums
    )
}

private fun parseCDecl(line: String): Function {
    val tokens = tokenize(line)

    var (retType, position) = parseType(tokens, 0)
    val functionName = tokens[position]
    position++

    if (tokens[position] != "(") {
        System.err.println(tokens)
        System.err.println(position)
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

        params.add(Param(paramName, type=paramType, optional=true))
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

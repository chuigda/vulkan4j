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

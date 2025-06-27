package club.doki7.babel.extract.webgpu

import club.doki7.babel.registry.Bitflag
import club.doki7.babel.registry.Bitmask
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Constant
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.EnumVariant
import club.doki7.babel.registry.Enumeration
import club.doki7.babel.registry.FunctionTypedef
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.OpaqueHandleTypedef
import club.doki7.babel.registry.Param
import club.doki7.babel.registry.PointerType
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.Typedef
import club.doki7.babel.registry.putEntityIfAbsent
import kotlin.io.path.Path
import kotlinx.serialization.json.*
import java.math.BigInteger

private val inputDir = Path("codegen-v2/input")

fun extractWebGPURegistry(): Registry<EmptyMergeable> {
    val jsonString = inputDir.resolve("webgpu.json").toFile().readText()
    val idl = Json.decodeFromString<IDL>(jsonString)

    val registry = Registry(ext = EmptyMergeable())
    extractObjects(registry, idl.objects)
    extractFunctionTypedefs(registry, idl.callbacks)
    extractStructures(registry, idl.structs)
    extractEnumeration(registry, idl.enums)
    extractBitmask(registry, idl.bitflags)
    extractFunctions(registry, idl.functions)
    extractConstants(registry, idl.constants)

    for (structure in coreStructures) {
        registry.structures.putEntityIfAbsent(structure)
    }
    registry.aliases.putEntityIfAbsent(Typedef(
        name = "WGPUBool",
        type = IdentifierType("uint32_t")
    ))

    registry += extractRustWGPURegistry()

    return registry
}

private fun extractObjects(registry: RegistryBase, objects: List<IDLObject>) {
    for (obj in objects) {
        val objectTypeName = renameWGPUType(obj.name)
        registry.opaqueHandleTypedefs.putEntityIfAbsent(OpaqueHandleTypedef(name = objectTypeName))
        extractObjectMethods(registry, objectTypeName, obj.name, obj.methods)

        val idlReferenceCommandName = "${obj.name}_add_ref"
        val referenceCommand = Command(
            name = renameWGPUFunction(idlReferenceCommandName),
            params = listOf(Param(
                name = renameWGPUVar(obj.name),
                type = IdentifierType(objectTypeName),
                len = null,
                argLen = null,
                optional = false
            )),
            result = IdentifierType("void"),
            successCodes = emptyList(),
            errorCodes = emptyList()
        )
        referenceCommand.rename(renameWGPUVar(idlReferenceCommandName))
        registry.commands.putEntityIfAbsent(referenceCommand)

        val idlReleaseCommandName = "${obj.name}_release"
        val releaseCommand = Command(
            name = renameWGPUFunction(idlReleaseCommandName),
            params = listOf(Param(
                name = renameWGPUVar(obj.name),
                type = IdentifierType(objectTypeName),
                len = null,
                argLen = null,
                optional = false
            )),
            result = IdentifierType("void"),
            successCodes = emptyList(),
            errorCodes = emptyList()
        )
        releaseCommand.rename(renameWGPUVar(idlReleaseCommandName))
        registry.commands.putEntityIfAbsent(releaseCommand)
    }
}

private fun extractObjectMethods(
    registry: RegistryBase,
    objectType: String,
    objectTypeOriginalName: String,
    methods: List<IDLFunction>
) {
    for (method in methods) {
        val idlMethodName = "${objectTypeOriginalName}_${method.name}"

        val params = mutableListOf(Param(
            name = renameWGPUVar(objectTypeOriginalName),
            type = IdentifierType(objectType),
            len = null,
            argLen = null,
            optional = false
        ))
        method.args?.forEach {
            arg -> if (isIDLTypeArray(arg.type)) {
                params.add(Param(
                    name = renameWGPUVar(singularize(arg.name)) + "Count",
                    type = IdentifierType("size_t"),
                    len = null,
                    argLen = null,
                    optional = arg.optional
                ))

                val type = classifyType(arg.type.removeSurrounding("array<", ">"), arg.pointer)
                params.add(Param(
                    name = renameWGPUVar(arg.name),
                    type = type,
                    len = null,
                    argLen = null,
                    optional = arg.optional
                ))
            } else {
                params.add(extractFunctionParam(arg))
            }
        }

        val result = if (method.callback != null) {
            IdentifierType("WGPUFuture")
        } else if (method.returns != null) {
            classifyType(method.returns.type, method.returns.pointer)
        } else {
            IdentifierType("void")
        }

        if (method.callback != null) {
            params.add(Param(
                name = "callbackInfo",
                type = classifyCallbackInfoType(method.callback),
                len = null,
                argLen = null,
                optional = false
            ))
        }

        val command = Command(
            name = renameWGPUFunction(idlMethodName),
            params = params,
            result = result,
            successCodes = emptyList(),
            errorCodes = emptyList()
        )
        command.rename(renameWGPUVar(idlMethodName))
        registry.commands.putEntityIfAbsent(command)
    }
}

private fun extractFunctionTypedefs(registry: RegistryBase, callbacks: List<IDLCallback>) {
    for (callback in callbacks) {
        val callbackName = renameWGPUFunctionPointer(callback.name)
        val params = callback.args.map { arg -> classifyType(arg.type, arg.pointer) }.toMutableList()
        params.add(PointerType(IdentifierType("void"))) // userdata1
        params.add(PointerType(IdentifierType("void"))) // userdata2

        registry.functionTypedefs.putEntityIfAbsent(FunctionTypedef(
            name = callbackName,
            params = params,
            result = IdentifierType("void")
        ))

        val callbackInfoName = "${callbackName}Info"
        registry.structures.putEntityIfAbsent(Structure(
            name = callbackInfoName,
            members = mutableListOf(
                Member(
                    name = "nextInChain",
                    type = PointerType(IdentifierType("WGPUChainedStruct"), const = true),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = true,
                    bits = null
                ),
                Member(
                    name = "mode",
                    type = IdentifierType("WGPUCallbackMode"),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = false,
                    bits = null
                ),
                Member(
                    name = "callback",
                    type = IdentifierType(callbackName),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = true,
                    bits = null
                ),
                Member(
                    name = "userdata1",
                    type = PointerType(IdentifierType("void"), const = false),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = true,
                    bits = null
                ),
                Member(
                    name = "userdata2",
                    type = PointerType(IdentifierType("void"), const = false),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = true,
                    bits = null
                )
            )
        ))
    }
}

private fun extractStructures(registry: RegistryBase, structs: List<IDLStructure>) {
    for (struct in structs) {
        val members = mutableListOf<Member>()

        if (struct.type != "standalone") {
            members.add(Member(
                name = "nextInChain",
                type = PointerType(IdentifierType("WGPUChainedStruct"), const = true),
                values = null,
                len = null,
                altLen = null,
                optional = true,
                bits = null
            ))
        }

        struct.members.forEach { member ->
            if (isIDLTypeArray(member.type)) {
                val type = classifyType(member.type.removeSurrounding("array<", ">"), member.pointer)
                members.add(Member(
                    name = renameWGPUVar(singularize(member.name)) + "Count",
                    type = IdentifierType("size_t"),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = member.optional,
                    bits = null
                ))
                members.add(Member(
                    name = renameWGPUVar(member.name),
                    type = type,
                    values = null,
                    len = null,
                    altLen = null,
                    optional = member.optional,
                    bits = null
                ))
            } else if (member.type.startsWith("callback.")) {
                val typeName = renameWGPUFunctionPointer(member.type.removePrefix("callback.")) + "Info"
                members.add(Member(
                    name = renameWGPUVar(member.name),
                    type = IdentifierType(typeName),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = member.optional,
                    bits = null
                ))
            } else {
                members.add(Member(
                    name = renameWGPUVar(member.name),
                    type = classifyType(member.type, member.pointer),
                    values = null,
                    len = null,
                    altLen = null,
                    optional = member.optional,
                    bits = null
                ))
            }
        }

        registry.structures.putEntityIfAbsent(Structure(
            name = renameWGPUType(struct.name),
            members = members
        ))
    }
}

private fun extractEnumeration(registry: RegistryBase, enums: List<IDLEnumeration>) {
    for (enum in enums) {
        registry.enumerations.putEntityIfAbsent(Enumeration(
            name = renameWGPUType(enum.name),
            variants = enum.entries.mapIndexed { idx, variant ->
                if (variant == null) {
                    null
                } else {
                    var variantName = variant.name.uppercase()
                    if (variantName.first().isDigit()) {
                        variantName = "_$variantName"
                    }
                    EnumVariant(
                        name = variantName,
                        value = idx.toLong(),
                    )
                }
            }.filter { it -> it != null }.map { it as EnumVariant }.toMutableList()
        ))
    }
}

private fun extractBitmask(registry: RegistryBase, bitmasks: List<IDLBitmask>) {
    for (bitmask in bitmasks) {
        registry.bitmasks.putEntityIfAbsent(Bitmask(
            name = renameWGPUType(bitmask.name),
            bitwidth = 64,
            bitflags = bitmask.entries.mapIndexed { idx, bitflag ->
                var bitflagName = bitflag.name.uppercase()
                if (bitflagName.first().isDigit()) {
                    bitflagName = "_$bitflagName"
                }
                Bitflag(
                    name = bitflagName,
                    value = if (idx == 0) BigInteger.ZERO else BigInteger.ONE.shiftLeft(idx - 1),
                )
            }.toMutableList()
        ))
    }
}

private fun extractFunctions(registry: RegistryBase, functions: List<IDLFunction>) {
    for (function in functions) {
        val command = Command(
            name = renameWGPUFunction(function.name),
            params = if (function.args != null) {
                function.args.map(::extractFunctionParam).toList()
            } else {
                emptyList()
            },
            result = if (function.returns != null) {
                classifyType(function.returns.type, function.returns.pointer)
            } else {
                IdentifierType("void")
            },
            successCodes = emptyList(),
            errorCodes = emptyList()
        )
        command.rename(renameWGPUVar(function.name))
        registry.commands.putEntityIfAbsent(command)
    }
}

private fun extractConstants(registry: RegistryBase, constants: List<IDLConstant>) {
    for (constant in constants) {
        val mappedConstant = constantTypeMappings[constant.value]
            ?: error("Unknown constant value: ${constant.value}")

        registry.constants.putEntityIfAbsent(Constant(
            name = "WGPU_" + constant.name.uppercase(),
            type = mappedConstant.identType,
            expr = mappedConstant.javaExpression
        ))
    }
}

private fun extractFunctionParam(arg: IDLFunctionArg): Param = Param(
    name = renameWGPUVar(arg.name),
    type = classifyType(arg.type, arg.pointer),
    len = null,
    argLen = null,
    optional = arg.optional
)

private fun classifyCallbackInfoType(callbackString: String): IdentifierType {
    val typeName = renameWGPUFunctionPointer(callbackString.removePrefix("callback.")) + "Info"
    return IdentifierType(typeName)
}

// https://github.com/webgpu-native/webgpu-headers/blob/bac520839ff5ed2e2b648ed540bd9ec45edbccbc/gen/utils.go#L112
private fun singularize(s: String) = if (s == "entries") "entry" else s.removeSuffix("s")

private val coreStructures = listOf(
    Structure(
        name = "WGPUStringView",
        members = mutableListOf(
            Member(
                name = "data",
                type = PointerType(IdentifierType("char"), const = true),
                values = null,
                len = null,
                altLen = null,
                optional = true,
                bits = null
            ),
            Member(
                name = "length",
                type = IdentifierType("size_t"),
                values = null,
                len = null,
                altLen = null,
                optional = false,
                bits = null
            )
        )
    ),
    Structure(
        name = "WGPUChainedStruct",
        members = mutableListOf(
            Member(
                name = "next",
                type = PointerType(IdentifierType("WGPUChainedStruct")),
                values = null,
                len = null,
                altLen = null,
                optional = true,
                bits = null
            ),
            Member(
                name = "sType",
                type = IdentifierType("WGPUSType"),
                values = null,
                len = null,
                altLen = null,
                optional = false,
                bits = null
            )
        )
    ),
    Structure(
        name = "WGPUChainedStructOut",
        members = mutableListOf(
            Member(
                name = "next",
                type = PointerType(IdentifierType("WGPUChainedStructOut")),
                values = null,
                len = null,
                altLen = null,
                optional = true,
                bits = null
            ),
            Member(
                name = "sType",
                type = IdentifierType("WGPUSType"),
                values = null,
                len = null,
                altLen = null,
                optional = false,
                bits = null
            )
        )
    )
)

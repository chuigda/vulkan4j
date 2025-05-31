package club.doki7.babel.codegen

import club.doki7.babel.ctype.CArrayType
import club.doki7.babel.ctype.CHandleType
import club.doki7.babel.ctype.CNonRefType
import club.doki7.babel.ctype.CPlatformDependentIntType
import club.doki7.babel.ctype.CPointerType
import club.doki7.babel.ctype.CStructType
import club.doki7.babel.ctype.CType
import club.doki7.babel.ctype.CVoidType
import club.doki7.babel.ctype.lowerType
import club.doki7.babel.registry.Command
import club.doki7.babel.registry.Param
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateCommandFile(
    registry: RegistryBase,
    className: String,
    commands: List<Command>,
    codegenOptions: CodegenOptions,
    subpackage: String?,
    javaDoc: Doc? = null
) = buildDoc {
    val packageName = codegenOptions.packageName

    // region imports
    if (subpackage != null) {
        +"package $packageName.$subpackage;"
    } else {
        +"package $packageName;"
    }
    +""
    imports("java.lang.foreign.*")
    imports("java.lang.invoke.MethodHandle")
    imports("java.util.Objects")
    +""
    imports("org.jetbrains.annotations.Nullable")
    imports("club.doki7.ffm.NativeLayout")
    imports("club.doki7.ffm.RawFunctionLoader")
    imports("club.doki7.ffm.annotation.*")
    imports("club.doki7.ffm.ptr.*")
    if (registry.bitmasks.isNotEmpty()) {
        imports("$packageName.bitmask.*")
    }
    if (registry.structures.isNotEmpty()) {
        imports("$packageName.datatype.*")
    }
    if (registry.enumerations.isNotEmpty()) {
        imports("$packageName.enumtype.*")
    }
    if (registry.opaqueHandleTypedefs.isNotEmpty()) {
        imports("$packageName.handle.*")
    }

    codegenOptions.extraImport.forEach {
        imports(it)
    }
    +""
    // endregion

    if (javaDoc != null) {
        +javaDoc
    }
    +"public final class $className {"
    indent {
        val locallySuppliedCommands = commands.map { it.name.original }.toSet()
        val loweredCommand = commands.map { lowerCommand(it, registry, codegenOptions) }.toList()

        +"public $className(RawFunctionLoader loader) {"
        indent {
            loweredCommand.forEach {
                val funcOriginalName = it.command.name.original
                val descriptorFuncName = if (it.command.aliasTo != null && locallySuppliedCommands.contains(it.command.aliasTo!!.original)) {
                    it.command.aliasTo!!.original
                } else {
                    funcOriginalName
                }

                val segmentName = "SEGMENT$$funcOriginalName"
                val handleName = "HANDLE$$funcOriginalName"
                val descriptorName = "Descriptors.DESCRIPTOR$$descriptorFuncName"

                +"$segmentName = loader.apply(\"$funcOriginalName\");"
                +"$handleName = RawFunctionLoader.link($segmentName, $descriptorName);"
            }
        }
        +"}"
        +""

        +"// region command wrappers"
        +""
        loweredCommand.forEachIndexed { idx, it ->
            +generateCommandWrapper(it, codegenOptions)
            if (idx != loweredCommand.size - 1) {
                +""
            }
        }
        +"// endregion"
        +""

        +"// region segments and handles"
        loweredCommand.forEach {
            +"public final @Nullable MemorySegment SEGMENT$${it.command.name.original};"
        }

        loweredCommand.forEach {
            +"public final @Nullable MethodHandle HANDLE$${it.command.name.original};"
        }
        +"// endregion"
        +""

        +"public static final class Descriptors {"
        indent {
            loweredCommand
                .filter { it.command.aliasTo == null || !locallySuppliedCommands.contains(it.command.aliasTo!!.original) }
                .forEach {
                    +generateFunctionDescriptor(it)
                    +""
                }
            +prohibitUserConstruct("Descriptors")
        }
        +"}"
    }
    +"}"
}

data class LoweredCommand(
    val paramCType: List<CType>,
    val result: CType,
    val command: Command
)

private fun lowerCommand(
    command: Command,
    registry: RegistryBase,
    codegenOptions: CodegenOptions
) = LoweredCommand(
    paramCType = command.params.map { lowerType(registry, codegenOptions.refRegistries, it.type) }.toList(),
    result = lowerType(registry, codegenOptions.refRegistries, command.result),
    command = command
)

private fun generateCommandWrapper(
    loweredCommand: LoweredCommand,
    codegenOptions: CodegenOptions
) = buildDoc {
    val paramIOTypes = mutableListOf<String>()
    val callArgs = mutableListOf<String>()

    for ((index, paramCType) in loweredCommand.paramCType.withIndex()) {
        val param = loweredCommand.command.params[index]
        val type = generateInputOutputType(paramCType, param.optional)

        paramIOTypes.add(type)
        callArgs.add(generateInputConvert(paramCType, param))
    }

    val retIOType = generateInputOutputType(loweredCommand.result, false)

    val callArgsDoc = buildDoc {
        callArgs.forEachIndexed { idx, it -> +if (idx != callArgs.size - 1) "$it, " else it }
    }

    loweredCommand.command.doc?.forEach { +"/// $it" }

    val seeLink = codegenOptions.seeLinkProvider(loweredCommand.command)
    if (seeLink != null) {
        +"/// @see $seeLink"
    }

    if (paramIOTypes.isNotEmpty()) {
        +"public $retIOType ${loweredCommand.command.name}("
        indent {
            for ((index, param) in loweredCommand.command.params.withIndex()) {
                val paramIOType = paramIOTypes[index]
                if (index != paramIOTypes.size - 1) {
                    +"$paramIOType ${param.name}, "
                } else {
                    +"$paramIOType ${param.name}"
                }
            }
        }
        +") {"
    } else {
        +"public $retIOType ${loweredCommand.command.name}() {"
    }

    indent {
        +"MethodHandle hFunction = Objects.requireNonNull(HANDLE$${loweredCommand.command.name.original});"
        +"try {"
        indent {
            if (loweredCommand.result is CVoidType) {
                +"hFunction.invokeExact("
                indent { +callArgsDoc }
                +");"
            } else {
                val (beforeCall, afterCall, nextStmt) = generateResultConvert(loweredCommand.result)
                +"${beforeCall}hFunction.invokeExact("
                indent { +callArgsDoc }
                +")$afterCall;"
                if (nextStmt != null) {
                    +nextStmt
                }
            }
        }
        +"} catch (Throwable e) {"
        indent {
            +"throw new RuntimeException(e);"
        }
        +"}"
    }

    +"}"
}

private fun generateFunctionDescriptor(loweredCommand: LoweredCommand) = buildDoc {
    val descriptorName = "DESCRIPTOR$${loweredCommand.command.name.original}"

    if (loweredCommand.result is CVoidType) {
        +"public static final FunctionDescriptor $descriptorName = FunctionDescriptor.ofVoid("
    } else {
        +"public static final FunctionDescriptor $descriptorName = FunctionDescriptor.of("
    }
    indent {
        if (loweredCommand.result !is CVoidType) {
            val hasComma = loweredCommand.paramCType.isNotEmpty()
            +"${loweredCommand.result.jLayout}${if (hasComma) "," else ""}"
        }

        loweredCommand.paramCType.forEachIndexed { idx, it ->
            if (idx != loweredCommand.paramCType.size - 1) {
                +"${it.jLayout}, "
            } else {
                +it.jLayout
            }
        }
    }
    +");"
}

private fun generateInputOutputType(type: CType, optional: Boolean): String {
    val nullablePrefix = if (optional) "@Nullable " else ""

    return when (type) {
        is CVoidType -> "void"
        is CPointerType -> when (type.pointee) {
            is CNonRefType -> "${nullablePrefix}${type.pointee.jPtrType}"
            is CStructType -> if (type.pointerToOne) {
                "$nullablePrefix@Pointer ${type.pointee.name}"
            } else {
                "$nullablePrefix@Pointer ${type.pointee.jType}"
            }
            is CHandleType -> "${nullablePrefix}@Pointer ${type.pointee.name}.Ptr"
            is CPointerType -> "${nullablePrefix}PointerPtr"
            is CVoidType -> type.jType
            else -> error("unsupported pointer type: $type")
        }
        is CHandleType -> "${nullablePrefix}${type.name}"
        is CArrayType -> {
            val flattened = type.flattened
            when (flattened.element) {
                is CNonRefType -> flattened.element.jPtrType
                is CStructType -> flattened.element.jType
                else -> error("unsupported array type: $type")
            }
        }
        is CStructType -> type.name
        is CNonRefType -> type.jType
    }
}

private fun generateInputConvert(type: CType, param: Param) = when (type) {
    is CPointerType -> when (type.pointee) {
        is CNonRefType, is CStructType, is CHandleType, is CPointerType -> if (param.optional) {
            "(MemorySegment) (${param.name} != null ? ${param.name}.segment() : MemorySegment.NULL)"
        }
        else {
            "${param.name}.segment()"
        }
        is CVoidType -> param.name.toString()
        else -> throw Exception("unsupported pointer type: $type")
    }
    is CHandleType -> if (param.optional) {
        "(MemorySegment) (${param.name} != null ? ${param.name}.segment() : MemorySegment.NULL)"
    } else {
        "${param.name}.segment()"
    }
    is CStructType -> "${param.name}.segment()"
    is CArrayType -> {
        val flattened = type.flattened
        when (flattened.element) {
            is CNonRefType -> "${param.name}.segment()"
            is CStructType, is CHandleType -> "(${param.name} != null && ${param.name}.length != 0) ? ${param.name}.segment() : MemorySegment.NULL"
            else -> throw Exception("unsupported array type: $type")
        }
    }
    is CNonRefType -> {
        if (type is CPlatformDependentIntType && type.cType == "size_t") {
            "MemorySegment.ofAddress(${param.name})"
        }
        else {
            param.name.toString()
        }
    }
    else -> throw Exception("unsupported parameter type: $type")
}

private fun generateResultConvert(retType: CType): Triple<String, String, String?> = when (retType) {
    is CPointerType -> when (retType.pointee) {
        is CNonRefType -> Triple(
            "MemorySegment s = (MemorySegment) ",
            "",
            "return s.equals(MemorySegment.NULL) ? null : new ${retType.pointee.jPtrTypeNoAnnotation}(s);"
        )
        is CStructType -> Triple(
            "MemorySegment s = (MemorySegment) ",
            "",
            "return s.equals(MemorySegment.NULL) ? null : new ${retType.pointee.name}(s);"
        )
        is CHandleType -> Triple(
            "MemorySegment s = (MemorySegment) ",
            "",
            "return s.equals(MemorySegment.NULL) ? null : new ${retType.pointee.name}.Ptr(s);"
        )
        is CPointerType -> Triple(
            "MemorySegment s = (MemorySegment) ",
            "",
            "return s.equals(MemorySegment.NULL) ? null : new PointerPtr(s);"
        )
        is CVoidType -> Triple(
            "return (MemorySegment) ",
            "",
            null
        )
        else -> error("unsupported pointer type: $retType")
    }
    is CHandleType -> Triple(
        "MemorySegment s = (MemorySegment) ",
        "",
        "return s.equals(MemorySegment.NULL) ? null : new ${retType.name}(s);"
    )
    is CNonRefType -> Triple(
        "return (${retType.jTypeNoAnnotation}) ",
        "",
        null
    )
    is CStructType -> Triple(
        "return new ${retType.name}((MemorySegment) ",
        ")",
        null
    )
    else -> error("unsupported return type: $retType")
}

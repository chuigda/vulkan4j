package codegen

import Command
import FunctionTypedef
import Param
import Registry
import appendLn

fun generateCommandClassFile(
    registry: Registry,
    commands: List<Command>,
    packageName: String,
    artifactPackageName: String,
    className: String,
    importExtra: List<String>? = null,
    docLinkGenerator: ((String) -> String)? = null
): String {
    val commandParamTypes = mutableListOf<List<CType>>()
    val commandRetTypes = mutableListOf<CType>()
    val commandDescriptors = mutableListOf<String>()
    val commandWrappers = mutableListOf<String>()

    for (command in commands) {
        val (descriptor, paramTypes, retType) = generateFunctionDescriptor(registry, command)
        commandDescriptors.add(descriptor)
        commandParamTypes.add(paramTypes)
        commandRetTypes.add(retType)

        val wrapper = generateFunctionWrapper(command, paramTypes, retType, docLinkGenerator)
        commandWrappers.add(wrapper)
    }

    return buildString {
        appendLn("""
            package $packageName;

            import java.lang.foreign.*;
            import java.lang.invoke.MethodHandle;

            import org.jetbrains.annotations.Nullable;
            import tech.icey.panama.RawFunctionLoader;
            import tech.icey.panama.NativeLayout;
            import tech.icey.panama.annotation.*;
            import tech.icey.panama.buffer.*;
        """.trimIndent())

        if (registry.structures.isNotEmpty()) {
            appendLn("import $artifactPackageName.datatype.*;")
        }
        if (registry.handles.isNotEmpty() || registry.opaqueTypedefs.isNotEmpty()) {
            appendLn("import $artifactPackageName.handle.*;")
        }

        if (importExtra != null) {
            for (import in importExtra) {
                appendLn("import $import;")
            }
        }
        appendLn()

        appendLn("public final class $className {")
        for (wrapper in commandWrappers) {
            appendLn(indent(wrapper, 1))
        }

        for (descriptor in commandDescriptors) {
            appendLn(indent(descriptor, 1))
        }
        appendLn()

        for (function in commands) {
            appendLn(indent("public final @Nullable MemorySegment SEGMENT$${function.name};", 1))
        }
        appendLn()

        for (function in commands) {
            appendLn(indent("public final @Nullable MethodHandle HANDLE$${function.name};", 1))
        }
        appendLn()

        appendLn(indent("""
            public ${className}(RawFunctionLoader loader) {
        """.trimIndent(), 1))
        for (function in commands) {
            appendLn(indent("SEGMENT$${function.name} = loader.apply(\"${function.name}\");", 2))
            appendLn(indent("HANDLE$${function.name} = RawFunctionLoader.link(SEGMENT$${function.name}, DESCRIPTOR$${function.name});", 2))
        }
        appendLn(indent("}", 1))
        appendLn("}")
    }
}

fun generateFunctionDescriptorClassFile(
    registry: Registry,
    typedefs: List<FunctionTypedef>,
    packageName: String,
    className: String
): String = buildString {
    appendLn("""
        package $packageName;

        import java.lang.foreign.*;

        import tech.icey.panama.NativeLayout;
    """.trimIndent())

    appendLn()

    appendLn("public final class $className {")
    for (typedef in typedefs) {
        val retType = if (typedef.result != null) { lowerType(registry, typedef.result) } else { voidType }
        val paramTypes = typedef.params.map { lowerType(registry, it.type) }
        val descriptor = impGenerateFunctionDescriptor(typedef.name, retType, paramTypes)
        appendLn(indent(descriptor, 1))
    }
    appendLn("}")
}

private fun generateFunctionDescriptor(
    registry: Registry,
    command: Command
): Triple<String, List<CType>, CType> {
    val retType = if (command.result != null) { lowerType(registry, command.result) } else { voidType }
    val paramTypes = command.params.map { lowerType(registry, it.type) }
    val descriptor = impGenerateFunctionDescriptor("DESCRIPTOR$${command.name}", retType, paramTypes)
    return Triple(descriptor, paramTypes, retType)
}

private fun impGenerateFunctionDescriptor(
    descriptorName: String,
    retType: CType,
    paramTypes: List<CType>
): String = buildString {
    val paramTypeLayouts = paramTypes.joinToString(",\n") { it.jLayout }
    if (retType is CVoidType) {
        if (paramTypes.isNotEmpty()) {
            appendLn("public static final FunctionDescriptor $descriptorName = FunctionDescriptor.ofVoid(")
        }
        else {
            append("public static final FunctionDescriptor $descriptorName = FunctionDescriptor.ofVoid(")
        }
    }
    else {
        appendLn("public static final FunctionDescriptor $descriptorName = FunctionDescriptor.of(")
        if (paramTypes.isNotEmpty()) {
            appendLn(indent("${retType.jLayout},", 2))
        }
        else {
            appendLn(indent(retType.jLayout, 2))
        }
    }
    if (paramTypes.isNotEmpty()) {
        appendLn(indent(paramTypeLayouts, 2))
    }
    append(");")
}

private fun generateFunctionWrapper(
    command: Command,
    paramTypes: List<CType>,
    retType: CType,
    docLinkGenerator: ((String) -> String)?
): String {
    val params = mutableListOf<String>()
    val callArgs = mutableListOf<String>()
    for (i in paramTypes.indices) {
        val param = command.params[i]
        val paramType = paramTypes[i]

        val paramIOType = generateInputOutputType(paramType, param.optional)
        params.add("$paramIOType ${param.name}")
        callArgs.add(generateInputConvert(paramType, param))
    }

    val retIOType = generateInputOutputType(retType, true)
    val callExpr = buildString {
        if (params.isEmpty()) {
            append("HANDLE$${command.name}.invokeExact()")
        }
        else {
            appendLn("HANDLE$${command.name}.invokeExact(")
            appendLn(indent(callArgs.joinToString(",\n"), 2))
            append(")")
        }
    }

    return buildString {
        if (docLinkGenerator != null) {
            appendLn("/// @see ${docLinkGenerator(command.name)}")
        }

        if (params.isNotEmpty()) {
            appendLn("public $retIOType ${command.name}(")
            appendLn(indent(params.joinToString(",\n"), 2))
            appendLn(") {")
        }
        else {
            appendLn("public $retIOType ${command.name}() {")
        }
        appendLn(indent("try {", 1))
        if (retType is CVoidType) {
            append(indent(callExpr, 2))
            appendLn(";")
        }
        else {
            appendLn(indent(generateResultConvert(retType, callExpr), 2))
        }
        appendLn(indent("} catch (Throwable t) {", 1))
        appendLn(indent("throw new RuntimeException(t);", 2))
        appendLn(indent("}", 1))
        appendLn("}")
    }
}

fun generateInputOutputType(type: CType, optional: Boolean): String {
    val nullablePrefix = if (optional) "@Nullable " else ""

    return when (type) {
        is CVoidType -> "void"
        is CPointerType -> when (type.pointee) {
            is CNonRefType -> "${nullablePrefix}${type.pointee.jBufferType}"
            is CStructType -> "${nullablePrefix}@pointer(target=${type.pointee.name}.class) ${type.pointee.name}"
            is CHandleType -> "${nullablePrefix}@pointer(target=${type.pointee.name}.class) ${type.pointee.name}.Buffer"
            is CPointerType -> "${nullablePrefix}PointerBuffer"
            is CVoidType -> type.jType
            else -> throw Exception("unsupported pointer type: $type")
        }
        is CHandleType -> "${nullablePrefix}${type.name}"
        is CArrayType -> {
            val flattened = type.flattened
            when (flattened.element) {
                is CNonRefType -> flattened.element.jBufferType
                is CStructType -> "${flattened.element.name}[]"
                else -> throw Exception("unsupported array type: $type")
            }
        }
        is CStructType -> type.name
        is CNonRefType -> type.jType
    }
}

fun generateInputConvert(type: CType, param: Param): String = when (type) {
    is CPointerType -> when (type.pointee) {
        is CNonRefType, is CStructType, is CHandleType, is CPointerType -> if (param.optional) {
            "(MemorySegment) (${param.name} != null ? ${param.name}.segment() : MemorySegment.NULL)"
        }
        else {
            "${param.name}.segment()"
        }
        is CVoidType -> param.name
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
            is CStructType, is CHandleType -> "(${param.name} != null && ${param.name}.length != 0) ? ${param.name}[0].segment() : MemorySegment.NULL"
            else -> throw Exception("unsupported array type: $type")
        }
    }
    is CNonRefType -> {
        if (type is CPlatformDependentIntType && type.cType == "size_t") {
            "MemorySegment.ofAddress(${param.name})"
        }
        else {
            param.name
        }
    }
    else -> throw Exception("unsupported parameter type: $type")
}

fun generateResultConvert(retType: CType, fnCall: String): String = when (retType) {
    is CPointerType -> when (retType.pointee) {
        is CNonRefType -> """MemorySegment s = (MemorySegment) ${fnCall};
return s.address() == 0 ? null : new ${retType.pointee.jBufferTypeNoAnnotation}(s);"""
        is CStructType -> """MemorySegment s = (MemorySegment) ${fnCall};
return s.address() == 0 ? null : new ${retType.pointee.name}(s);"""
        is CHandleType -> """MemorySegment s = (MemorySegment) ${fnCall};
return s.address() == 0 ? null : new ${retType.pointee.name}.Buffer(s);"""
        is CPointerType -> """MemorySegment s = (MemorySegment) ${fnCall};
return s.address() == 0 ? null : new PointerBuffer(s);"""
        is CVoidType -> "return (MemorySegment) $fnCall;"
        else -> throw Exception("unsupported pointer type: $retType")
    }
    is CHandleType -> """MemorySegment s = (MemorySegment) ${fnCall};
return s.address() == 0 ? null : new ${retType.name}(s);"""
    is CNonRefType -> "return (${retType.jTypeNoSign}) ${fnCall};"
    is CStructType -> "return new ${retType.name}((MemorySegment) ${fnCall});"
    else -> throw Exception("unsupported return type: $retType")
}

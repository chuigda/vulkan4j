package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.*
import club.doki7.babel.util.DocList
import club.doki7.babel.util.buildDoc

fun generatePtrAccessor(className: String, type: CPointerType, member: LayoutField.Typed) = when (type.pointee) {
    is CVoidType -> generatePVoidAccessor(className, type, member)
    is CPointerType -> generatePPAccessor(className, type.pointee, member)
    is CEnumType -> generatePEnumAccessor(className, type.pointee, member)
    is CNonRefType -> generatePNonRefAccessor(className, type.pointee, member)
    is CHandleType -> generatePHandleAccessor(className, type.pointee, member)
    is CStructType -> generatePStructureAccessor(className, type.pointee, member)
    is CArrayType -> TODO()
}

private fun DocList.generatePFunAccessor(
    className: String,
    type: CPointerType,
    interfaceName: String,
    member: LayoutField.Typed
) {
    // only set
    defun("public", className, member.name, "@NotNull $interfaceName value") {
        +"return ${member.name}($interfaceName.ofNative(value));"
    }

    +""

    defun("public", className, member.name, "@NotNull Arena arena", "@NotNull $interfaceName value") {
        +"return ${member.name}($interfaceName.ofNative(arena, value));"
    }
}

private fun generatePVoidAccessor(className: String, type: CPointerType, member: LayoutField.Typed) = buildDoc {
    val comment = type.comment ?: "void*"
    val annotation = "@Pointer(comment=\"$comment\")"

    defun("public", "$annotation @NotNull MemorySegment", member.name) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", className, member.name, "$annotation @NotNull MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
        +"return this;"
    }
    +""

    val kind = type.kind
    if (kind is CPointerType.Kind.Function && !kind.typedef.pfnApi) {
        generatePFunAccessor(className, type, kind.typedef.name.value, member)
    }

    defun("public", className, member.name, "@Nullable IPointer pointer") {
        +"${member.name}(pointer != null ? pointer.segment() : MemorySegment.NULL);"
        +"return this;"
    }
}

private fun generatePPAccessor(className: String, pointee: CPointerType, member: LayoutField.Typed) = buildDoc {
    val comment = (pointee.comment ?: "void*") + "*"
    val annotation = "@Pointer(comment=\"$comment\")"
    val rawName = "${member.name}Raw"

    +"/// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up"
    +"/// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before"
    +"/// actually reading from or writing to the buffer."
    defun("public", "@Nullable ${"PointerPtr"}", member.name) {
        +"MemorySegment s = $rawName();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +"return new ${"PointerPtr"}(s);"
    }
    +""

    defun("public", className, member.name, "@Nullable ${"PointerPtr"} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
        +"return this;"
    }
    +""

    defun("public", "$annotation @NotNull MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation @NotNull MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePNonRefAccessor(className: String, pointee: CNonRefType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@Pointer(comment=\"${pointee.cType}*\")"
    val rawName = "${member.name}Raw"

    +"/// Note: the returned {@link ${pointee.jPtrTypeNoAnnotation}} does not have correct "
    +"/// {@link ${pointee.jPtrTypeNoAnnotation}#size} property. It's up to user to track the size of the buffer,"
    +"/// and use {@link ${pointee.jPtrTypeNoAnnotation}#reinterpret} to set the size before actually reading from or"
    +"/// writing to the buffer."
    defun("public", "@Nullable ${pointee.jPtrType}", member.name) {
        +"MemorySegment s = $rawName();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }

        +"return new ${pointee.jPtrTypeNoAnnotation}(s);"
    }
    +""

    defun("public", className, member.name, "@Nullable ${pointee.jPtrType} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
        +"return this;"
    }
    +""

    defun("public", "$annotation @NotNull MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation @NotNull MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePHandleAccessor(className: String, pointee: CHandleType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@Pointer(target=${pointee.name}.class)"
    val rawName = "${member.name}Raw"

    +"/// Note: the returned {@link ${pointee.name}.Ptr} does not have correct {@link ${pointee.name}.Ptr#size}"
    +"/// property. It's up to user to track the size of the buffer, and use"
    +"/// {@link ${pointee.name}.Ptr#reinterpret} to set the size before actually reading from or writing to the"
    +"/// buffer."
    defun("public", "@Nullable ${"${pointee.name}.Ptr"}", member.name) {
        +"MemorySegment s = $rawName();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +"return new ${"${pointee.name}.Ptr"}(s);"
    }

    +""

    defun("public", className, member.name, "@Nullable ${"${pointee.name}.Ptr"} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
        +"return this;";
    }
    +""

    defun("public", "$annotation @NotNull MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation @NotNull MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePStructureAccessor(className: String, pointee: CStructType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@Pointer(target=${pointee.name}.class)"
    val rawName = "${member.name}Raw"

    defun("public", className, member.name, "@Nullable ${pointee.jType} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
        +"return this;"
    }
    +""

    defun("@Unsafe public", "@Nullable ${pointee.name}.Ptr", member.name, "int assumedCount") {
        +"MemorySegment s = ${member.rawName}();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +""

        +"s = s.reinterpret(assumedCount * ${pointee.name}.BYTES);"
        +"return new ${pointee.name}.Ptr(s);"
    }
    +""

    defun("public", "@Nullable ${pointee.name}", member.name) {
        +"MemorySegment s = $rawName();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +"return new ${pointee.name}(s);"
    }
    +""

    defun("public", "$annotation @NotNull MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation @NotNull MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePEnumAccessor(className: String, pointee: CEnumType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@Pointer(target=${pointee.name}.class)"
    val rawName = "${member.name}Raw"

    +""

    +"/// Note: the returned {@link ${pointee.jPtrTypeNoAnnotation}} does not have correct"
    +"/// {@link ${pointee.jPtrTypeNoAnnotation}#size} property. It's up to user to track the size of the buffer,"
    +"/// and use {@link ${pointee.jPtrTypeNoAnnotation}#reinterpret} to set the size before actually reading fro"
    +"/// or writing to the buffer."
    defun("public", "@Nullable ${pointee.jPtrType}", member.name) {
        +"MemorySegment s = $rawName();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }

        +"return new ${pointee.jPtrTypeNoAnnotation}(s);"
    }
    +""

    defun("public", className, member.name, "@Nullable ${pointee.jPtrType} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
        +"return this;"
    }
    +""

    defun("public", "$annotation @NotNull MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation @NotNull MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

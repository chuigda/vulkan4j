package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.*
import club.doki7.babel.util.buildDoc

fun generatePtrAccessor(type: CPointerType, member: LayoutField.Typed) = when (type.pointee) {
    is CVoidType -> generatePVoidAccessor(type, member)
    is CPointerType -> generatePPAccessor(type.pointee, member)
    is CEnumType -> generatePEnumAccessor(type.pointee, member)
    is CNonRefType -> generatePNonRefAccessor(type.pointee, member)
    is CHandleType -> generatePHandleAccessor(type.pointee, member)
    is CStructType -> generatePStructureAccessor(type.pointee, member)
    is CArrayType -> TODO()
}

private fun generatePVoidAccessor(type: CPointerType, member: LayoutField.Typed) = buildDoc {
    val comment = type.comment ?: "void*"
    val annotation = "@pointer(comment=\"$comment\")"

    defun("public", "$annotation MemorySegment", member.name) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", member.name, "$annotation MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
    +""

    defun("public", "void", member.name, "@Nullable IPointer pointer") {
        +"${member.name}(pointer != null ? pointer.segment() : MemorySegment.NULL);"
    }
}

private fun generatePPAccessor(pointee: CPointerType, member: LayoutField.Typed) = buildDoc {
    val comment = (pointee.comment ?: "void*") + "*"
    val annotation = "@pointer(comment=\"$comment\")"
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

    defun("public", "void", member.name, "@Nullable ${"PointerPtr"} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
    }
    +""

    defun("public", "$annotation MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePNonRefAccessor(pointee: CNonRefType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@pointer(comment=\"${pointee.cType}*\")"
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

    defun("public", "void", member.name, "@Nullable ${pointee.jPtrType} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
    }
    +""

    defun("public", "$annotation MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePHandleAccessor(pointee: CHandleType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@pointer(target=${pointee.name}.class)"
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

    defun("public", "void", member.name, "@Nullable ${"${pointee.name}.Ptr"} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
    }
    +""

    defun("public", "$annotation MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePStructureAccessor(pointee: CStructType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@pointer(target=${pointee.name}.class)"
    val rawName = "${member.name}Raw"

    defun("public", "@Nullable ${pointee.name}", member.name) {
        +"MemorySegment s = $rawName();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +"return new ${pointee.name}(s);"
    }
    +""

    defun("public", "void", member.name, "@Nullable ${pointee.jType} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
    }
    +""

    defun("@unsafe public", "@Nullable ${pointee.name}.Ptr", member.name, "int assumedCount") {
        +"MemorySegment s = ${member.rawName}();"
        "if (s.equals(MemorySegment.NULL))" {
            +"return null;"
        }
        +""

        +"s = s.reinterpret(assumedCount * ${pointee.name}.BYTES);"
        +"return new ${pointee.name}.Ptr(s);"
    }
    +""

    defun("public", "$annotation MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun generatePEnumAccessor(pointee: CEnumType, member: LayoutField.Typed) = buildDoc {
    val annotation = "@pointer(target=${pointee.name}.class)"
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

    defun("public", "void", member.name, "@Nullable ${pointee.jPtrType} value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
    }
    +""

    defun("public", "$annotation MemorySegment", rawName) {
        +"return segment.get(${member.layoutName}, ${member.offsetName});"
    }
    +""

    defun("public", "void", rawName, "$annotation MemorySegment value") {
        +"segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

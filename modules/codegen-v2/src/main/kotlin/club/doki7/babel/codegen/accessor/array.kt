package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.CArrayType
import club.doki7.babel.ctype.CHandleType
import club.doki7.babel.ctype.CNonRefType
import club.doki7.babel.ctype.CStructType
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateArrayAccessor(className: String, type: CArrayType, member: LayoutField.Typed): Doc {
    val flattened = type.flattened
    val elementType = flattened.element

    return when(elementType) {
        is CNonRefType -> generateNonRefArrayAccessor(className, elementType, member)
        is CStructType -> generateStructureArrayAccessor(className, elementType, member)
        is CHandleType -> generateHandleArrayAccessor(className, elementType, member)
        else -> throw Exception("unsupported array element tye $elementType for member ${member.name}")
    }
}

private fun generateNonRefArrayAccessor(className: String, elementType: CNonRefType, member: LayoutField.Typed) = buildDoc {
    val rawName = "${member.name}Raw"

    defun("public", elementType.jPtrType, member.name) {
        +"return new ${elementType.jPtrTypeNoAnnotation}($rawName());"
    }
    +""

    defun("public", className, member.name, "${elementType.jPtrType} value") {
        +"MemorySegment s = $rawName();"
        +"s.copyFrom(value.segment());"
        +"return this;"
    }
    +""

    defun("public", "@NotNull MemorySegment", rawName) {
        +"return segment.asSlice(${member.offsetName}, ${member.sizeName});"
    }
}

private fun generateStructureArrayAccessor(className: String, elementType: CStructType, member: LayoutField.Typed) = buildDoc {
    val rawName = "${member.name}Raw"

    defun("public", "${elementType.name}.Ptr", member.name) {
        +"return new ${elementType.name}.Ptr($rawName());"
    }
    +""

    defun("public", className, member.name, "${elementType.name}.Ptr value") {
        +"MemorySegment s = $rawName();"
        +"s.copyFrom(value.segment());"
        +"return this;"
    }
    +""

    val atName = "${member.name}At"

    defun("public", elementType.name, atName, "int index") {
        +"MemorySegment s = $rawName();"
        +"return new ${elementType.name}(s.asSlice(index * ${elementType.name}.BYTES, ${elementType.name}.BYTES));"
    }
    +""

    defun("public", "void", atName, "int index", "${elementType.name} value") {
        +"MemorySegment s = $rawName();"
        +"MemorySegment.copy(value.segment(), 0, s, index * ${elementType.name}.BYTES, ${elementType.name}.BYTES);"
    }
    +""

    defun("public", "@NotNull MemorySegment", rawName) {
        +"return segment.asSlice(${member.offsetName}, ${member.sizeName});"
    }
}

private fun generateHandleArrayAccessor(className: String, elementType: CHandleType, member: LayoutField.Typed) = buildDoc {
    val rawName = "${member.name}Raw"

    defun("public", "@NotNull MemorySegment", rawName) {
        +"return segment.asSlice(${member.offsetName}, ${member.sizeName});"
    }

    +""

    defun("public", "${elementType.name}.Ptr", member.name) {
        +"return new ${elementType.name}.Ptr($rawName());"
    }

    +""

    defun("public", className, member.name, "${elementType.name}.Ptr value") {
        +"MemorySegment s = $rawName();"
        +"s.copyFrom(value.segment());"
        +"return this;"
    }

    +""

    val atName = "${member.name}At"

    defun("public", elementType.name, atName, "int index") {
        +"MemorySegment s = $rawName();"
        +"MemorySegment deref = s.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());"
        +"return new ${elementType.name}(deref);"
    }

    +""

    defun("public", "void", atName, "int index", "${elementType.name} value") {
        +"MemorySegment s = $rawName();"
        +"s.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value.segment());"
    }
}

package club.doki7.babel.codegen.accessor

import club.doki7.babel.codegen.LayoutField
import club.doki7.babel.codegen.defun
import club.doki7.babel.ctype.CArrayType
import club.doki7.babel.ctype.CHandleType
import club.doki7.babel.ctype.CNonRefType
import club.doki7.babel.ctype.CStructType
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

fun generateArrayAccessor(type: CArrayType, member: LayoutField.Typed): Doc {
    val flattened = type.flattened
    val elementType = flattened.element

    return when(elementType) {
        is CNonRefType -> generateNonRefArrayAccessor(elementType, member)
        is CStructType -> generateStructureArrayAccessor(elementType, member)
        is CHandleType -> generateHandleArrayAccessor(elementType, member)
        else -> throw Exception("unsupported array element tye $elementType for member ${member.name}")
    }
}

private fun generateNonRefArrayAccessor(elementType: CNonRefType, member: LayoutField.Typed) = buildDoc {
    val rawName = "${member.name}Raw"

    defun("public", elementType.jPtrType, member.name) {
        +"return new ${elementType.jPtrTypeNoAnnotation}($rawName());"
    }
    +""

    defun("public", "void", member.name, "${elementType.jPtrType} value") {
        +"MemorySegment.copy(value.segment(), 0, segment, ${member.offsetName}, ${member.sizeName});"
    }
    +""

    defun("public", "MemorySegment", rawName) {
        +"return segment.asSlice(${member.offsetName}, ${member.sizeName});"
    }
}

private fun generateStructureArrayAccessor(elementType: CStructType, member: LayoutField.Typed) = buildDoc {
    val rawName = "${member.name}Raw"

    defun("public", "${elementType.name}.Ptr", member.name) {
        +"return new ${elementType.name}.Ptr($rawName());"
    }
    +""

    defun("public", "void", member.name, "${elementType.name}.Ptr value") {
        +"MemorySegment s = $rawName();"
        +"s.copyFrom(value.segment());"
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

    defun("public", "MemorySegment", rawName) {
        +"return segment.asSlice(${member.offsetName}, ${member.sizeName});"
    }
}

private fun generateHandleArrayAccessor(elementType: CHandleType, member: LayoutField.Typed) = buildDoc {
    val rawName = "${member.name}Raw"

    defun("public", "MemorySegment", rawName) {
        +"return segment.asSlice(${member.offsetName}, ${member.sizeName});"
    }

    +""

    defun("public", "${elementType.name}.Ptr", member.name) {
        +"return new ${elementType.name}.Ptr($rawName());"
    }

    +""

    defun("public", "void", member.name, "${elementType.name}.Ptr value") {
        +"MemorySegment.copy(value.segment(), 0, segment, ${member.offsetName}, ${member.sizeName});"
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

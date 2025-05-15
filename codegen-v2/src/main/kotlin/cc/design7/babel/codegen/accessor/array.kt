package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.FIELD_segment
import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.ctype.CArrayType
import cc.design7.babel.ctype.CHandleType
import cc.design7.babel.ctype.CNonRefType
import cc.design7.babel.ctype.CStructType
import cc.design7.babel.util.Doc
import cc.design7.babel.util.buildDoc

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

private fun generateNonRefArrayAccessor(elementType: CNonRefType, member: LayoutField.Typed): Doc {
    return buildDoc {
        val fnRaw = "${member.name}Raw"

        fn("public", "MemorySegment", fnRaw) {
            +"return $FIELD_segment.asSlice(${member.offsetName}, ${member.sizeName});"
        }

        +""

        fn("public", elementType.jPtrType, member.name) {
            +"return new ${elementType.jPtrTypeNoAnnotation}($fnRaw);"
        }

        +""

        fn("public", "void", member.name, "${elementType.jPtrType} value") {
            +"MemorySegment.copy(value.segment(), 0, $FIELD_segment, ${member.offsetName}, ${member.sizeName});"
        }
    }
}

private fun generateStructureArrayAccessor(elementType: CStructType, member: LayoutField.Typed): Doc {
    val rawName = "${member.name}Raw"

    return buildDoc {
        fn("public", "MemorySegment", rawName) {
            +"return $FIELD_segment.asSlice(${member.offsetName}, ${member.sizeName});"
        }

        +""

        fn("public", "${elementType.name}[]", member.name) {
            +"MemorySegment s = $rawName;"
            +"${elementType.name}[] arr = new ${elementType.name}[(int) ${member.layoutName}.elementCount()];"
            "for (int i = 0; i < arr.length; i ++)" {
                +"arr[i] = new ${elementType.name}(s.asSlice(i * ${elementType.name}.SIZE, ${elementType.name}.SIZE));"
            }
            +"return arr;"
        }

        +""

        fn("public", "void", member.name, "${elementType.name}[] value") {
            +"MemorySegment s = $rawName;"
            "for (int i = 0; i < value.length; i++)" {
                +"MemorySegment.copy(value[i].segment(), 0, s, i * ${elementType.name}.SIZE, ${elementType.name}.SIZE);"
            }
        }

        +""

        val atName = "${member.name}At"

        fn("public", elementType.name, atName, "int index") {
            +"MemorySegment s = $rawName();"
            +"return new ${elementType.name}(s.asSlice(index * ${elementType.name}.SIZE, ${elementType.name}.SIZE));"
        }

        +""

        fn("public", "void", atName, "int index", "${elementType.name} value") {
            +"MemorySegment s = $rawName();"
            +"MemorySegment.copy(value.segment(), 0, s, index * ${elementType.name}.SIZE, ${elementType.name}.SIZE);"
        }
    }
}

private fun generateHandleArrayAccessor(elementType: CHandleType, member: LayoutField.Typed): Doc {
    return buildDoc {
        val rawName = "${member.name}Raw"

        fn("public", "MemorySegment", rawName) {
            +"return $FIELD_segment.asSlice(${member.offsetName}, ${member.sizeName});"
        }

        +""

        fn("public", "${elementType.name}.Buffer", member.name) {
            +"return new ${elementType.name}.Buffer($rawName());"
        }

        +""

        fn("public", "void", member.name, "${elementType.name}.Buffer value") {
            +"MemorySegment.copy(value.segment(), 0, $FIELD_segment, ${member.offsetName}, ${member.sizeName});"
        }

        +""

        val atName = "${member.name}At"

        fn("public", elementType.name, atName, "int index") {
            +"MemorySegment s = $rawName();"
            +"MemorySegment deref = s.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());"
            +"return new ${elementType.name}(deref);"
        }

        +""

        fn("public", "void", atName, "int index", "${elementType.name} value") {
            +"MemorySegment s = $rawName();"
            +"s.put(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value.segment());"
        }
    }
}
package cc.design7.babel.codegen.accessor

import cc.design7.babel.codegen.FIELD_segment
import cc.design7.babel.codegen.LayoutField
import cc.design7.babel.codegen.fn
import cc.design7.babel.ctype.*
import cc.design7.babel.util.Doc
import cc.design7.babel.util.DocList
import cc.design7.babel.util.buildDoc

fun generatePtrAccessor(type: CPointerType, member: LayoutField.Typed): Doc =
    when (type.pointee) {
        is CVoidType -> generatePVoidAccessor(type, member)
        is CPointerType -> generatePPAccessor(type.pointee, member)
        is CEnumType -> generatePEnumAccessor(type.pointee, member)
        is CNonRefType -> generatePNonRefAccessor(type.pointee, member)
        is CHandleType -> generatePHandleAccessor(type.pointee, member)
        is CStructType -> generatePStructureAccessor(type.pointee, member)
        is CArrayType -> TODO()
    }

private fun DocList.makeGet(annotation: String, member: LayoutField.Typed, raw: Boolean = false) {
    val postfix = if (raw) "Raw" else ""
    fn("public", "$annotation MemorySegment", "${member.name}$postfix") {
        +"return $FIELD_segment.get(${member.layoutName}, ${member.offsetName});"
    }
}


private fun DocList.makeTrivialGet(comment: String, member: LayoutField.Typed, raw: Boolean = false) {
    makeGet("@pointer(comment=\"$comment\")", member, raw)
}

private fun DocList.makeSet(annotation: String, member: LayoutField.Typed, raw: Boolean = false) {
    val postfix = if (raw) "Raw" else ""
    fn("public", "void", "${member.name}$postfix", "$annotation MemorySegment value") {
        +"$FIELD_segment.set(${member.layoutName}, ${member.offsetName}, value);"
    }
}

private fun DocList.makeTrivialSet(comment: String, member: LayoutField.Typed, raw: Boolean = false) {
    makeSet("@pointer(comment=\"$comment\")", member, raw)
}

/**
 * a [makeTrivialGet] with `raw = true` must be generate first
 */
private fun DocList.makeRawGet(returnType: String, con: String, member: LayoutField.Typed) {
    val rawName = "${member.name}Raw"
    fn("public", "@Nullable $returnType", member.name) {
        +"MemorySegment s = $rawName;"
        "if (s.address() == 0)" {
            +"return null;"
        }

        +"return new $con(s);"
    }
}

/**
 * a [makeTrivialSet] with `raw = true` must be generate first
 */
private fun DocList.makeRawSet(type: String, member: LayoutField.Typed) {
    val rawName = "${member.name}Raw"
    fn("public", "void", member.name, "@Nullable $type value") {
        +"MemorySegment s = value == null ? MemorySegment.NULL : value.segment();"
        +"$rawName(s);"
    }
}

private fun generatePVoidAccessor(type: CPointerType, member: LayoutField.Typed): Doc {
    val comment = type.comment ?: "void*"
    return buildDoc {
        makeTrivialGet(comment, member)
        +""
        makeTrivialSet(comment, member)
        +""

        fn("public", "void", member.name, "IPointer pointer") {
            +"${member.name}(pointer.segment());"
        }
    }
}

private fun generatePPAccessor(pointee: CPointerType, member: LayoutField.Typed): Doc {
    val comment = (pointee.comment ?: "void*") + "*"

    return buildDoc {
        makeTrivialGet(comment, member, true)

        +""

        makeTrivialSet(comment, member, true)

        +""
        +"/// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up"
        +"/// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before"
        +"/// actually reading from or writing to the buffer."
        makeRawGet("PointerBuffer", "PointerBuffer", member)

        +""

        makeRawSet("PointerBuffer", member)
    }
}

private fun generatePNonRefAccessor(pointee: CNonRefType, member: LayoutField.Typed): Doc {
    val comment = "${pointee.cType}*"

    return buildDoc {
        makeTrivialGet(comment, member, true)
        +""
        makeTrivialSet(comment, member, true)
        +""
        +"/// Note: the returned {@link ${pointee.jPtrTypeNoAnnotation}} does not have correct "
        +"/// {@link ${pointee.jPtrTypeNoAnnotation}#size} property. It's up to user to track the size of the buffer,"
        +"/// and use {@link ${pointee.jPtrTypeNoAnnotation}#reinterpret} to set the size before actually reading from or"
        +"/// writing to the buffer."
        makeRawGet(pointee.jPtrType, pointee.jPtrTypeNoAnnotation, member)

        +""
        makeRawSet(pointee.jPtrType, member)
    }
}

private fun generatePHandleAccessor(pointee: CHandleType, member: LayoutField.Typed): Doc {
    val comment = "${pointee.cType}*"

    return buildDoc {
        makeTrivialGet(comment, member, true)
        +""
        makeTrivialSet(comment, member, true)
        +""
        +"/// Note: the returned {@link ${pointee.name}.Buffer} does not have correct {@link ${pointee.name}.Buffer#size}"
        +"/// property. It's up to user to track the size of the buffer, and use"
        +"/// {@link ${pointee.name}.Buffer#reinterpret} to set the size before actually reading from or writing to the"
        +"/// buffer."
        makeRawGet("${pointee.name}.Buffer", "${pointee.name}.Buffer", member)
        +""
        // TODO: no raw setter?
    }
}

private fun generatePStructureAccessor(pointee: CStructType, member: LayoutField.Typed): Doc {
    """
        public @pointer(comment="${pointee.name}*") MemorySegment ${member.name}Raw() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}Raw(@pointer(comment="${pointee.name}*") MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
        
        public @Nullable ${pointee.name} ${member.name}() {
            MemorySegment s = ${member.name}Raw();
            if (s.address() == 0) {
                return null;
            }
            return new ${pointee.name}(s);
        }
        
        /// Note: this function is {@link unsafe} because it's up to caller to provide the correct count of elements.
        @unsafe
        public @Nullable ${pointee.name}[] ${member.name}(int assumedCount) {
            MemorySegment s = ${member.name}Raw();
            if (s.address() == 0) {
                return null;
            }

            s = s.reinterpret(assumedCount * ${pointee.name}.SIZE);
            ${pointee.name}[] ret = new ${pointee.name}[assumedCount];
            for (int i = 0; i < assumedCount; i++) {
                ret[i] = new ${pointee.name}(s.asSlice(i * ${pointee.name}.SIZE, ${pointee.name}.SIZE));
            }
            return ret;
        }

        public void ${member.name}(@Nullable ${pointee.name} value) {
            MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
            ${member.name}Raw(s);
        }
    """.trimIndent()

    val comment = "${pointee.name}*"
    return buildDoc {
        makeTrivialGet(comment, member, true)
        +""
        makeTrivialSet(comment, member, true)
        +""
        makeRawGet(pointee.name, pointee.name, member)
        +""
        makeRawSet(pointee.name, member)
        +""

        fn("@unsafe public", "@Nullable ${pointee.name}[]", member.name, "int assumedCount") {
            +"MemorySegment s = ${member.rawName}();"
            "if (s.address() == 0)" {
                +"return null;"
            }

            +""
            +"s = s.reinterpret(assumedCount * ${pointee.name}.SIZE);"
            +"${pointee.name}[] ret = new ${pointee.name}[assumedCount];"
            "for (int i = 0; i < assumedCount; i ++)" {
                +"ret[i] = new ${pointee.name}(s.asSlice(i * ${pointee.name}.SIZE, ${pointee.name}.SIZE));"
            }

            +"return ret;"
        }
    }
}
private fun generatePEnumAccessor(pointee: CEnumType, member: LayoutField.Typed): Doc {
    return buildDoc {
        val annotation = "@pointer(target=${pointee.name}.class)"
        makeGet(annotation, member, true)
        +""
        makeSet(annotation, member, true)
        +""
        +"/// Note: the returned {@link ${pointee.jPtrTypeNoAnnotation}} does not have correct"
        +"/// {@link ${pointee.jPtrTypeNoAnnotation}#size} property. It's up to user to track the size of the buffer,"
        +"/// and use {@link ${pointee.jPtrTypeNoAnnotation}#reinterpret} to set the size before actually reading fro"
        +"/// or writing to the buffer."
        makeRawGet(pointee.jPtrType, pointee.jPtrTypeNoAnnotation, member)
        +""
        makeRawSet(pointee.jPtrType, member)
    }
}

fun generateGenericPtrAccessor(type: CPointerType, member: LayoutField.Typed): Doc {
    return buildDoc {
        val comment = type.cType
        makeTrivialGet(comment, member, true)
        +""
        makeTrivialSet(comment, member, true)
    }
}
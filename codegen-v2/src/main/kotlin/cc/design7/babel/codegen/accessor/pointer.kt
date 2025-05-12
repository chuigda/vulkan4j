package cc.design7.babel.codegen.accessor

import cc.design7.babel.ctype.*
import cc.design7.babel.registry.Member

fun generatePtrAccessor(type: CPointerType, member: Member): String =
    when (type.pointee) {
        is CVoidType -> generatePVoidAccessor(type, member)
        is CPointerType -> generatePPAccessor(type.pointee, member)
        is CEnumType -> generatePEnumAccessor(type.pointee, member)
        is CNonRefType -> generatePNonRefAccessor(type.pointee, member)
        is CHandleType -> generatePHandleAccessor(type.pointee, member)
        is CStructType -> generatePStructureAccessor(type.pointee, member)
        is CArrayType -> TODO()
    }

private fun generatePVoidAccessor(type: CPointerType, member: Member): String {
    val comment = type.comment ?: "void*"

    return """
        public @pointer(comment="$comment") MemorySegment ${member.name}() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}(@pointer(comment="$comment") MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
        
        public void ${member.name}(IPointer pointer) {
            ${member.name}(pointer.segment());
        }
    """.trimIndent()
}

private fun generatePPAccessor(pointee: CPointerType, member: Member): String {
    val comment = (pointee.comment ?: "void*") + "*"

    return """
        public @pointer(comment="$comment") MemorySegment ${member.name}Raw() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}Raw(@pointer(comment="$comment") MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
        
        /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
        /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
        /// actually reading from or writing to the buffer.
        public @Nullable PointerBuffer ${member.name}() {
            MemorySegment s = ${member.name}Raw();
            if (s.address() == 0) {
                return null;
            }
            return new PointerBuffer(s);
        }

        public void ${member.name}(@Nullable PointerBuffer value) {
            MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
            ${member.name}Raw(s);
        }
    """.trimIndent()
}

private fun generatePNonRefAccessor(pointee: CNonRefType, member: Member): String =
    """
        public @pointer(comment="${pointee.cType}*") MemorySegment ${member.name}Raw() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}Raw(@pointer(comment="${pointee.cType}*") MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
        
        /// Note: the returned {@link ${pointee.jPtrTypeNoAnnotation}} does not have correct 
        /// {@link ${pointee.jPtrTypeNoAnnotation}#size} property. It's up to user to track the size of the buffer,
        /// and use {@link ${pointee.jPtrTypeNoAnnotation}#reinterpret} to set the size before actually reading from or
        /// writing to the buffer.
        public @Nullable ${pointee.jPtrType} ${member.name}() {
            MemorySegment s = ${member.name}Raw();
            if (s.address() == 0) {
                return null;
            }
            return new ${pointee.jPtrTypeNoAnnotation}(s);
        }

        public void ${member.name}(@Nullable ${pointee.jPtrType} value) {
            MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
            ${member.name}Raw(s);
        }
    """.trimIndent()

private fun generatePHandleAccessor(pointee: CHandleType, member: Member): String =
    """
        public @pointer(comment="${pointee.cType}*") MemorySegment ${member.name}Raw() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}Raw(@pointer(comment="${pointee.cType}*") MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
        
        /// Note: the returned {@link ${pointee.name}.Buffer} does not have correct {@link ${pointee.name}.Buffer#size}
        /// property. It's up to user to track the size of the buffer, and use
        /// {@link ${pointee.name}.Buffer#reinterpret} to set the size before actually reading from or writing to the
        /// buffer.
        public @Nullable ${pointee.name}.Buffer ${member.name}() {
            MemorySegment s = ${member.name}Raw();
            if (s.address() == 0) {
                return null;
            }
            return new ${pointee.name}.Buffer(s);
        }
    """.trimIndent()

private fun generatePStructureAccessor(pointee: CStructType, member: Member): String =
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

private fun generatePEnumAccessor(pointee: CEnumType, member: Member): String =
    """
        public @pointer(target=${pointee.name}.class) MemorySegment ${member.name}Raw() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}Raw(@pointer(target=${pointee.name}.class) MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
        
        /// Note: the returned {@link ${pointee.jPtrTypeNoAnnotation}} does not have correct
        /// {@link ${pointee.jPtrTypeNoAnnotation}#size} property. It's up to user to track the size of the buffer,
        /// and use {@link ${pointee.jPtrTypeNoAnnotation}#reinterpret} to set the size before actually reading from
        /// or writing to the buffer.
        public @Nullable ${pointee.jPtrType} ${member.name}() {
            MemorySegment s = ${member.name}Raw();
            if (s.address() == 0) {
                return null;
            }
            return new ${pointee.jPtrTypeNoAnnotation}(s);
        }

        public void ${member.name}(@Nullable ${pointee.jPtrType} value) {
            MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
            ${member.name}Raw(s);
        }
    """.trimIndent()

fun generateGenericPtrAccessor(type: CPointerType, member: Member): String =
    """
        public @pointer(comment="${type.cType}") MemorySegment ${member.name}Raw() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}Raw(@pointer(comment="${type.cType}") MemorySegment value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
    """.trimIndent()

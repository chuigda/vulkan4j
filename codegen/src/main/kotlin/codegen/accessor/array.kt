package codegen.accessor

import Member
import codegen.*

fun generateArrayAccessor(type: CArrayType, member: Member): String {
    val flattened = type.flattened
    val elementType = flattened.element

    return when(elementType) {
        is CNonRefType -> generateNonRefArrayAccessor(elementType, member)
        is CStructType -> generateStructureArrayAccessor(elementType, member)
        is CHandleType -> generateHandleArrayAccessor(elementType, member)
        else -> throw Exception("unsupported array element tye $elementType for member ${member.name}")
    }
}

private fun generateNonRefArrayAccessor(elementType: CNonRefType, member: Member): String =
    """
        public MemorySegment ${member.name}Raw() {
            return segment.asSlice(OFFSET$${member.name}, SIZE$${member.name});
        }

        public ${elementType.jBufferType} ${member.name}() {
            return new ${elementType.jBufferTypeNoAnnotation}(${member.name}Raw());
        }

        public void ${member.name}(${elementType.jBufferType} value) {
            MemorySegment.copy(value.segment(), 0, segment, OFFSET$${member.name}, SIZE$${member.name});
        }
    """.trimIndent()

private fun generateStructureArrayAccessor(elementType: CStructType, member: Member): String =
    """
        public MemorySegment ${member.name}Raw() {
            return segment.asSlice(OFFSET$${member.name}, SIZE$${member.name});
        }

        public ${elementType.name}[] ${member.name}() {
            MemorySegment s = ${member.name}Raw()
            ${elementType.name}[] arr = new ${elementType.name}[(int) LAYOUT$${member.name}.elementCount()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new ${elementType.name}(s.asSlice(i * ${elementType.name}.SIZE, ${elementType.name}.SIZE));
            }
            return arr;
        }
        
        public void ${member.name}(${elementType.name}[] value) {
            MemorySegment s = ${member.name}Raw();
            for (int i = 0; i < value.length; i++) {
                MemorySegment.copy(value[i].segment(), 0, s, i * ${elementType.name}.SIZE, ${elementType.name}.SIZE);
            }
        }

        public ${elementType.name} ${member.name}At(int index) {
            MemorySegment s = ${member.name}Raw();
            return new ${elementType.name}(s.asSlice(index * ${elementType.name}.SIZE, ${elementType.name}.SIZE));
        }

        public void ${member.name}At(int index, ${elementType.name} value) {
            MemorySegment s = ${member.name}Raw();
            MemorySegment.copy(value.segment(), 0, s, index * ${elementType.name}.SIZE, ${elementType.name}.SIZE);
        }
    """.trimIndent()

private fun generateHandleArrayAccessor(elementType: CHandleType, member: Member): String =
    """
        public MemorySegment ${member.name}Raw() {
            return segment.asSlice(OFFSET$${member.name}, SIZE$${member.name});
        }

        public ${elementType.name}.Buffer ${member.name}() {
            return new ${elementType.name}.Buffer(${member.name}Raw());
        }

        public void ${member.name}(${elementType.name}.Buffer value) {
            MemorySegment.copy(value.segment(), 0, segment, OFFSET$${member.name}, SIZE$${member.name});
        }

        public ${elementType.name} ${member.name}At(int index) {
            MemorySegment s = ${member.name}Raw();
            MemorySegment deref = s.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
            return new ${elementType.name}(deref);
        }

        public void ${member.name}At(int index, ${elementType.name} value) {
            MemorySegment s = ${member.name}Raw();
            s.put(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value.segment());
        }
    """.trimIndent()

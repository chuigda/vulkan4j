package cc.design7.babel.codegen.accessor

import cc.design7.babel.ctype.CStructType
import cc.design7.babel.registry.Member

fun generateStructureTypeAccessor(type: CStructType, member: Member): String =
    """
        public ${type.name} ${member.name}() {
            return new ${type.name}(segment.asSlice(OFFSET$${member.name}, LAYOUT$${member.name}));
        }

        public void ${member.name}(${type.name} value) {
            MemorySegment.copy(value.segment(), 0, segment, OFFSET$${member.name}, SIZE$${member.name});
        }
    """.trimIndent()

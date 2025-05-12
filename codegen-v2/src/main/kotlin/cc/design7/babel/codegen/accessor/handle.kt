package cc.design7.babel.codegen.accessor

import cc.design7.babel.ctype.CHandleType
import cc.design7.babel.registry.Member

fun generateHandleAccessor(type: CHandleType, member: Member): String =
    """
        public @Nullable ${type.name} ${member.name}() {
            MemorySegment s = segment.asSlice(OFFSET$${member.name}, SIZE$${member.name});
            if (s.address() == 0) {
                return null;
            }
            return new ${type.name}(s);
        }
        
        public void ${member.name}(@Nullable ${type.name} value) {
            segment.set(
                LAYOUT$${member.name},
                OFFSET$${member.name},
                value != null ? value.segment() : MemorySegment.NULL
            );
        }
    """.trimIndent()

package codegen.accessor

import Member
import codegen.CHandleType

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

package cc.design7.babel.codegen.accessor

import cc.design7.babel.ctype.CPlatformDependentIntType
import cc.design7.babel.ctype.CType
import cc.design7.babel.registry.Member

fun generateNonRefAccessor(type: CType, member: Member): String = if (type is CPlatformDependentIntType) {
    generatePlatformDependentIntAccessor(type, member)
} else {
    generateFixedTypeAccessor(type, member)
}

private fun generatePlatformDependentIntAccessor(type: CPlatformDependentIntType, member: Member): String {
    return when (type.cType) {
        "long" -> {
            """
            public long ${member.name}() {
                return NativeLayout.readCLong(segment, OFFSET$${member.name});
            }
            
            public void ${member.name}(long value) {
                NativeLayout.writeCLong(segment, OFFSET$${member.name}, value);
            }
            """.trimIndent()
        }
        "size_t" -> {
            """
            public @unsigned long ${member.name}() {
                return NativeLayout.readCSizeT(segment, OFFSET$${member.name});
            }
            
            public void ${member.name}(long value) {
                NativeLayout.writeCSizeT(segment, OFFSET$${member.name}, value);
            }
            """.trimIndent()
        }
        else -> {
            throw Exception("unsupported platform dependent int type $type")
        }
    }
}

private fun generateFixedTypeAccessor(type: CType, member: Member): String =
    """
        public ${type.jType} ${member.name}() {
            return segment.get(LAYOUT$${member.name}, OFFSET$${member.name});
        }

        public void ${member.name}(${type.jType} value) {
            segment.set(LAYOUT$${member.name}, OFFSET$${member.name}, value);
        }
    """.trimIndent()

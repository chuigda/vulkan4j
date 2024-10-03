package codegen.accessor

import Member

fun generateBitfieldAccessor(member: Member, next: Member): String {
    val bitfieldName = "bitfield$${member.name}_${next.name}"
    return """
        public int ${member.name}() {
            return segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName) >> 8;
        }

        public void ${member.name}(int value) {
            int original = segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName);
            int newValue = (original & 0xFF) | (value << 8);
            segment.set(LAYOUT$$bitfieldName, OFFSET$$bitfieldName, newValue);
        }

        public int ${next.name}() {
            return segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName) & 0xFF;
        }

        public void ${next.name}(int value) {
            int original = segment.get(LAYOUT$$bitfieldName, OFFSET$$bitfieldName);
            int newValue = (original & 0xFFFFFF00) | value;
            segment.set(LAYOUT$$bitfieldName, OFFSET$$bitfieldName, newValue);
        }
    """.trimIndent()
}

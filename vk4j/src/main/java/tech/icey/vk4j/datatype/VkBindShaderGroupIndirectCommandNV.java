package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkBindShaderGroupIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupIndex")
    );

    public static final PathElement PATH$groupIndex = PathElement.groupElement("groupIndex");

    public static final OfInt LAYOUT$groupIndex = (OfInt) LAYOUT.select(PATH$groupIndex);

    public static final long OFFSET$groupIndex = LAYOUT.byteOffset(PATH$groupIndex);

    public VkBindShaderGroupIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int groupIndex() {
        return segment.get(LAYOUT$groupIndex, OFFSET$groupIndex);
    }

    public void groupIndex(@unsigned int value) {
        segment.set(LAYOUT$groupIndex, OFFSET$groupIndex, value);
    }

    public static VkBindShaderGroupIndirectCommandNV allocate(Arena arena) {
        return new VkBindShaderGroupIndirectCommandNV(arena.allocate(LAYOUT));
    }
    
    public static VkBindShaderGroupIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindShaderGroupIndirectCommandNV[] ret = new VkBindShaderGroupIndirectCommandNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindShaderGroupIndirectCommandNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

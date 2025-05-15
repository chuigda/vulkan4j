package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkSetStateFlagsIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$data = ValueLayout.JAVA_INT.withName("data");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$data);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSetStateFlagsIndirectCommandNV allocate(Arena arena) {
        return new VkSetStateFlagsIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkSetStateFlagsIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSetStateFlagsIndirectCommandNV[] ret = new VkSetStateFlagsIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSetStateFlagsIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSetStateFlagsIndirectCommandNV clone(Arena arena, VkSetStateFlagsIndirectCommandNV src) {
        VkSetStateFlagsIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSetStateFlagsIndirectCommandNV[] clone(Arena arena, VkSetStateFlagsIndirectCommandNV[] src) {
        VkSetStateFlagsIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$data = PathElement.groupElement("PATH$data");

    public static final long SIZE$data = LAYOUT$data.byteSize();

    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public @unsigned int data() {
        return segment.get(LAYOUT$data, OFFSET$data);
    }

    public void data(@unsigned int value) {
        segment.set(LAYOUT$data, OFFSET$data, value);
    }

}
/// dummy, not implemented yet

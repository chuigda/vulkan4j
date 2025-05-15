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

public record VkBindShaderGroupIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$groupIndex = ValueLayout.JAVA_INT.withName("groupIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$groupIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBindShaderGroupIndirectCommandNV allocate(Arena arena) {
        return new VkBindShaderGroupIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindShaderGroupIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindShaderGroupIndirectCommandNV[] ret = new VkBindShaderGroupIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindShaderGroupIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindShaderGroupIndirectCommandNV clone(Arena arena, VkBindShaderGroupIndirectCommandNV src) {
        VkBindShaderGroupIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindShaderGroupIndirectCommandNV[] clone(Arena arena, VkBindShaderGroupIndirectCommandNV[] src) {
        VkBindShaderGroupIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$groupIndex = PathElement.groupElement("PATH$groupIndex");

    public static final long SIZE$groupIndex = LAYOUT$groupIndex.byteSize();

    public static final long OFFSET$groupIndex = LAYOUT.byteOffset(PATH$groupIndex);

    public @unsigned int groupIndex() {
        return segment.get(LAYOUT$groupIndex, OFFSET$groupIndex);
    }

    public void groupIndex(@unsigned int value) {
        segment.set(LAYOUT$groupIndex, OFFSET$groupIndex, value);
    }

}
/// dummy, not implemented yet

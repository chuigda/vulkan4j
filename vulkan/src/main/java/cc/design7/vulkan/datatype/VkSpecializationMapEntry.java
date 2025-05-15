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

public record VkSpecializationMapEntry(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$constantID = ValueLayout.JAVA_INT.withName("constantID");
    public static final OfInt LAYOUT$offset = ValueLayout.JAVA_INT.withName("offset");
    public static final ValueLayout LAYOUT$size = NativeLayout.C_SIZE_T.withName("size");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$constantID, LAYOUT$offset, LAYOUT$size);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSpecializationMapEntry allocate(Arena arena) {
        return new VkSpecializationMapEntry(arena.allocate(LAYOUT));
    }

    public static VkSpecializationMapEntry[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSpecializationMapEntry[] ret = new VkSpecializationMapEntry[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSpecializationMapEntry(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSpecializationMapEntry clone(Arena arena, VkSpecializationMapEntry src) {
        VkSpecializationMapEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSpecializationMapEntry[] clone(Arena arena, VkSpecializationMapEntry[] src) {
        VkSpecializationMapEntry[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$constantID = PathElement.groupElement("PATH$constantID");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");

    public static final long SIZE$constantID = LAYOUT$constantID.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$constantID = LAYOUT.byteOffset(PATH$constantID);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public @unsigned int constantID() {
        return segment.get(LAYOUT$constantID, OFFSET$constantID);
    }

    public void constantID(@unsigned int value) {
        segment.set(LAYOUT$constantID, OFFSET$constantID, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return NativeLayout.readCSizeT(segment, OFFSET$size);
    }

    public void size(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$size, value);
    }

}
/// dummy, not implemented yet

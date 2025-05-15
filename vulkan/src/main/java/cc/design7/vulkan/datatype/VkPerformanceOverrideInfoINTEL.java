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

public record VkPerformanceOverrideInfoINTEL(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$enable = ValueLayout.JAVA_INT.withName("enable");
    public static final OfLong LAYOUT$parameter = ValueLayout.JAVA_LONG.withName("parameter");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$type, LAYOUT$enable, LAYOUT$parameter);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPerformanceOverrideInfoINTEL allocate(Arena arena) {
        return new VkPerformanceOverrideInfoINTEL(arena.allocate(LAYOUT));
    }

    public static VkPerformanceOverrideInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceOverrideInfoINTEL[] ret = new VkPerformanceOverrideInfoINTEL[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceOverrideInfoINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPerformanceOverrideInfoINTEL clone(Arena arena, VkPerformanceOverrideInfoINTEL src) {
        VkPerformanceOverrideInfoINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceOverrideInfoINTEL[] clone(Arena arena, VkPerformanceOverrideInfoINTEL[] src) {
        VkPerformanceOverrideInfoINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$enable = PathElement.groupElement("PATH$enable");
    public static final PathElement PATH$parameter = PathElement.groupElement("PATH$parameter");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$enable = LAYOUT$enable.byteSize();
    public static final long SIZE$parameter = LAYOUT$parameter.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$enable = LAYOUT.byteOffset(PATH$enable);
    public static final long OFFSET$parameter = LAYOUT.byteOffset(PATH$parameter);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkPerformanceOverrideTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceOverrideTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int enable() {
        return segment.get(LAYOUT$enable, OFFSET$enable);
    }

    public void enable(@unsigned int value) {
        segment.set(LAYOUT$enable, OFFSET$enable, value);
    }

    public @unsigned long parameter() {
        return segment.get(LAYOUT$parameter, OFFSET$parameter);
    }

    public void parameter(@unsigned long value) {
        segment.set(LAYOUT$parameter, OFFSET$parameter, value);
    }

}
/// dummy, not implemented yet

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

public record VkPerformanceValueINTEL(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final StructLayout LAYOUT$data = VkPerformanceValueDataINTEL.LAYOUT.withName("data");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$type, LAYOUT$data);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPerformanceValueINTEL allocate(Arena arena) {
        return new VkPerformanceValueINTEL(arena.allocate(LAYOUT));
    }

    public static VkPerformanceValueINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceValueINTEL[] ret = new VkPerformanceValueINTEL[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceValueINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPerformanceValueINTEL clone(Arena arena, VkPerformanceValueINTEL src) {
        VkPerformanceValueINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceValueINTEL[] clone(Arena arena, VkPerformanceValueINTEL[] src) {
        VkPerformanceValueINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$data = PathElement.groupElement("PATH$data");

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public @enumtype(VkPerformanceValueTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceValueTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public VkPerformanceValueDataINTEL data() {
        return new VkPerformanceValueDataINTEL(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkPerformanceValueDataINTEL value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

}
/// dummy, not implemented yet

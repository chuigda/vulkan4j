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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableStatisticValueKHR.html">VkPipelineExecutableStatisticValueKHR</a>
@ValueBasedCandidate
public record VkPipelineExecutableStatisticValueKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$b32 = ValueLayout.JAVA_INT.withName("b32");
    public static final OfLong LAYOUT$i64 = ValueLayout.JAVA_LONG.withName("i64");
    public static final OfLong LAYOUT$u64 = ValueLayout.JAVA_LONG.withName("u64");
    public static final OfDouble LAYOUT$f64 = ValueLayout.JAVA_DOUBLE.withName("f64");

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(LAYOUT$b32, LAYOUT$i64, LAYOUT$u64, LAYOUT$f64);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineExecutableStatisticValueKHR allocate(Arena arena) {
        return new VkPipelineExecutableStatisticValueKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineExecutableStatisticValueKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableStatisticValueKHR[] ret = new VkPipelineExecutableStatisticValueKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineExecutableStatisticValueKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineExecutableStatisticValueKHR clone(Arena arena, VkPipelineExecutableStatisticValueKHR src) {
        VkPipelineExecutableStatisticValueKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineExecutableStatisticValueKHR[] clone(Arena arena, VkPipelineExecutableStatisticValueKHR[] src) {
        VkPipelineExecutableStatisticValueKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$b32 = PathElement.groupElement("PATH$b32");
    public static final PathElement PATH$i64 = PathElement.groupElement("PATH$i64");
    public static final PathElement PATH$u64 = PathElement.groupElement("PATH$u64");
    public static final PathElement PATH$f64 = PathElement.groupElement("PATH$f64");

    public static final long SIZE$b32 = LAYOUT$b32.byteSize();
    public static final long SIZE$i64 = LAYOUT$i64.byteSize();
    public static final long SIZE$u64 = LAYOUT$u64.byteSize();
    public static final long SIZE$f64 = LAYOUT$f64.byteSize();

    public static final long OFFSET$b32 = LAYOUT.byteOffset(PATH$b32);
    public static final long OFFSET$i64 = LAYOUT.byteOffset(PATH$i64);
    public static final long OFFSET$u64 = LAYOUT.byteOffset(PATH$u64);
    public static final long OFFSET$f64 = LAYOUT.byteOffset(PATH$f64);

    public @unsigned int b32() {
        return segment.get(LAYOUT$b32, OFFSET$b32);
    }

    public void b32(@unsigned int value) {
        segment.set(LAYOUT$b32, OFFSET$b32, value);
    }

    public long i64() {
        return segment.get(LAYOUT$i64, OFFSET$i64);
    }

    public void i64(long value) {
        segment.set(LAYOUT$i64, OFFSET$i64, value);
    }

    public @unsigned long u64() {
        return segment.get(LAYOUT$u64, OFFSET$u64);
    }

    public void u64(@unsigned long value) {
        segment.set(LAYOUT$u64, OFFSET$u64, value);
    }

    public double f64() {
        return segment.get(LAYOUT$f64, OFFSET$f64);
    }

    public void f64(double value) {
        segment.set(LAYOUT$f64, OFFSET$f64, value);
    }

}

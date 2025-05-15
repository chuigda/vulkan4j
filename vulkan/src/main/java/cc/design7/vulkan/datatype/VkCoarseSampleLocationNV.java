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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleLocationNV.html">VkCoarseSampleLocationNV</a>
@ValueBasedCandidate
public record VkCoarseSampleLocationNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$pixelX = ValueLayout.JAVA_INT.withName("pixelX");
    public static final OfInt LAYOUT$pixelY = ValueLayout.JAVA_INT.withName("pixelY");
    public static final OfInt LAYOUT$sample = ValueLayout.JAVA_INT.withName("sample");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$pixelX, LAYOUT$pixelY, LAYOUT$sample);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCoarseSampleLocationNV allocate(Arena arena) {
        return new VkCoarseSampleLocationNV(arena.allocate(LAYOUT));
    }

    public static VkCoarseSampleLocationNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCoarseSampleLocationNV[] ret = new VkCoarseSampleLocationNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCoarseSampleLocationNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCoarseSampleLocationNV clone(Arena arena, VkCoarseSampleLocationNV src) {
        VkCoarseSampleLocationNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCoarseSampleLocationNV[] clone(Arena arena, VkCoarseSampleLocationNV[] src) {
        VkCoarseSampleLocationNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$pixelX = PathElement.groupElement("PATH$pixelX");
    public static final PathElement PATH$pixelY = PathElement.groupElement("PATH$pixelY");
    public static final PathElement PATH$sample = PathElement.groupElement("PATH$sample");

    public static final long SIZE$pixelX = LAYOUT$pixelX.byteSize();
    public static final long SIZE$pixelY = LAYOUT$pixelY.byteSize();
    public static final long SIZE$sample = LAYOUT$sample.byteSize();

    public static final long OFFSET$pixelX = LAYOUT.byteOffset(PATH$pixelX);
    public static final long OFFSET$pixelY = LAYOUT.byteOffset(PATH$pixelY);
    public static final long OFFSET$sample = LAYOUT.byteOffset(PATH$sample);

    public @unsigned int pixelX() {
        return segment.get(LAYOUT$pixelX, OFFSET$pixelX);
    }

    public void pixelX(@unsigned int value) {
        segment.set(LAYOUT$pixelX, OFFSET$pixelX, value);
    }

    public @unsigned int pixelY() {
        return segment.get(LAYOUT$pixelY, OFFSET$pixelY);
    }

    public void pixelY(@unsigned int value) {
        segment.set(LAYOUT$pixelY, OFFSET$pixelY, value);
    }

    public @unsigned int sample() {
        return segment.get(LAYOUT$sample, OFFSET$sample);
    }

    public void sample(@unsigned int value) {
        segment.set(LAYOUT$sample, OFFSET$sample, value);
    }

}

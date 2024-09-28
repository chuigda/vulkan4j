package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCoarseSampleLocationNV.html">VkCoarseSampleLocationNV</a>
public record VkCoarseSampleLocationNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("pixelX"),
        ValueLayout.JAVA_INT.withName("pixelY"),
        ValueLayout.JAVA_INT.withName("sample")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$pixelX = PathElement.groupElement("pixelX");
    public static final PathElement PATH$pixelY = PathElement.groupElement("pixelY");
    public static final PathElement PATH$sample = PathElement.groupElement("sample");

    public static final OfInt LAYOUT$pixelX = (OfInt) LAYOUT.select(PATH$pixelX);
    public static final OfInt LAYOUT$pixelY = (OfInt) LAYOUT.select(PATH$pixelY);
    public static final OfInt LAYOUT$sample = (OfInt) LAYOUT.select(PATH$sample);

    public static final long OFFSET$pixelX = LAYOUT.byteOffset(PATH$pixelX);
    public static final long OFFSET$pixelY = LAYOUT.byteOffset(PATH$pixelY);
    public static final long OFFSET$sample = LAYOUT.byteOffset(PATH$sample);

    public static final long SIZE$pixelX = LAYOUT$pixelX.byteSize();
    public static final long SIZE$pixelY = LAYOUT$pixelY.byteSize();
    public static final long SIZE$sample = LAYOUT$sample.byteSize();

    public VkCoarseSampleLocationNV(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkCoarseSampleLocationNV allocate(Arena arena) {
        return new VkCoarseSampleLocationNV(arena.allocate(LAYOUT));
    }
    
    public static VkCoarseSampleLocationNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCoarseSampleLocationNV[] ret = new VkCoarseSampleLocationNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCoarseSampleLocationNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

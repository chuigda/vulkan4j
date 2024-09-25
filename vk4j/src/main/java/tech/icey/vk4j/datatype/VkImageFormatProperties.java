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

public record VkImageFormatProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkExtent3D.LAYOUT.withName("maxExtent"),
        ValueLayout.JAVA_INT.withName("maxMipLevels"),
        ValueLayout.JAVA_INT.withName("maxArrayLayers"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        ValueLayout.JAVA_LONG.withName("maxResourceSize")
    );

    public static final PathElement PATH$maxExtent = PathElement.groupElement("maxExtent");
    public static final PathElement PATH$maxMipLevels = PathElement.groupElement("maxMipLevels");
    public static final PathElement PATH$maxArrayLayers = PathElement.groupElement("maxArrayLayers");
    public static final PathElement PATH$sampleCounts = PathElement.groupElement("sampleCounts");
    public static final PathElement PATH$maxResourceSize = PathElement.groupElement("maxResourceSize");

    public static final StructLayout LAYOUT$maxExtent = (StructLayout) LAYOUT.select(PATH$maxExtent);
    public static final OfInt LAYOUT$maxMipLevels = (OfInt) LAYOUT.select(PATH$maxMipLevels);
    public static final OfInt LAYOUT$maxArrayLayers = (OfInt) LAYOUT.select(PATH$maxArrayLayers);
    public static final OfInt LAYOUT$sampleCounts = (OfInt) LAYOUT.select(PATH$sampleCounts);
    public static final OfLong LAYOUT$maxResourceSize = (OfLong) LAYOUT.select(PATH$maxResourceSize);

    public static final long OFFSET$maxExtent = LAYOUT.byteOffset(PATH$maxExtent);
    public static final long OFFSET$maxMipLevels = LAYOUT.byteOffset(PATH$maxMipLevels);
    public static final long OFFSET$maxArrayLayers = LAYOUT.byteOffset(PATH$maxArrayLayers);
    public static final long OFFSET$sampleCounts = LAYOUT.byteOffset(PATH$sampleCounts);
    public static final long OFFSET$maxResourceSize = LAYOUT.byteOffset(PATH$maxResourceSize);

    public VkImageFormatProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public VkExtent3D maxExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$maxExtent, LAYOUT$maxExtent));
    }

    public void maxExtent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxExtent, LAYOUT$maxExtent.byteSize());
    }

    public @unsigned int maxMipLevels() {
        return segment.get(LAYOUT$maxMipLevels, OFFSET$maxMipLevels);
    }

    public void maxMipLevels(@unsigned int value) {
        segment.set(LAYOUT$maxMipLevels, OFFSET$maxMipLevels, value);
    }

    public @unsigned int maxArrayLayers() {
        return segment.get(LAYOUT$maxArrayLayers, OFFSET$maxArrayLayers);
    }

    public void maxArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxArrayLayers, OFFSET$maxArrayLayers, value);
    }

    public @enumtype(VkSampleCountFlags.class) int sampleCounts() {
        return segment.get(LAYOUT$sampleCounts, OFFSET$sampleCounts);
    }

    public void sampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleCounts, OFFSET$sampleCounts, value);
    }

    public @unsigned long maxResourceSize() {
        return segment.get(LAYOUT$maxResourceSize, OFFSET$maxResourceSize);
    }

    public void maxResourceSize(@unsigned long value) {
        segment.set(LAYOUT$maxResourceSize, OFFSET$maxResourceSize, value);
    }

    public static VkImageFormatProperties allocate(Arena arena) {
        return new VkImageFormatProperties(arena.allocate(LAYOUT));
    }
    
    public static VkImageFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageFormatProperties[] ret = new VkImageFormatProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageFormatProperties(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

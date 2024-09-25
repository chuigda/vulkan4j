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

public record VkPhysicalDeviceUniformBufferStandardLayoutFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("uniformBufferStandardLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$uniformBufferStandardLayout = PathElement.groupElement("uniformBufferStandardLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$uniformBufferStandardLayout = (OfInt) LAYOUT.select(PATH$uniformBufferStandardLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$uniformBufferStandardLayout = LAYOUT.byteOffset(PATH$uniformBufferStandardLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$uniformBufferStandardLayout = LAYOUT$uniformBufferStandardLayout.byteSize();

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES);
    }

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

    public @unsigned int uniformBufferStandardLayout() {
        return segment.get(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout);
    }

    public void uniformBufferStandardLayout(@unsigned int value) {
        segment.set(LAYOUT$uniformBufferStandardLayout, OFFSET$uniformBufferStandardLayout, value);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceUniformBufferStandardLayoutFeatures[] ret = new VkPhysicalDeviceUniformBufferStandardLayoutFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

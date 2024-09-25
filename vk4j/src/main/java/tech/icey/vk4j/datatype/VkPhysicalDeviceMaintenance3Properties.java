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

public record VkPhysicalDeviceMaintenance3Properties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxPerSetDescriptors = PathElement.groupElement("maxPerSetDescriptors");
    public static final PathElement PATH$maxMemoryAllocationSize = PathElement.groupElement("maxMemoryAllocationSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxPerSetDescriptors = (OfInt) LAYOUT.select(PATH$maxPerSetDescriptors);
    public static final OfLong LAYOUT$maxMemoryAllocationSize = (OfLong) LAYOUT.select(PATH$maxMemoryAllocationSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxPerSetDescriptors = LAYOUT.byteOffset(PATH$maxPerSetDescriptors);
    public static final long OFFSET$maxMemoryAllocationSize = LAYOUT.byteOffset(PATH$maxMemoryAllocationSize);

    public VkPhysicalDeviceMaintenance3Properties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES);
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

    public @unsigned int maxPerSetDescriptors() {
        return segment.get(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors);
    }

    public void maxPerSetDescriptors(@unsigned int value) {
        segment.set(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors, value);
    }

    public @unsigned long maxMemoryAllocationSize() {
        return segment.get(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize);
    }

    public void maxMemoryAllocationSize(@unsigned long value) {
        segment.set(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize, value);
    }

    public static VkPhysicalDeviceMaintenance3Properties allocate(Arena arena) {
        return new VkPhysicalDeviceMaintenance3Properties(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMaintenance3Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance3Properties[] ret = new VkPhysicalDeviceMaintenance3Properties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMaintenance3Properties(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}

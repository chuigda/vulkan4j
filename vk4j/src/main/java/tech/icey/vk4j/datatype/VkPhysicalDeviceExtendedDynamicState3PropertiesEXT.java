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

public record VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dynamicPrimitiveTopologyUnrestricted")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dynamicPrimitiveTopologyUnrestricted = PathElement.groupElement("dynamicPrimitiveTopologyUnrestricted");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dynamicPrimitiveTopologyUnrestricted = (OfInt) LAYOUT.select(PATH$dynamicPrimitiveTopologyUnrestricted);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dynamicPrimitiveTopologyUnrestricted = LAYOUT.byteOffset(PATH$dynamicPrimitiveTopologyUnrestricted);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dynamicPrimitiveTopologyUnrestricted = LAYOUT$dynamicPrimitiveTopologyUnrestricted.byteSize();

    public VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT);
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

    public @unsigned int dynamicPrimitiveTopologyUnrestricted() {
        return segment.get(LAYOUT$dynamicPrimitiveTopologyUnrestricted, OFFSET$dynamicPrimitiveTopologyUnrestricted);
    }

    public void dynamicPrimitiveTopologyUnrestricted(@unsigned int value) {
        segment.set(LAYOUT$dynamicPrimitiveTopologyUnrestricted, OFFSET$dynamicPrimitiveTopologyUnrestricted, value);
    }

    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceExtendedDynamicState3PropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExtendedDynamicState3PropertiesEXT[] ret = new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExtendedDynamicState3PropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

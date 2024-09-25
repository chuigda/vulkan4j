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

public record VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("legacyVertexAttributes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$legacyVertexAttributes = PathElement.groupElement("legacyVertexAttributes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$legacyVertexAttributes = (OfInt) LAYOUT.select(PATH$legacyVertexAttributes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$legacyVertexAttributes = LAYOUT.byteOffset(PATH$legacyVertexAttributes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$legacyVertexAttributes = LAYOUT$legacyVertexAttributes.byteSize();

    public VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT);
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

    public @unsigned int legacyVertexAttributes() {
        return segment.get(LAYOUT$legacyVertexAttributes, OFFSET$legacyVertexAttributes);
    }

    public void legacyVertexAttributes(@unsigned int value) {
        segment.set(LAYOUT$legacyVertexAttributes, OFFSET$legacyVertexAttributes, value);
    }

    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT[] ret = new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceLegacyVertexAttributesFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

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

public record VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibrary")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$graphicsPipelineLibrary = PathElement.groupElement("graphicsPipelineLibrary");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$graphicsPipelineLibrary = (OfInt) LAYOUT.select(PATH$graphicsPipelineLibrary);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$graphicsPipelineLibrary = LAYOUT.byteOffset(PATH$graphicsPipelineLibrary);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$graphicsPipelineLibrary = LAYOUT$graphicsPipelineLibrary.byteSize();

    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT);
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

    public @unsigned int graphicsPipelineLibrary() {
        return segment.get(LAYOUT$graphicsPipelineLibrary, OFFSET$graphicsPipelineLibrary);
    }

    public void graphicsPipelineLibrary(@unsigned int value) {
        segment.set(LAYOUT$graphicsPipelineLibrary, OFFSET$graphicsPipelineLibrary, value);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT[] ret = new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}

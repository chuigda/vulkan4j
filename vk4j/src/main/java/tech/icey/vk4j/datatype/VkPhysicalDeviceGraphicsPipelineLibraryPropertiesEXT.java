package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryFastLinking"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryIndependentInterpolationDecoration")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$graphicsPipelineLibraryFastLinking = PathElement.groupElement("graphicsPipelineLibraryFastLinking");
    public static final PathElement PATH$graphicsPipelineLibraryIndependentInterpolationDecoration = PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$graphicsPipelineLibraryFastLinking = (OfInt) LAYOUT.select(PATH$graphicsPipelineLibraryFastLinking);
    public static final OfInt LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration = (OfInt) LAYOUT.select(PATH$graphicsPipelineLibraryIndependentInterpolationDecoration);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$graphicsPipelineLibraryFastLinking = LAYOUT.byteOffset(PATH$graphicsPipelineLibraryFastLinking);
    public static final long OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.byteOffset(PATH$graphicsPipelineLibraryIndependentInterpolationDecoration);

    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT);
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

    public @unsigned int graphicsPipelineLibraryFastLinking() {
        return segment.get(LAYOUT$graphicsPipelineLibraryFastLinking, OFFSET$graphicsPipelineLibraryFastLinking);
    }

    public void graphicsPipelineLibraryFastLinking(@unsigned int value) {
        segment.set(LAYOUT$graphicsPipelineLibraryFastLinking, OFFSET$graphicsPipelineLibraryFastLinking, value);
    }

    public @unsigned int graphicsPipelineLibraryIndependentInterpolationDecoration() {
        return segment.get(LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration);
    }

    public void graphicsPipelineLibraryIndependentInterpolationDecoration(@unsigned int value) {
        segment.set(LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration, value);
    }


    public static final class VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXTFactory implements IFactory<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT> clazz() {
            return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXTFactory FACTORY = new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXTFactory();
}
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

public record VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("advancedBlendMaxColorAttachments"),
        ValueLayout.JAVA_INT.withName("advancedBlendIndependentBlend"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedDstColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendCorrelatedOverlap"),
        ValueLayout.JAVA_INT.withName("advancedBlendAllOperations")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$advancedBlendMaxColorAttachments = PathElement.groupElement("advancedBlendMaxColorAttachments");
    public static final PathElement PATH$advancedBlendIndependentBlend = PathElement.groupElement("advancedBlendIndependentBlend");
    public static final PathElement PATH$advancedBlendNonPremultipliedSrcColor = PathElement.groupElement("advancedBlendNonPremultipliedSrcColor");
    public static final PathElement PATH$advancedBlendNonPremultipliedDstColor = PathElement.groupElement("advancedBlendNonPremultipliedDstColor");
    public static final PathElement PATH$advancedBlendCorrelatedOverlap = PathElement.groupElement("advancedBlendCorrelatedOverlap");
    public static final PathElement PATH$advancedBlendAllOperations = PathElement.groupElement("advancedBlendAllOperations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$advancedBlendMaxColorAttachments = (OfInt) LAYOUT.select(PATH$advancedBlendMaxColorAttachments);
    public static final OfInt LAYOUT$advancedBlendIndependentBlend = (OfInt) LAYOUT.select(PATH$advancedBlendIndependentBlend);
    public static final OfInt LAYOUT$advancedBlendNonPremultipliedSrcColor = (OfInt) LAYOUT.select(PATH$advancedBlendNonPremultipliedSrcColor);
    public static final OfInt LAYOUT$advancedBlendNonPremultipliedDstColor = (OfInt) LAYOUT.select(PATH$advancedBlendNonPremultipliedDstColor);
    public static final OfInt LAYOUT$advancedBlendCorrelatedOverlap = (OfInt) LAYOUT.select(PATH$advancedBlendCorrelatedOverlap);
    public static final OfInt LAYOUT$advancedBlendAllOperations = (OfInt) LAYOUT.select(PATH$advancedBlendAllOperations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$advancedBlendMaxColorAttachments = LAYOUT.byteOffset(PATH$advancedBlendMaxColorAttachments);
    public static final long OFFSET$advancedBlendIndependentBlend = LAYOUT.byteOffset(PATH$advancedBlendIndependentBlend);
    public static final long OFFSET$advancedBlendNonPremultipliedSrcColor = LAYOUT.byteOffset(PATH$advancedBlendNonPremultipliedSrcColor);
    public static final long OFFSET$advancedBlendNonPremultipliedDstColor = LAYOUT.byteOffset(PATH$advancedBlendNonPremultipliedDstColor);
    public static final long OFFSET$advancedBlendCorrelatedOverlap = LAYOUT.byteOffset(PATH$advancedBlendCorrelatedOverlap);
    public static final long OFFSET$advancedBlendAllOperations = LAYOUT.byteOffset(PATH$advancedBlendAllOperations);

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT);
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

    public @unsigned int advancedBlendMaxColorAttachments() {
        return segment.get(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments);
    }

    public void advancedBlendMaxColorAttachments(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments, value);
    }

    public @unsigned int advancedBlendIndependentBlend() {
        return segment.get(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend);
    }

    public void advancedBlendIndependentBlend(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend, value);
    }

    public @unsigned int advancedBlendNonPremultipliedSrcColor() {
        return segment.get(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor);
    }

    public void advancedBlendNonPremultipliedSrcColor(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor, value);
    }

    public @unsigned int advancedBlendNonPremultipliedDstColor() {
        return segment.get(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor);
    }

    public void advancedBlendNonPremultipliedDstColor(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor, value);
    }

    public @unsigned int advancedBlendCorrelatedOverlap() {
        return segment.get(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap);
    }

    public void advancedBlendCorrelatedOverlap(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap, value);
    }

    public @unsigned int advancedBlendAllOperations() {
        return segment.get(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations);
    }

    public void advancedBlendAllOperations(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations, value);
    }


    public static final class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXTFactory implements IFactory<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> clazz() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceBlendOperationAdvancedPropertiesEXTFactory FACTORY = new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXTFactory();
}
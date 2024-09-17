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

public record VkImageAlignmentControlCreateInfoMESA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maximumRequestedAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maximumRequestedAlignment = PathElement.groupElement("maximumRequestedAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maximumRequestedAlignment = (OfInt) LAYOUT.select(PATH$maximumRequestedAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maximumRequestedAlignment = LAYOUT.byteOffset(PATH$maximumRequestedAlignment);

    public VkImageAlignmentControlCreateInfoMESA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA);
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

    public @unsigned int maximumRequestedAlignment() {
        return segment.get(LAYOUT$maximumRequestedAlignment, OFFSET$maximumRequestedAlignment);
    }

    public void maximumRequestedAlignment(@unsigned int value) {
        segment.set(LAYOUT$maximumRequestedAlignment, OFFSET$maximumRequestedAlignment, value);
    }


    public static final class VkImageAlignmentControlCreateInfoMESAFactory implements IFactory<VkImageAlignmentControlCreateInfoMESA> {
        @Override
        public Class<VkImageAlignmentControlCreateInfoMESA> clazz() {
            return VkImageAlignmentControlCreateInfoMESA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageAlignmentControlCreateInfoMESA.LAYOUT;
        }

        @Override
        public VkImageAlignmentControlCreateInfoMESA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageAlignmentControlCreateInfoMESA createUninit(MemorySegment segment) {
            return new VkImageAlignmentControlCreateInfoMESA(segment);
        }
    }

    public static final VkImageAlignmentControlCreateInfoMESAFactory FACTORY = new VkImageAlignmentControlCreateInfoMESAFactory();
}

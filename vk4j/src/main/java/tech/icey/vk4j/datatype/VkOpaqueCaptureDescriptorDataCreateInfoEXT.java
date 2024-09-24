package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkOpaqueCaptureDescriptorDataCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("opaqueCaptureDescriptorData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$opaqueCaptureDescriptorData = PathElement.groupElement("opaqueCaptureDescriptorData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$opaqueCaptureDescriptorData = (AddressLayout) LAYOUT.select(PATH$opaqueCaptureDescriptorData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$opaqueCaptureDescriptorData = LAYOUT.byteOffset(PATH$opaqueCaptureDescriptorData);

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment opaqueCaptureDescriptorData() {
        return segment.get(LAYOUT$opaqueCaptureDescriptorData, OFFSET$opaqueCaptureDescriptorData);
    }

    public void opaqueCaptureDescriptorData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$opaqueCaptureDescriptorData, OFFSET$opaqueCaptureDescriptorData, value);
    }


    public static final class Factory implements IFactory<VkOpaqueCaptureDescriptorDataCreateInfoEXT> {
        @Override
        public Class<VkOpaqueCaptureDescriptorDataCreateInfoEXT> clazz() {
            return VkOpaqueCaptureDescriptorDataCreateInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkOpaqueCaptureDescriptorDataCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}

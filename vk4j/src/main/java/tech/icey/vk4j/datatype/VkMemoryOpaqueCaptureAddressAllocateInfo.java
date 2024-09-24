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

public record VkMemoryOpaqueCaptureAddressAllocateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("opaqueCaptureAddress")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$opaqueCaptureAddress = PathElement.groupElement("opaqueCaptureAddress");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$opaqueCaptureAddress = (OfLong) LAYOUT.select(PATH$opaqueCaptureAddress);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$opaqueCaptureAddress = LAYOUT.byteOffset(PATH$opaqueCaptureAddress);

    public VkMemoryOpaqueCaptureAddressAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO);
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

    public @unsigned long opaqueCaptureAddress() {
        return segment.get(LAYOUT$opaqueCaptureAddress, OFFSET$opaqueCaptureAddress);
    }

    public void opaqueCaptureAddress(@unsigned long value) {
        segment.set(LAYOUT$opaqueCaptureAddress, OFFSET$opaqueCaptureAddress, value);
    }


    public static final class VkMemoryOpaqueCaptureAddressAllocateInfoFactory implements IFactory<VkMemoryOpaqueCaptureAddressAllocateInfo> {
        @Override
        public Class<VkMemoryOpaqueCaptureAddressAllocateInfo> clazz() {
            return VkMemoryOpaqueCaptureAddressAllocateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMemoryOpaqueCaptureAddressAllocateInfo.LAYOUT;
        }

        @Override
        public VkMemoryOpaqueCaptureAddressAllocateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMemoryOpaqueCaptureAddressAllocateInfo createUninit(MemorySegment segment) {
            return new VkMemoryOpaqueCaptureAddressAllocateInfo(segment);
        }
    }

    public static final VkMemoryOpaqueCaptureAddressAllocateInfoFactory FACTORY = new VkMemoryOpaqueCaptureAddressAllocateInfoFactory();
}

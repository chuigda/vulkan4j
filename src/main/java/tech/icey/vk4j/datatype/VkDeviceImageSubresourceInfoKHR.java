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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceImageSubresourceInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT).withName("pCreateInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource2KHR.LAYOUT).withName("pSubresource")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement(2);
    public static final PathElement PATH$pSubresource = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pCreateInfo = (AddressLayout) LAYOUT.select(PATH$pCreateInfo);
    public static final AddressLayout LAYOUT$pSubresource = (AddressLayout) LAYOUT.select(PATH$pSubresource);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);
    public static final long OFFSET$pSubresource = LAYOUT.byteOffset(PATH$pSubresource);

    public VkDeviceImageSubresourceInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO_KHR);
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

    public @pointer(comment="VkImageCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkImageCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }
    
    public VkImageCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageCreateInfo(s);
    }

    public void pCreateInfo(VkImageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCreateInfoRaw(s);
    }

    public @pointer(comment="VkImageSubresource2KHR*") MemorySegment pSubresourceRaw() {
        return segment.get(LAYOUT$pSubresource, OFFSET$pSubresource);
    }

    public void pSubresourceRaw(@pointer(comment="VkImageSubresource2KHR*") MemorySegment value) {
        segment.set(LAYOUT$pSubresource, OFFSET$pSubresource, value);
    }
    
    public VkImageSubresource2KHR pSubresource() {
        MemorySegment s = pSubresourceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageSubresource2KHR(s);
    }

    public void pSubresource(VkImageSubresource2KHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubresourceRaw(s);
    }


    public static final class VkDeviceImageSubresourceInfoKHRFactory implements IDataTypeFactory<VkDeviceImageSubresourceInfoKHR> {
        @Override
        public Class<VkDeviceImageSubresourceInfoKHR> clazz() {
            return VkDeviceImageSubresourceInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceImageSubresourceInfoKHR.LAYOUT;
        }

        @Override
        public VkDeviceImageSubresourceInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceImageSubresourceInfoKHR createUninit(MemorySegment segment) {
            return new VkDeviceImageSubresourceInfoKHR(segment);
        }
    }

    public static final VkDeviceImageSubresourceInfoKHRFactory FACTORY = new VkDeviceImageSubresourceInfoKHRFactory();
}